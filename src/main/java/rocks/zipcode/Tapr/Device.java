package rocks.zipcode.Tapr;

public class Device {
    private int ID;
    private String categoryID;
    private String categoryName;




    public Device(int ID, String categoryID, String categoryName) {
        this.ID = ID;
        this.categoryID = categoryID;
        this.categoryName = categoryName;

    }

    public Device() {
        // Default constructor
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}