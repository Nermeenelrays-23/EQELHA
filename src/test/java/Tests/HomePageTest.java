package Tests;

import Pages.Homepage;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    Homepage HomePageObj;
    @Test(priority = 1,alwaysRun = true)
    public void WayToLogin() throws InterruptedException {
        HomePageObj= new Homepage(driver);
        HomePageObj.Login();
    }
   @Test(priority = 3)
   public void UserClickOnGetQuotes()
    {
        HomePageObj=new Homepage(driver);
        HomePageObj.FirstScreen();
    }
}
