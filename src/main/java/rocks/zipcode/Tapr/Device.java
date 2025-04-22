package rocks.zipcode.Tapr;

public class Device {
    private int ID;
    private int categoryID;
    private String categoryName;




    public Device(int ID, int categoryID, String categoryName) {
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
    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}