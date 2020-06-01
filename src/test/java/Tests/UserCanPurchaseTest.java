package Tests;

import Pages.UserCanPurchase;
import org.testng.annotations.Test;

public class UserCanPurchaseTest extends TestBase {
    UserCanPurchase UserPurchaseObj;

@Test(priority = 9)
public void UserPurchaseUsingEsal() throws InterruptedException {
    UserPurchaseObj=new UserCanPurchase(driver);
    UserPurchaseObj.UserCanPurchaseWalaa();
}}
