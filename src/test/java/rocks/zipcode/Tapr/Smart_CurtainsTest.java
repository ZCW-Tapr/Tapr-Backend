package rocks.zipcode.Tapr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Smart_CurtainsTest {
    Smart_Curtains smart_curtains = new Smart_Curtains();

    @Test
    void getID() {
        //given
        int ID = 1;
        smart_curtains.setID(ID);
        assertEquals(ID, smart_curtains.getID());
    }

    @Test
    void getBrand() {
        //given
        String brand = "Ryse";
        smart_curtains.setBrand(brand);
        assertEquals(brand, smart_curtains.getBrand());
    }

    @Test
    void getModel() {
        //given
        String model = "Ryse Smartshade";
        smart_curtains.setModel(model);
        assertEquals(model, smart_curtains.getModel());
    }

    @Test
    void getColor() {
        //given
        String color = "White";
        smart_curtains.setColor(color);
        assertEquals(color, smart_curtains.getColor());
    }

    @Test
    void getModelNumber() {
        //given
        String modelNumber = "GR-0103-KYT120200BU";
        smart_curtains.setModelNumber(modelNumber);
        assertEquals(modelNumber, smart_curtains.getModelNumber());

    }

    @Test
    void getCategoryID() {
        //given
        int categoryID = 4;
        smart_curtains.setCategoryID(categoryID);
        assertEquals(categoryID, smart_curtains.getCategoryID());
    }

    @Test
    void getCategoryName() {
        //given
        String categoryName = "Smart Curtains";
        smart_curtains.setCategoryName(categoryName);
        assertEquals(categoryName, smart_curtains.getCategoryName());
    }

    @Test
    void getUPC() {
        //given
        String UPC = "873110000129";
        smart_curtains.setUPC(UPC);
        assertEquals(UPC, smart_curtains.getUPC());
    }

    @Test
    void getManufacturerYear() {
        //given
        int manufacturerYear = 2023;
        smart_curtains.setManufacturerYear(manufacturerYear);
        assertEquals(manufacturerYear, smart_curtains.getManufacturerYear());
    }
}