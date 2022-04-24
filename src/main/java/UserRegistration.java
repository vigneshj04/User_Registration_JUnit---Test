import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {


    Scanner scanner = new Scanner(System.in);
    UserDetails userDetails = new UserDetails();

    public void addUser() {
        int choice = 0;
        do {
            System.out.println("1. First Name\n0. Exit");
            System.out.println("Enter choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    String firstName = stringInput("Enter First Name");
                    addFirstName(firstName);
                    break;

                case 0:
                    break;
            }
        } while (choice != 0);
    }

    private String stringInput(String msg) {
        System.out.println(msg);
        String strData = scanner.next();
        return strData;
    }

    private Number integerInput(String msg) {
        System.out.println(msg);
        Number numberData = scanner.nextBigInteger();
        return numberData;
    }

    public boolean addFirstName(String firstName) {
        boolean isFirstName = Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
        if (isFirstName) {
            userDetails.setFirstName(firstName);
            return true;
        } else {
            System.out.println("Please check First Name");
            return false;
        }
    }
}