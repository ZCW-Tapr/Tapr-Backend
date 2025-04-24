package rocks.zipcode.Tapr.User;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "User Assets")
public class User_Assets {

    @Id
    @GeneratedValue
    @Column(name = "ID", nullable = false, unique = true)
    private int UserID;

    @Column(name = "Device ID", nullable = false)
    private int DeviceID;

    @Column(name = "Date of Service", nullable = true)
    private Date dateOfService;

    @Column(name = "Location Name", nullable = true, length = 30)
    private String locationName;

    @Column(name = "Serial Number", nullable = true)
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
