package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserCanPurchase extends PageBase {
    public UserCanPurchase(WebDriver driver) {
        super(driver);
        Jse=(JavascriptExecutor)driver;

    }
    //IBAN
    @FindBy(xpath="/html/body/app-root/app-base/app-policy-details/section/div/div[4]/div[1]/div/form/mat-form-field/div/div[1]/div\n")
    WebElement IBAN;
    @FindBy(xpath = "/html/body/app-root/app-base/div/app-policy-details/section/div/div[4]/div/div[2]/mat-checkbox/label/div\n")
    WebElement CheckPayment;
    @FindBy(xpath="/html/body/app-root/app-base/div/app-policy-details/section/div/div[5]/div/div/div/div/div[2]/div[2]/button[2]\n")
    WebElement Confirm2f;
    //Choose Esal
    @FindBy(id="esal-radio")
    WebElement ChooseEsal;
    @FindBy(id="done")
    WebElement DoneBtn;

    public void UserCanPurchaseWalaa() throws InterruptedException {
        ScrollDown();
        Thread.sleep(1000);
        ScrollDown();
        ClickButton(CheckPayment);
        ScrollDown();
        Thread.sleep(1000);
        ClickButton(Confirm2f);
        Thread.sleep(1000);
        ClickButton(ChooseEsal);
        ScrollDown();
        Thread.sleep(1000);
        ScrollDown();
        ClickButton(DoneBtn);
    }
}
