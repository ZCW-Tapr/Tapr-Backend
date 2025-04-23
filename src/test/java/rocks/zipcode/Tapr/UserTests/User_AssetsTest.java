package rocks.zipcode.Tapr.UserTests;

import org.junit.jupiter.api.Test;
import rocks.zipcode.Tapr.User.User_Assets;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class User_AssetsTest {
    User_Assets user_assets = new User_Assets();

    @Test
    void getUserID() {
        //given
        int userID = 1;
        user_assets.setUserID(userID);
        assertEquals(userID, user_assets.getUserID());
    }

    @Test
    void getDeviceID() {
        //given
        int deviceID = 2;
        user_assets.setDeviceID(deviceID);
        assertEquals(deviceID, user_assets.getDeviceID());
    }

    @Test
    void getDateOfService() {
        //given
        Date dateOfService = new Date();
        user_assets.setDateOfService(dateOfService);
        assertEquals(dateOfService, user_assets.getDateOfService());
    }

    @Test
    void getLocationName() {
        //given
        String locationName = "Living Room";
        user_assets.setLocationName(locationName);
        assertEquals(locationName, user_assets.getLocationName());
    }

    @Test
    void getSerialNumber() {
        //given
        int serialNumber = 123456;
        user_assets.setSerialNumber(serialNumber);
        assertEquals(serialNumber, user_assets.getSerialNumber());
    }
}