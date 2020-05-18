package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicInfoPage extends PageBase {
    public BasicInfoPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="mat-input-1")
    WebElement IDTXt;
    @FindBy(id="mat-input-2")
    WebElement MonthTxt;
    @FindBy(id="mat-input-3")
    WebElement YearTxt;
    @FindBy(id="mat-input-4")
    WebElement SequenceNumberTxt;
    @FindBy(id="mat-checkbox-1")
    WebElement CheckBoxAgreement;
    @FindBy(xpath = "/html/body/app-root/app-base/app-get-quote/section/div/div/div[2]/app-basic-info/form/button\n")
    WebElement ContinueBtn;
    @FindBy(xpath = "/html/body/app-root/app-base/app-get-quote/section/div/div/div[2]/app-basic-info/form/div/div[3]/mat-radio-group/div[2]/mat-radio-button/label/div[2]\n")
    WebElement PolicyEffectiveDate;
    public void BasicInfo(String InsuredId,String Month, String Year, String SequenceNumber) throws InterruptedException {
        SetTextElement(IDTXt,InsuredId);
        SetTextElement(MonthTxt,Month);
        SetTextElement(YearTxt,Year);
        SetTextElement(SequenceNumberTxt,SequenceNumber);
        Thread.sleep(1000);
        ClickButton(PolicyEffectiveDate);
        ClickButton(CheckBoxAgreement);
        ClickButton(ContinueBtn);
        Thread.sleep(14000);
        Thread.sleep(12000);

    }
}
