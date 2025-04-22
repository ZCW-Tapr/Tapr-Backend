package rocks.zipcode.Tapr;
import org.testng.annotations.Test;

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
    public void testTestGetName() {
        //given
        String name = "John Doe";
        user.setName(name);
        assertEquals(name, user.getName());
    }

    @Test
    public void testGetEmail() {
        String email = "john.Doe@gmail.com";
        user.setEmail(email);
        assertEquals(email, user.getEmail());
    }

    @Test
    public void testGetPassword() {
        String password = "password123";
        user.setPassword(password);
        assertEquals(password, user.getPassword());
    }

    @Test
    public void testGetPhone() {
        int phone = 302-774-7890;
        user.setPhone(phone);
        assertEquals(phone, user.getPhone());
    }

    @Test
    public void testGetDevicesOnProfile() {
        String[] devicesOnProfile = {"LIFX Bulb", "Google Nest", "Garage Door Opener", "LIFX Smart Strip"};
        user.setDevicesOnProfile((devicesOnProfile));
        assertEquals((devicesOnProfile), user.getDevicesOnProfile());
    }
}