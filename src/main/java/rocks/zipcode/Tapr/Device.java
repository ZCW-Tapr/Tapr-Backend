package rocks.zipcode.Tapr;

public class Device {
    private int ID;
    private String brand;
    private String model;
    private String modelNumber;
    private String categoryID;
    private String categoryName;
    private long UPC = Long.MAX_VALUE;
    private int manufacturerYear;



    public Device(int ID, String brand, String model, String categoryID, String categoryName, int UPC, int manufacturerYear) {
        this.ID = ID;
        this.brand = brand;
        this.model = model;
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.UPC = UPC;
        this.manufacturerYear = manufacturerYear;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
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

    public long getUPC() {
        return UPC;
    }

    public void setUPC(long UPC) {
        this.UPC = UPC;
    }

    public int getManufacturerYear() {
        return manufacturerYear;
    }

    public void setManufacturerYear(int manufacturerYear) {
        this.manufacturerYear = manufacturerYear;
    }
}