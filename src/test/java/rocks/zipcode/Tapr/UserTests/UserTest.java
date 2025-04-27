package rocks.zipcode.Tapr.UserTests;
import org.junit.jupiter.api.Test;

import rocks.zipcode.Tapr.User.User;

import static org.testng.AssertJUnit.assertEquals;

public class UserTest  {
    User user = new User();

    @Test
    public void testGetID() {
        //given
        int ID = 1;
        user.setID(ID);
        assertEquals(ID, user.getID());
    }

    @Test
    public void testTestGetUserName() {
        //given
        String name = "JohnD1234";
        user.setUserName(name);
        assertEquals(name, user.getUserName());
    }

    @Test
    public void testGetEmail() {
        String email = "john.Doe@gmail.com";
        user.setEmail(email);
        assertEquals(email, user.getEmail());
    }

    @Test
    public void testFirstName() {
        String firstName = "John";
        user.setFirstName(firstName);
        assertEquals(firstName, user.getFirstName());
    }

    @Test
    public void testLastName() {
        String lastName = "Doe";
        user.setLastName(lastName);
        assertEquals(lastName, user.getLastName());
    }

    @Test
    public void testGetPassword() {
        String password = "password123";
        user.setPassword(password);
        assertEquals(password, user.getPassword());
    }

    @Test
    public void testGetPhone() {
        String phone = "302-774-7890";
        user.setPhoneNumber(phone);
        assertEquals(phone, user.getPhoneNumber());
    }
}