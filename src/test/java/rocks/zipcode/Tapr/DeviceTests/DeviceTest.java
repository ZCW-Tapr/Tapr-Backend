package rocks.zipcode.Tapr.DeviceTests;
import org.junit.jupiter.api.Test;
import rocks.zipcode.Tapr.domain.Devices;

import static org.testng.AssertJUnit.assertEquals;

public class DeviceTest {
    Devices devices = new Devices();

    @Test
    public void getID() {
        //given
        int ID = 1;
        devices.setID(ID);
        assertEquals(ID, devices.getID());
    }

    @Test
    void getBrandName() {
        //given
        String brandName = "Samsung";
        devices.setBrandName(brandName);
        assertEquals(brandName, devices.getBrandName());
    }

    @Test
    void getModelName() {
        //given
        String modelName = "Samsung - 70” Class DU7200 Series Crystal UHD 4K Smart Tizen TV";
        devices.setModelName(modelName);
        assertEquals(modelName, devices.getModelName());
    }

    @Test
    void getModelNumber() {
        //given
        String modelNumber = "UN70DU7200FXZA";
        devices.setModelNumber(modelNumber);
        assertEquals(modelNumber, devices.getModelNumber());
    }

    @Test
    void getColor() {
        //given
        String color = "Black";
        devices.setColor(color);
        assertEquals(color, devices.getColor());
    }

    @Test
    public void getCategoryName() {
        //given
        String categoryName = "Television";
        devices.setCategoryName(categoryName);
        assertEquals(categoryName, devices.getCategoryName());
    }

    @Test
    void getUPC() {
        //given
        String UPC = "887276830803";
        devices.setUPC(UPC);
        assertEquals(UPC, devices.getUPC());
    }

    @Test
    void getYearManufactured() {
        //given
        int yearManufactured = 2025;
        devices.setYearManufactured(yearManufactured);
        assertEquals(yearManufactured, devices.getYearManufactured());
    }
}