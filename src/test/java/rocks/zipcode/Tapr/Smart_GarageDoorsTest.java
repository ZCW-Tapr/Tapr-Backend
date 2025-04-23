package rocks.zipcode.Tapr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Smart_GarageDoorsTest {
    Smart_GarageDoors smart_garageDoors = new Smart_GarageDoors();

    @Test
    void getID() {
        //given
        int ID = 1;
        smart_garageDoors.setID(ID);
        assertEquals(ID, smart_garageDoors.getID());
    }

    @Test
    void getBrand() {
        //given
        String brand = "Chamberlain";
        smart_garageDoors.setBrand(brand);
        assertEquals(brand, smart_garageDoors.getBrand());
    }

    @Test
    void getModel() {
        //given
        String model = "myQ Smart Garage Control";
        smart_garageDoors.setModel(model);
        assertEquals(model, smart_garageDoors.getModel());
    }

    @Test
    void getColor() {
        //given
        String color = "White";
        smart_garageDoors.setColor(color);
        assertEquals(color, smart_garageDoors.getColor());
    }

    @Test
    void getModelNumber() {
        //given
        String modelNumber = "MyQ-G0401";
        smart_garageDoors.setModelNumber(modelNumber);
        assertEquals(modelNumber, smart_garageDoors.getModelNumber());
    }

    @Test
    void getCategoryID() {
        //given
        int categoryID = 5;
        smart_garageDoors.setCategoryID(categoryID);
        assertEquals(categoryID, smart_garageDoors.getCategoryID());
    }

    @Test
    void getCategoryName() {
        //given
        String categoryName = "Garage Doors";
        smart_garageDoors.setCategoryName(categoryName);
        assertEquals(categoryName, smart_garageDoors.getCategoryName());
    }

    @Test
    void getUPC() {
        //given
        String UPC = "012381194797";
        smart_garageDoors.setUPC(UPC);
        assertEquals(UPC, smart_garageDoors.getUPC());
    }

    @Test
    void getManufacturerYear() {
        //given
        int manufacturerYear = 2021;
        smart_garageDoors.setManufacturerYear(manufacturerYear);
        assertEquals(manufacturerYear, smart_garageDoors.getManufacturerYear());
    }
}