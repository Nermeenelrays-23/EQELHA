package Tests;

import Pages.BasicInfoPage;

import org.testng.annotations.Test;

public class BasicInfoTest extends TestBase {

    BasicInfoPage BasicInfoObj;
    @Test(priority = 4)
    public void FirstScreen() throws InterruptedException {

        BasicInfoObj=new BasicInfoPage(driver);
        BasicInfoObj.BasicInfo("1068340973","07","1405","920483310");
    }
}
