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

}