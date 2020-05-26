package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseUsingCC extends PageBase {

    public  PurchaseUsingCC(WebDriver driver) {
        super(driver);
        Jse=(JavascriptExecutor)driver;

    }
    //IBAN
    @FindBy(id="IBANNUM")
    WebElement IBAN;
    @FindBy(xpath = "/html/body/app-root/app-base/app-policy-details/section/div/div[4]/div/div[2]/mat-checkbox/label/div\n")
    WebElement CheckPayment;
    @FindBy(css=".btn-primary.col-md-3.ml-md-auto.mx-3.my-2.py-2")
    WebElement Confirm2f;
    @FindBy(id = "cc-radio")
    WebElement ChooseCC;
    @FindBy(id="esal-radio")
    WebElement Esal;
    @FindBy(id="done")
    WebElement ClickDone;
    public void UserPurchaseUsingCC( WebDriver driver) throws InterruptedException {
       // SetTextElement(IBAN,"1254121212111111155555");
        ClickButton(CheckPayment);
        ScrollDown();
        Thread.sleep(1000);
        ClickButton(Confirm2f);
        Thread.sleep(1000);
        ClickButton(ChooseCC);
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.id("cc-iframe")));
        WebElement CC = driver.findElement(By.id("EndToEndIdentity"));
        CC.sendKeys("4005550000000001");
    }
    public void UserPurchaseUsingEsal() throws InterruptedException {
        ClickButton(CheckPayment);
        ScrollDown();
        Thread.sleep(1000);
        ClickButton(Confirm2f);
        Thread.sleep(1000);
        ClickButton(Esal);
        Thread.sleep(1000);
        ScrollDown();
        Thread.sleep(1000);
        ClickButton(ClickDone);

    }

}
