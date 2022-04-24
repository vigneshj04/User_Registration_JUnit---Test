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

}