package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleInfoPage extends PageBase {
    public VehicleInfoPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="mat-input-5")
    WebElement VehicleValue;
    @FindBy(xpath = "//section[@id='get-quote']/div[@class='container py-5']//app-vehicle-info[@class='ng-star-inserted']/form//button[@type='submit']")
    WebElement ContinueBtn;
    public void VehicleInfo() throws InterruptedException {
        VehicleValue.sendKeys("150000");
        Thread.sleep(1000);
        ClickButton(ContinueBtn);
    }
}
