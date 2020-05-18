package Tests;


import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

        LoginPage LoginObj;
        @Test(priority = 2)
        public void UserCanLogin() throws InterruptedException {

            LoginObj=new LoginPage(driver);
            LoginObj.Login("doaa.mostafa@devexy.com","Doaa@123456");

        }
}

