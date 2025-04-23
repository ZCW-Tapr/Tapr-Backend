package rocks.zipcode.Tapr.User;

import java.util.Date;

public class User_Assets {
    private int UserID;
    private int DeviceID;
    private Date dateOfService;
    private String locationName;
    private int serialNumber;

    public User_Assets(int userID, int deviceID, Date dateOfService, String locationName, int serialNumber) {
        UserID = userID;
        DeviceID = deviceID;
        this.dateOfService = dateOfService;
        this.locationName = locationName;
        this.serialNumber = serialNumber;
    }

    public User_Assets() {
        // Default constructor
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public int getDeviceID() {
        return DeviceID;
    }

    public void setDeviceID(int deviceID) {
        DeviceID = deviceID;
    }

    public Date getDateOfService() {
        return dateOfService;
    }

    public void setDateOfService(Date dateOfService) {
        this.dateOfService = dateOfService;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}
