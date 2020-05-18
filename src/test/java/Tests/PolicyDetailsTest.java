package Tests;

import Pages.*;
import org.testng.annotations.Test;

import java.awt.*;

public class PolicyDetailsTest extends TestBase {

    PolicyDetailsPage PolicyObj;
    @Test(priority = 8)
    public void UserCanUploadImages() throws InterruptedException, AWTException {

        PolicyObj=new PolicyDetailsPage(driver);
        PolicyObj.UserUploadInvalidPhoto();
        PolicyObj.UploadValidPhotoImage1();
        PolicyObj.uploadImage2();
        PolicyObj.uploadImage3();
        PolicyObj.uploadImage4();
        PolicyObj.uploadImage5();
        PolicyObj.UserCanPurchaseUCA();
    }
}
