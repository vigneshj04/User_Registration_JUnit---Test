import com.sun.net.httpserver.Authenticator;
import org.junit.runner.JUnitCore;

import javax.xml.transform.Result;

public class EmailTest {
    public static void main(String[] args) {
        Result result = (Result) JUnitCore.runClasses(EmailValidationTest.class);

        for (Authenticator.Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}