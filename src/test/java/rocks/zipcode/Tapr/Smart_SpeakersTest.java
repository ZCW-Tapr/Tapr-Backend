package rocks.zipcode.Tapr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Smart_SpeakersTest {
    Smart_Speakers smart_speakers = new Smart_Speakers();

    @Test
    void getID() {
        //given
        int ID = 1;
        smart_speakers.setID(ID);
        assertEquals(ID, smart_speakers.getID());
    }

    @Test
    void getBrand() {
        //given
        String brand = "Amazon";
        smart_speakers.setBrand(brand);
        assertEquals(brand, smart_speakers.getBrand());
    }

    @Test
    void getModel() {
        //given
        String model = "Echo Studio";
        smart_speakers.setModel(model);
        assertEquals(model, smart_speakers.getModel());
    }

    @Test
    void getColor() {
        //given
        String color = "Black";
        smart_speakers.setColor(color);
        assertEquals(color, smart_speakers.getColor());
    }

    @Test
    void getModelNumber() {
        //given
        String modelNumber = "B07G9Y3ZMC";
        smart_speakers.setModelNumber(modelNumber);
        assertEquals(modelNumber, smart_speakers.getModelNumber());

    }

    @Test
    void getCategoryID() {
        //given
        int categoryID = 2;
        smart_speakers.setCategoryID(categoryID);
        assertEquals(categoryID, smart_speakers.getCategoryID());
    }

    @Test
    void getCategoryName() {
        //given
        String categoryName = "Smart Speakers";
        smart_speakers.setCategoryName(categoryName);
        assertEquals(categoryName, smart_speakers.getCategoryName());
    }

    @Test
    void getUPC() {
        //given
        String UPC = "841667199123";
        smart_speakers.setUPC(UPC);
        assertEquals(UPC, smart_speakers.getUPC());
    }

    @Test
    void getManufacturerYear() {
        //given
        int manufacturerYear = 2019;
        smart_speakers.setManufacturerYear(manufacturerYear);
        assertEquals(manufacturerYear, smart_speakers.getManufacturerYear());
    }
}