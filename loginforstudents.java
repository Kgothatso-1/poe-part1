public class loginforstudents{

    private String username;
    private String userpassword;
    private String usernumber;


    public loginforstudents(String username, String userpassword, String usernumber) {
        this.username = username;
        this.userpassword= userpassword;
        this.usernumber = usernumber;

    }

    // 1. Username check
    public boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
    }

    // 2. Password complexity check
    public boolean checkPasswordComplexity() {
        return userpassword.matches("^(?=.[A-Z])(?=.[0-9])(?=.[@#$%^&+=!?.]).{8,}$");
    }

    // 3. Cellphone check
    public boolean checkCellPhoneNumber() {
        return usernumber.matches("^\\+27\\d{9}$");
    }

    // 4. Register user
    public String registerUser() {
        if (!checkUserName()) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";
        }
        if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
        if (!checkCellPhoneNumber()) {
            return "Cell phone number incorrectly formatted or does not contain international code.";
        }
        return "User registered successfully.";
    }

    // 5. Login check
    public boolean loginUser(String inputUser, String inputPass) {
        return this.username.equals(inputUser) && this.userpassword.equals(inputPass);
    }

    // 6. Return login status
    public String returnLoginStatus(boolean loginSuccess) {
        if (loginSuccess) {
            return "Welcome " + username + ".  it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }

}}














































































































































































































































