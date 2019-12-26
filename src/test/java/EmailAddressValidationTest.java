import com.bridgelabz.UserRegistration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

@RunWith(Parameterized.class)
public class EmailAddressValidationTest {

    private String emailId;
    private boolean expectedResult;
    private UserRegistration userRegistration;

    public EmailAddressValidationTest(String emailId, boolean expectedResult) {

        this.emailId = emailId;
        this.expectedResult=expectedResult;


    }

    @Before
    public void initialization(){
        this.userRegistration=new UserRegistration();
    }
    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][]{{"abc@yahoo.com",true},
        {"abc-100@yahoo.com",true},
        {"abc.100@yahoo.com",true},
        {"abc111@abc.com",true},
        {"abc-100@abc.net",true},
        {"abc.100@abc.com.au",true},
        {"abc@1.com",false},
        {"abc@gmail.com.com",true},
        {"abc-gmail.com",false},
        {"abc@.com.my",false},
        {"abc123@gmail.a",false},
        {"abc123@.com",false},
        {"abc123@.com.com",false},
        {".abc@abc.com",false},
        {"abc()*@gmail.com",false},
        {"abc@%*.com",false},
        {"abc@abc@gmail.com",false},
        {"abc@gmail.com.1a",false},
        {"abc@gmail.com.aa.au",false}});
    }

    @Test
    public void testEmailIdValidation() {
        boolean validationStatus = userRegistration.emailIdValidation(emailId);
        if(validationStatus == false) {
            System.out.println(emailId);
        }
        Assert.assertEquals(expectedResult,validationStatus);
    }
}
