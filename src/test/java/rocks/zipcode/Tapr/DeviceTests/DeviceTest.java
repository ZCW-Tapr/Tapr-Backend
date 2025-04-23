package rocks.zipcode.Tapr.DeviceTests;
import org.junit.jupiter.api.Test;
import rocks.zipcode.Tapr.Devices.Device;

import static org.testng.AssertJUnit.assertEquals;

public class DeviceTest {
    Device device = new Device();

    @Test
    public void getID() {
        //given
        int ID = 1;
        device.setID(ID);
        assertEquals(ID, device.getID());
    }

    @Test
    void getBrandName() {
        //given
        String brandName = "Samsung";
        device.setBrandName(brandName);
        assertEquals(brandName, device.getBrandName());
    }

    @Test
    void getModelName() {
        //given
        String modelName = "Samsung - 70” Class DU7200 Series Crystal UHD 4K Smart Tizen TV";
        device.setModelName(modelName);
        assertEquals(modelName, device.getModelName());
    }

    @Test
    void getModelNumber() {
        //given
        String modelNumber = "UN70DU7200FXZA";
        device.setModelNumber(modelNumber);
        assertEquals(modelNumber, device.getModelNumber());
    }

    @Test
    void getColor() {
        //given
        String color = "Black";
        device.setColor(color);
        assertEquals(color, device.getColor());
    }

    @Test
    public void getCategoryName() {
        //given
        String categoryName = "Television";
        device.setCategoryName(categoryName);
        assertEquals(categoryName, device.getCategoryName());
    }

    @Test
    void getUPC() {
        //given
        String UPC = "887276830803";
        device.setUPC(UPC);
        assertEquals(UPC, device.getUPC());
    }

    @Test
    void getYearManufactured() {
        //given
        int yearManufactured = 2025;
        device.setYearManufactured(yearManufactured);
        assertEquals(yearManufactured, device.getYearManufactured());
    }
}