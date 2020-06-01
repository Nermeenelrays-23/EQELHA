package Steps;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.*;

import static Tests.TestBase.driver;

public class GetQuotesForUser {
    Homepage HomePageObj;
    BasicInfoPage BasicInfoObj;
    LoginPage LoginObj;
    UserInfoPage UserInfoObj;
    VehicleInfoPage VehicleInfoObj;
    GetQuotesPage GetQuoteObj;
    PolicyDetailsPage PolicyDetailsObj;
    UserCanPurchase UserPurchaseObj;
    @Given("The User Login From HomePage")
    public void the_User_Login_From_HomePage() throws InterruptedException {
        HomePageObj=new Homepage(driver);
        HomePageObj.Login();
        LoginObj=new LoginPage(driver);
        LoginObj.Login("doaa.mostafa@devexy.com","Doaa@123456");

    }
    @And("User Click on Get Quotes From HomePage")
    public void user_Click_on_Get_Quotes_From_HomePage() {
        HomePageObj=new Homepage(driver);
        HomePageObj.FirstScreen();
    }
    @And("User enter His Basic info")
    public void user_enter_His_Basic_info() throws InterruptedException {
        BasicInfoObj=new BasicInfoPage(driver);
        BasicInfoObj.BasicInfo("2153337650","09","1980","478595410");
    }
    @And("User enter His User info")
    public void user_enter_His_User_info() {
       UserInfoObj=new UserInfoPage(driver);
       UserInfoObj.UserInfo();
    }
    @And("User Enter His Vehicle info")
    public void user_Enter_His_Vehicle_info() throws InterruptedException {
      VehicleInfoObj=new VehicleInfoPage(driver);
      VehicleInfoObj.VehicleInfo();
    }
    @When("User Click on Get Quotes")
    public void user_Click_on_Get_Quotes() throws InterruptedException {
       GetQuoteObj=new GetQuotesPage(driver);
       GetQuoteObj.UserSelectWalaaComp();
    }
    @And("Select Insurance company to Purchase")
    public void select_Insurance_company_to_Purchase() throws InterruptedException, AWTException {
        PolicyDetailsObj=new PolicyDetailsPage(driver);
        PolicyDetailsObj.UserUploadInvalidPhoto();
        PolicyDetailsObj.UploadValidPhotoImage1();
        PolicyDetailsObj.uploadImage2();
        PolicyDetailsObj.uploadImage3();
        PolicyDetailsObj.uploadImage4();
        PolicyDetailsObj.uploadImage5();
    }
    @Then("User can purchase it successfully")
    public void user_can_purchase_it_successfully() throws InterruptedException {
       UserPurchaseObj=new UserCanPurchase(driver);
       UserPurchaseObj.UserCanPurchaseWalaa();

    }
}