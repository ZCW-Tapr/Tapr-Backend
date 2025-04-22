package rocks.zipcode.Tapr;

public class Smart_GarageDoors extends Device {
    private int ID;
    private String brand;
    private String model;
    private String color;
    private String modelNumber;
    private String categoryID;
    private String categoryName;
    private long UPC = Long.MAX_VALUE;
    private int manufacturerYear;

    @Override
    public int getID() {
        return ID;
    }

    @Override
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    @Override
    public String getCategoryID() {
        return categoryID;
    }

    @Override
    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    @Override
    public String getCategoryName() {
        return categoryName;
    }

    @Override
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
