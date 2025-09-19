import static org.junit.Assert.*;
import org.junit.Test;

public class test {
    @Test
    public void testusernamecorrectlyformatted() {
        loginforstudents user = new loginforstudents("ky_le", "Password1!", "+27123456789");
        assertTrue(user.checkUserName());
    }

    @Test
    public void testusernameIncorrectlyformatted() {
        loginforstudents user = new loginforstudents("kyle", "Password1!", "+27123456789");
        assertFalse(user.checkUserName());
    }

    @Test
    public void testuserpasswordmeetsrequirements() {
        loginforstudents user = new loginforstudents("ky_le", "Password1!", "+27123456789");
        assertTrue(user.checkPasswordComplexity());
    }

    @Test
    public void testuserpassworddoesnotmeetrequirement() {
        loginforstudents user = new loginforstudents("ky_le", "password", "+27123456789");
        assertFalse(user.checkPasswordComplexity());
    }

    @Test
    public void testusernumber() {
        loginforstudents user = new loginforstudents("ky_le", "Password1!", "+27123456789");
        assertTrue(user.checkCellPhoneNumber());
    }

    @Test
    public void testusernumberincorrectformat() {
        loginforstudents user = new loginforstudents("ky_le", "Password1!", "1234567890");
        assertFalse(user.checkCellPhoneNumber());
    }

    @Test
    public void testloginsuccessful() {
        loginforstudents user = new loginforstudents("ky_le", "Password1!", "+27123456789");
        assertTrue(user.loginUser("ky_le", "Password1!"));
    }

    @Test
    public void testloginfailed() {
        loginforstudents user = new loginforstudents("ky_le", "Password1!", "+27123456789");
        assertFalse(user.loginUser("wrong", "wrong"));
    }
}