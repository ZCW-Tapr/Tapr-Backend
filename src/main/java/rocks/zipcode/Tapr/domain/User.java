package rocks.zipcode.Tapr.domain;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long id;


//    @Column(name = "user_name", nullable = false, length = 30)
    private String userName;

//    @Column(name = "first_name", nullable = false, length = 30)
    private String firstName;

//    @Column(name = "last_name", nullable = false, length = 30)
    private String lastName;

//    @Column(name = "e-mail", nullable = false, length = 50)
    private String email;

//    @Column(name = "password", nullable = false, length = 30)
    private String password;

//    @Column(name = "phone_number", nullable = true, length = 15)
    private String phoneNumber;

    @Autowired
    public User() {
        // Default constructor
    }

    public User(String userName, String email, String firstName, String lastName, String password, String phoneNumber) {
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

    public Long getID() {
        return id;
    }

    public void setID(Long id) {
        this.id = id;
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

/*
Minor Suggestions for Later
- Field Naming Consistency: Column names like "User_name" or
"First name" have spaces, which might complicate MySQL queries later. A cleaner approach:
@Column(name = "user_name") - Done

- Password Security: If you move toward authentication,
you’ll want to hash the password using BCryptPasswordEncoder before saving it.
*/