package rocks.zipcode.Tapr;
import org.testng.annotations.Test;
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
    public void getBrand() {
        //given
        String brand = "Samsung";
        device.setBrand(brand);
        assertEquals(brand, device.getBrand());
    }

    @Test
    public void getModel() {
        //given
        String model = "Samsung - 75” Class QN90F Series Neo QLED Mini LED 4K UHD SamsungVision AI Smart Tizen TV (2025)";
        device.setModel(model);
        assertEquals(model, device.getModel());
    }

    @Test
    public void getModelNumber() {
        //given
        String modelNumber = "QN75QN90FAFXZA";
        device.setModelNumber(modelNumber);
        assertEquals(modelNumber, device.getModelNumber());
    }

    @Test
    public void getCategoryID() {
        //given
        String categoryID = "TV25";
        device.setCategoryID(categoryID);
        assertEquals(categoryID, device.getCategoryID());
    }

    @Test
    public void getCategoryName() {
        //given
        String categoryName = "Television";
        device.setCategoryName(categoryName);
        assertEquals(categoryName, device.getCategoryName());
    }

    @Test
    public void getUPC() {
        //given
        long UPC = 887276934525L;
        device.setUPC(UPC);
        assertEquals(UPC, device.getUPC());
    }


    @Test
    public void getManufacturerYear() {
        //given
        int manufacturerYear = 2025;
        device.setManufacturerYear(manufacturerYear);
        assertEquals(manufacturerYear, device.getManufacturerYear());
    }
}