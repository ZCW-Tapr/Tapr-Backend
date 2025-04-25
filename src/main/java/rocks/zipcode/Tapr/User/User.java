package rocks.zipcode.Tapr.User;

import jakarta.persistence.*;

import rocks.zipcode.Tapr.Devices.Device;

import java.util.ArrayList;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false, unique = true)
    private int ID;

    @Column(name = "User name", nullable = false, length = 30)
    private String userName;

    @Column(name = "First name", nullable = false, length = 30)
    private String firstName;

    @Column(name = "Last name", nullable = false, length = 30)
    private String lastName;

    @Column(name = "E-mail", nullable = false, length = 50)
    private String email;

    @Column(name = "Password", nullable = false, length = 30)
    private String password;

    @Column(name = "Phone Number", nullable = true, length = 15)
    private String phoneNumber;

    public User() {
        // Default constructor
    }

    public User(int ID, String userName, String email, String firstName, String lastName, String password, String phoneNumber) {
        this.ID = ID;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

//    @Override
//    public String toString() {
//        return String.format(
//                "User [ID=%d, User Name=%s, E-mail=%s, First Name=%s, Last Name=%s, Password=%s, Phone=%d, Devices On Profile=%s]",
//                ID, userName, email, firstName, lastName, password, phoneNumber);
//    }

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}