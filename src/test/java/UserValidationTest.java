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

}
