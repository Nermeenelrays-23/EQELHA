package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicInfoPage extends PageBase {
    public BasicInfoPage(WebDriver driver) {

        super(driver);
    }
    @FindBy(xpath="//section[@id='get-quote']/div[@class='container py-5']/div//app-basic-info[@class='ng-star-inserted']/form/div/div[2]/mat-form-field[1]//input")
    WebElement IDTXt;
    @FindBy(xpath="//section[@id='get-quote']/div[@class='container py-5']/div//app-basic-info[@class='ng-star-inserted']/form/div/div[2]/mat-form-field[2]//input[@role='combobox']")
    WebElement MonthTxt;
    @FindBy(xpath="//section[@id='get-quote']/div[@class='container py-5']/div//app-basic-info[@class='ng-star-inserted']/form/div/div[2]/mat-form-field[3]//input[@role='combobox']")
    WebElement YearTxt;
    @FindBy(xpath="//section[@id='get-quote']/div[@class='container py-5']/div//app-basic-info[@class='ng-star-inserted']/form/div/div[2]/mat-form-field[4]//input")
    WebElement SequenceNumberTxt;
    @FindBy(xpath="/html/body/app-root/app-base/div/app-get-quote/section/div/div/div[2]/app-basic-info/form/div/div[4]/mat-checkbox/label/div\n")
    WebElement CheckBoxAgreement;
    @FindBy(xpath = "//section[@id='get-quote']//app-basic-info[@class='ng-star-inserted']/form/button[@type='submit']")
    WebElement ContinueBtn;
    @FindBy(xpath = "//div[@id='policyEffectiveDate']/mat-radio-group[@role='radiogroup']/div[2]/mat-radio-button//div[@class='mat-radio-label-content']")
    WebElement PolicyEffectiveDate;
    public void BasicInfo(String InsuredId,String Month, String Year, String SequenceNumber) throws InterruptedException {

        SetTextElement(IDTXt,InsuredId);
        Thread.sleep(1000);
        SetTextElement(MonthTxt,Month);
        Thread.sleep(1000);
        SetTextElement(YearTxt,Year);
        Thread.sleep(1000);
        SetTextElement(SequenceNumberTxt,SequenceNumber);
        Thread.sleep(1000);
        ClickButton(PolicyEffectiveDate);
        ClickButton(CheckBoxAgreement);
        ClickButton(ContinueBtn);
        Thread.sleep(14000);
        Thread.sleep(12000);
    }
}
