package rocks.zipcode.Tapr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Smart_LightsTest {
    Smart_Lights smart_lights = new Smart_Lights();

    @Test
    void getID() {
        //given
        int ID = 1;
        smart_lights.setID(ID);
        assertEquals(ID, smart_lights.getID());
    }

    @Test
    void getBrand() {
        //given
        String brand = "Philips";
        smart_lights.setBrand(brand);
        assertEquals(brand, smart_lights.getBrand());
    }

    @Test
    void getModel() {
        //given
        String model = "Hue";
        smart_lights.setModel(model);
        assertEquals(model, smart_lights.getModel());
    }

    @Test
    void getColor() {
        //given
        String color = "White";
        smart_lights.setColor(color);
        assertEquals(color, smart_lights.getColor());
    }

    @Test
    void getModelNumber() {
        //given
        String modelNumber = "563361";
        smart_lights.setModelNumber(modelNumber);
        assertEquals(modelNumber, smart_lights.getModelNumber());
    }

    @Test
    void getCategoryID() {
        //given
        int categoryID = 1;
        smart_lights.setCategoryID(categoryID);
        assertEquals(categoryID, smart_lights.getCategoryID());
    }

    @Test
    void getCategoryName() {
        //given
        String categoryName = "Smart Lighting";
        smart_lights.setCategoryName(categoryName);
        assertEquals(categoryName, smart_lights.getCategoryName());
    }

    @Test
    void getUPC() {
        //given
        String UPC = "123456789012";
        smart_lights.setUPC(UPC);
        assertEquals(UPC, smart_lights.getUPC());
    }

    @Test
    void getManufacturerYear() {
        //given
        int manufacturerYear = 2021;
        smart_lights.setManufacturerYear(manufacturerYear);
        assertEquals(manufacturerYear, smart_lights.getManufacturerYear());
    }
}