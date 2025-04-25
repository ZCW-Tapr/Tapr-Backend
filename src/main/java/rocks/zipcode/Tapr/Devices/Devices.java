package rocks.zipcode.Tapr.Devices;

import jakarta.persistence.*;

@Entity
@Table(name = "Devices")
public class Devices {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false, unique = true)
    private int ID;

    @Column(name = "Brand Name", nullable = false, length = 30)
    private String brandName;

    @Column(name = "Model Name", nullable = false, length = 30)
    private String modelName;

    @Column(name = "Model Number", nullable = false, length = 30)
    private String modelNumber;

    @Column(name = "Color", nullable = false, length = 30)
    private String color;

    @Column(name = "Category Name", nullable = false, length = 30)
    private String categoryName;

    @Column(name = "UPC", nullable = true, length = 30)
    private String UPC;

    @Column(name = "Year Manufactured", nullable = false)
    private int yearManufactured;


    public Devices(int ID, String brandName, String modelName, String modelNumber, String color, String categoryName, String UPC, int yearManufactured) {
        this.ID = ID;
        this.brandName = brandName;
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.color = color;
        this.categoryName = categoryName;
        this.UPC = UPC;
        this.yearManufactured = yearManufactured;
    }

    public Devices() {
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
}