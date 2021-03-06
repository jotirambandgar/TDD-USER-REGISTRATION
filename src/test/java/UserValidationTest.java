import com.bridgelabz.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

    private UserRegistration userRegistration = new UserRegistration();

    @Test
    public void whenGivenFirstNameWith1stLetterCap_shouldReturnTrue() {

        boolean validationStatus = userRegistration.firstNameValidation("Jotiram");
        Assert.assertEquals(true,validationStatus);
    }

    @Test
    public void whenGivenFirstNameContainNumber_shouldReturnFalse() {

        boolean validationStatus = userRegistration.firstNameValidation("Jotiram12");
        Assert.assertEquals(false,validationStatus);
    }

    @Test
    public void whenGivenFirstNameStartWithSmallLetter_shouldReturnFale() {
        boolean validationStatus = userRegistration.firstNameValidation("jotiram");
        Assert.assertFalse(validationStatus);
    }

    @Test
    public void whenGivenFirstNameLengthLessThan3_sholdReturnFalse() {
        boolean validationStatus = userRegistration.firstNameValidation("Jo");
        Assert.assertFalse(validationStatus);
    }

    @Test
    public void whenGivenFirstNameLengthGreaterThan3_shouldReturnTrue() {
        boolean validationStatus = userRegistration.firstNameValidation("Jotiram");
        Assert.assertTrue(validationStatus);
    }

     @Test
    public void whenGivenLastNameWith1stLetterCap_shouldReturnTrue() {

        boolean validationStatus = userRegistration.lastNameValidation("Bandgar");
        Assert.assertEquals(true,validationStatus);
    }

    @Test
    public void whenGivenLastNameStartWithSmallLetter_shouldReturnFale() {

        boolean validationStatus = userRegistration.lastNameValidation("bandgar");
        Assert.assertFalse(validationStatus);

    }

    @Test
    public void whenGivenLastNameLengthLessThan3_sholdReturnFalse() {

        boolean validationStatus = userRegistration.lastNameValidation("Ba");
        Assert.assertFalse(validationStatus);

    }

    @Test
    public void whenGivenLastNameLengthGreaterThan3_shouldReturnTrue() {

        boolean validationStatus = userRegistration.lastNameValidation("Bandg");
        Assert.assertTrue(validationStatus);

    }

    @Test
    public void whenGivenEmailIdWithThreeMandatoryPart_shouldReturnTrue() {

        boolean validationStatus = userRegistration.emailIdValidation("abc@bridgelabz.com");
        Assert.assertEquals(true,validationStatus);

    }

    @Test
    public void whenGivenEmailIdWithOptionalPart_shouldReturnTrue() {

        boolean validationStatus = userRegistration.emailIdValidation("abc.bcd@gmail.co.in");
        Assert.assertEquals(true,validationStatus);

    }

    @Test
    public void whenGivenMobileNumberWithCountryCode_shouldReturnTrue() {

        boolean validationStatus = userRegistration.mobileNumberValidation("91 1234567890");
        Assert.assertEquals(true,validationStatus);

    }

    @Test
    public void whenGivenMobileNumberWithLengthLessThan10_shouldReturnFalse() {

        boolean validationStatus = userRegistration.mobileNumberValidation("91 12345789");
        Assert.assertFalse(validationStatus);

    }

    @Test
    public void whenGivenMobileNumberContainsLetter_shouldReturnFalse() {

        boolean validationStatus = userRegistration.mobileNumberValidation("91 123457A89");
        Assert.assertFalse(validationStatus);

    }

    @Test
    public void whenGivenMobileNumberWithoutSpaceAfterCountryCode_sholdReturnFalse() {

        boolean validationStatus = userRegistration.mobileNumberValidation("911234567890");
        Assert.assertFalse(validationStatus);

    }

    @Test
    public void whenGivenPasswordConatinMinEightCharacter_shouldReturnTrue() {

        boolean validationStatus = userRegistration.passworValidation("Bridgelabz@1");
        Assert.assertTrue(validationStatus);

    }

    @Test
    public void whenGivenPasswordConatinLessThanEightCharacter_shouldReturnFalse() {

        boolean validationStatus = userRegistration.passworValidation("Bridgee");
        Assert.assertFalse(validationStatus);

    }

    @Test
    public void whenGivenPasswordContainAllSmallLatter_shouldReturnFalse() {
        boolean validationStatus = userRegistration.passworValidation("bridgeelabz@1");
        Assert.assertFalse(validationStatus);
    }

    @Test
    public void whenGivenPasswordNotConatinAnyNumber_shouldReturnFalse() {

        boolean validationStatus = userRegistration.passworValidation("Bridelabz@");
        Assert.assertEquals(false,validationStatus);

    }

}
