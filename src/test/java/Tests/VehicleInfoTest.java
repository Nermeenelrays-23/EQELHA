package Tests;

import Pages.*;
import org.testng.annotations.Test;

public class VehicleInfoTest extends TestBase {

    VehicleInfoPage VehicleInfoObj;
    @Test(priority = 6)
    public void UserEnterVehicleInfo() throws InterruptedException {

        VehicleInfoObj=new VehicleInfoPage(driver);
        VehicleInfoObj.VehicleInfo();
    }
}
