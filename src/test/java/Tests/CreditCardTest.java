package Tests;

import Pages.PurchaseUsingCC;
import org.testng.annotations.Test;

public class CreditCardTest extends TestBase {
    PurchaseUsingCC PurchaseObj;
    @Test(priority = 9)
    public void UserCanPurchaseUsingCC() throws InterruptedException {
        PurchaseObj=new PurchaseUsingCC(driver);
        PurchaseObj.UserPurchaseUsingEsal();
    }
}
