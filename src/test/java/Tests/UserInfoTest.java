package Tests;


import Pages.UserInfoPage;
import org.testng.annotations.Test;

public class UserInfoTest extends TestBase {

    UserInfoPage UserInfoObj;
    @Test(priority = 5)
    public void UserInfoScreen() throws InterruptedException {

        UserInfoObj=new UserInfoPage(driver);
        UserInfoObj.UserInfo();
    }
}
