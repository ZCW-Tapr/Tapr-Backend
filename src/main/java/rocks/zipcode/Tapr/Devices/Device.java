package rocks.zipcode.Tapr.Devices;

public class Device {
    private int ID;
    private String brandName;
    private String modelName;
    private String modelNumber;
    private String color;
    private String categoryName;
    private String UPC;
    private int yearManufactured;



    private String location;

    public Device(int ID, String brandName, String modelName, String modelNumber, String color, String categoryName, String UPC, int yearManufactured) {
        this.ID = ID;
        this.brandName = brandName;
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.color = color;
        this.categoryName = categoryName;
        this.UPC = UPC;
        this.yearManufactured = yearManufactured;
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

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getUPC() {
        return UPC;
    }

    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

    public int getYearManufactured() {
        return yearManufactured;
    }

    public void setYearManufactured(int yearManufactured) {
        this.yearManufactured = yearManufactured;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}