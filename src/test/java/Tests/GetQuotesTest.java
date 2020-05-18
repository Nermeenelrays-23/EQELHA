package Tests;

import Pages.*;
import org.testng.annotations.Test;

public class GetQuotesTest extends TestBase
{

    GetQuotesPage GetQuotesObj;
    @Test(priority = 7)
    public void UserBuyUCAComp() throws InterruptedException {

        GetQuotesObj=new GetQuotesPage(driver);
        GetQuotesObj.UserSelectUCAComp();
    }
}
