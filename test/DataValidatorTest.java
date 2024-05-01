import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class DataValidatorTest {

    @Test
    public void testValidatePhoneNumber(){
      String phoneNumber = "";
      boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
      assertFalse(isPhoneNumberValid);
    }
    @Test
    public void testValidatePhoneNumber2(){
        String phoneNumber = "+2349082957925";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);
    }
    @Test
    public void testValidatePhoneNumber3(){
        String phoneNumber = "+23456789098";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse(isPhoneNumberValid);
    }
    @Test
    public void testValidatePhoneNumber4(){
        String phoneNumber = "2345678909876777";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse(isPhoneNumberValid);
    }
    @Test
    public void testValidatePhoneNumber5(){
        String phoneNumber = "+2345678909876777";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse(isPhoneNumberValid);
    }
    @Test
    public void testValidatePhoneNumber6(){
        String phoneNumber = "2345678909876";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse(isPhoneNumberValid);
    }
    @Test
    public void testValidatePhoneNumber7(){
        String phoneNumber = "+2349082.957925";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse(isPhoneNumberValid);
    }
    @Test
    public void testValidatePhoneNumber8(){
        String phoneNumber = "9082957925";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);
    }
    @Test
    public void testValidateEmailAddress(){
        String email = "";
        boolean isEmailValid = DataValidator.isEmailValid(email);
        assertFalse(isEmailValid);
    }
    @Test
    public void testValidateEmailAddress2(){
        String email = "a.omoniyi@semicolon.africa";
        boolean isEmailSemicolonValid = DataValidator.isEmailSemicolonValid(email);
        assertTrue(isEmailSemicolonValid);
    }
    @Test
    public void testValidateEmailAddress3(){
        String email = "ashley@semicolon.africa";
        boolean isEmailSemicolonValid = DataValidator.isEmailSemicolonValid(email);
        assertTrue(isEmailSemicolonValid);
    }
    @Test
    public void testValidateEmailAddress4(){
        String email = "ASHLEY@semicolon.africa";
        boolean isEmailSemicolonValid = DataValidator.isEmailSemicolonValid(email);
        assertTrue(isEmailSemicolonValid);
    }
}