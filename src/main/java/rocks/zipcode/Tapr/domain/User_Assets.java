package rocks.zipcode.Tapr.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "user_assets")
public class User_Assets {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DEVICE_ID")
    private int userDeviceId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "device_id")
    private Devices device;

    @Column(name = "date_of_service", nullable = false, length = 30)
    private String dateOfService;

    @Column(name = "location_name", nullable = false, length = 30)
    private String locationName;

    @Column(name = "serial_number", nullable = false, length = 30)
    private String serialNumber;

    public User_Assets() {
        // Default constructor
    }
    public User_Assets(User user,  Devices device, String dateOfService, String locationName, String serialNumber) {
        this.user = user;
        this.device = device;
        this.dateOfService = dateOfService;
        this.locationName = locationName;
        this.serialNumber = serialNumber;
    }

    public int getAssetId(){
        return userDeviceId;
    }

    public void setAssetId(int assetId){
        this.userDeviceId = assetId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Devices getDevice() {
        return device;
    }

    public void setDevice(Devices device) {
        this.device = device;
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

/* Suggestions for Strengthening

- 🧼 Consider renaming "User Assets" table to user_assets or user_assets_table—spaces in table names can cause headaches in MySQL and SQL joins later.
- 💡 Introduce foreign key relationships soon:
@ManyToOne
@JoinColumn(name = "user_id")
private User user;
- This will let you directly link assets to user profiles and simplify gesture mapping per user.
- 📆 If dateOfService might use actual date logic later, swap from String to LocalDate or Date (you’ve already imported java.util.Date!).
*/

//Done