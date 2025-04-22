package rocks.zipcode.Tapr;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private long phoneNumber;
    private ArrayList<Device> devicesOnProfile = new ArrayList<>();

    public User() {
        // Default constructor
    }
    public User(int ID, String userName, String email, String firstName, String lastName, String password, int phoneNumber, ArrayList<Device> devicesOnProfile) {
        this.ID = ID;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.devicesOnProfile = new ArrayList<>(){};
    }

    @Override
    public String toString() {
        return String.format(
                "User [ID=%d, User Name=%s, E-mail=%s, First Name=%s, Last Name=%s, Password=%s, Phone=%d, Devices On Profile=%s]",
                ID, userName, email, firstName, lastName, password, phoneNumber, devicesOnProfile.add(new Device()));
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Device> getDevicesOnProfile() {
        return devicesOnProfile;
    }

    public void setDevicesOnProfile(String[] devicesOnProfile) {
        this.devicesOnProfile = new ArrayList<>();
    }
}