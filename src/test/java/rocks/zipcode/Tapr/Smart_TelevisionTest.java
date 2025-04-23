package rocks.zipcode.Tapr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Smart_TelevisionTest {
    Smart_Television smart_television = new Smart_Television();

    @Test
    void getID() {
        //given
        int ID = 1;
        smart_television.setID(ID);
        assertEquals(ID, smart_television.getID());
    }

    @Test
    void getBrand() {
        //given
        String brand = "Samsung";
        smart_television.setBrand(brand);
        assertEquals(brand, smart_television.getBrand());
    }

    @Test
    void getModel() {
        //given
        String model = "QLED";
        smart_television.setModel(model);
        assertEquals(model, smart_television.getModel());
    }

    @Test
    void getColor() {
        //given
        String color = "Black";
        smart_television.setColor(color);
        assertEquals(color, smart_television.getColor());
    }

    @Test
    void getModelNumber() {
        //given
        String modelNumber = "QN55Q80TAFXZA";
        smart_television.setModelNumber(modelNumber);
        assertEquals(modelNumber, smart_television.getModelNumber());
    }

    @Test
    void getCategoryID() {
        //given
        int categoryID = 3;
        smart_television.setCategoryID(categoryID);
        assertEquals(categoryID, smart_television.getCategoryID());
    }

    @Test
    void getCategoryName() {
        //given
        String categoryName = "Television";
        smart_television.setCategoryName(categoryName);
        assertEquals(categoryName, smart_television.getCategoryName());
    }

    @Test
    void getUPC() {
        //given
        String UPC = "887276408123";
        smart_television.setUPC(UPC);
        assertEquals(UPC, smart_television.getUPC());
    }

    @Test
    void getManufacturerYear() {
        //given
        int manufacturerYear = 2020;
        smart_television.setManufacturerYear(manufacturerYear);
        assertEquals(manufacturerYear, smart_television.getManufacturerYear());
    }
}