package rocks.zipcode.Tapr.User_Assets;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "User Assets")
public class User_Assets {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Device ID", nullable = false)
    private int DeviceID;

    @Column(name = "Date of Service", nullable = false, length = 30)
    private String dateOfService;

    @Column(name = "Location Name", nullable = false, length = 30)
    private String locationName;

    @Column(name = "Serial Number", nullable = false, length = 30)
    private String serialNumber;

    public User_Assets(int deviceID, String dateOfService, String locationName, String serialNumber) {
        //UserID = userID;
        this.DeviceID = deviceID;
        this.dateOfService = dateOfService;
        this.locationName = locationName;
        this.serialNumber = serialNumber;
    }

    public User_Assets() {
        // Default constructor
    }

//    public int getUserID() {
//        return UserID;
//    }

//    public void setUserID(int userID) {
//        UserID = userID;
//    }

    public int getDeviceID() {
        return DeviceID;
    }

    public void setDeviceID(int deviceID) {
        DeviceID = deviceID;
    }

    public String getDateOfService() {
        return dateOfService;
    }

    public void setDateOfService(String dateOfService) {
        this.dateOfService = dateOfService;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
