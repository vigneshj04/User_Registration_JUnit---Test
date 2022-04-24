import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    void givenFirstName_WhenProperFirstName_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addFirstName("Rajesh");
        Assertions.assertTrue(result);
    }

    @Test
    void givenFirstName_WhenNotProperFirstName_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addFirstName("rajesh");
        Assertions.assertFalse(result);
    }

    @Test
    void givenFirstName_WhenProperLastName_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addLastName("Kumar");
        Assertions.assertTrue(result);
    }

    @Test
    void givenFirstName_WhenNotProperLastName_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addLastName("kumar");
        Assertions.assertFalse(result);
    }

    @Test
    void givenFirstName_WhenProperEmailId_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addEmail("abc.100@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    void givenFirstName_WhenNotProperEmailId_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addEmail("abc.100@g.c");
        Assertions.assertFalse(result);
    }

    @Test
    void givenFirstName_WhenProperPhoneNumber_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addPhoneNumber("91 9876543210");
        Assertions.assertTrue(result);
    }

    @Test
    void givenFirstName_WhenNotProperPhoneNumber_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addPhoneNumber("9199342348232");
        Assertions.assertFalse(result);
    }

    @Test
    void givenFirstName_WhenProperPassword_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addPassword("aassdasd");
        Assertions.assertTrue(result);
    }

    @Test
    void givenFirstName_WhenNotProperPassword_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.addPassword("aasas");
        Assertions.assertFalse(result);
    }
}