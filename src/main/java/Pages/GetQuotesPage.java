package Pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GetQuotesPage extends PageBase{

    public GetQuotesPage(WebDriver driver) {

        super(driver);
        Jse=(JavascriptExecutor)driver;
    }
    @FindBy(xpath = "/html/body/app-root/app-base/div/app-quotes-list/section/div/div[3]/div[2]/div[2]/div[2]/div/div[2]/mat-checkbox[1]/label/div\n")
    WebElement Additional1;
    @FindBy(xpath = "/html/body/app-root/app-base/div/app-quotes-list/section/div/div[3]/div[2]/div[2]/div[2]/div/div[2]/mat-checkbox[2]/label/div\n")
    WebElement Additional2;
   @FindBy(xpath = "/html/body/app-root/app-base/div/app-quotes-list/section/div/div[3]/div[2]/div[2]/div[2]/div/div[2]/mat-checkbox[3]/label/div\n")
    WebElement Additional3;

    @FindBy(xpath = "/html/body/app-root/app-base/div/app-quotes-list/section/div/div[3]/div[2]/div[3]/div[3]/button\n")
    WebElement BuyNowBtn;

    public void UserSelectWalaaComp() throws InterruptedException {
        ScrollDown();
        Thread.sleep(1000);
        ScrollDown();
        Thread.sleep(1000);
        ClickButton(Additional1);
        Thread.sleep(1000);
        ClickButton(Additional2);
        Thread.sleep(1000);
        ClickButton(Additional3);
        Thread.sleep(1000);
        ClickButton(BuyNowBtn);
        Thread.sleep(1000);
    }
}