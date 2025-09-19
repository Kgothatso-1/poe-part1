import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // prompting user
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String userpassword = sc.nextLine();

        System.out.print("Enter South African cell phone number: ");
        String usernumber = sc.nextLine();

        // user object
        loginforstudents user = new loginforstudents(username, userpassword, usernumber);
       //deepseekai was used to get the following codes
        // Check registration
        String registrationResult = user.registerUser();
        System.out.println(registrationResult);

        if (registrationResult.equals("User registered successfully.")) {
            // Login
            System.out.println("LOGIN");
            System.out.println("Enter username: ");
            String loginUser = sc.nextLine();

            System.out.println("Enter password: ");
            String loginpass = sc.nextLine();

            boolean success = user.loginUser(loginUser, loginpass);
            System.out.println(user.returnLoginStatus(success));
        }

        sc.close();
    }
}

