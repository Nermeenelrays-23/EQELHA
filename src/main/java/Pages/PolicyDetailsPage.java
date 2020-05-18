package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class PolicyDetailsPage extends PageBase {
    public PolicyDetailsPage(WebDriver driver) {
        super(driver);
        Jse=(JavascriptExecutor)driver;
    }
   public  @FindBy(css = "div:nth-of-type(1) > .custom-img-input.p-2.text-center > .custom-img-label > label > .material-icons")
    WebElement Image1;
    @FindBy(css="div:nth-of-type(2) > .custom-img-input.p-2.text-center > .custom-img-label > label > .material-icons")
    WebElement Image2;
    @FindBy(css="div:nth-of-type(3) > .custom-img-input.p-2.text-center > .custom-img-label > label > .material-icons")
    WebElement Image3;
    @FindBy(css="div:nth-of-type(4) > .custom-img-input.p-2.text-center > .custom-img-label > label > .material-icons")
    WebElement Image4;
    @FindBy(css="div:nth-of-type(5) > .custom-img-input.p-2.text-center > .custom-img-label > label > .material-icons")
    WebElement Image5;
    @FindBy(xpath = "//section[@id='policy-details']/div/div[3]//mat-checkbox//div[@class='mat-checkbox-inner-container']")
    WebElement CheckAgreement;
    //Data For payment CC
    //IBAN
    @FindBy(xpath="/html/body/app-root/app-base/app-policy-details/section/div/div[4]/div[1]/div/form/mat-form-field/div/div[1]/div\n")
    WebElement IBAN;
    @FindBy(xpath = "//section[@id='policy-details']/div//div[@class='my-3 px-3']/mat-checkbox//div[@class='mat-checkbox-inner-container']")
    WebElement CheckPayment;
    @FindBy(css=".btn-primary.col-md-3.ml-md-auto.mx-3.my-2.py-2")
    WebElement Confirm2f;
    //Choose CreditCard
    @FindBy(css="mat-radio-button[value='CREDIT'] .mat-radio-outer-circle")
    WebElement ChooseCreditCard;
    @FindBy(css="form > input[name='card.number']")
    WebElement CardNumber;
    @FindBy(css=".wpwl-control.wpwl-control-expiry")
    WebElement Date;
    @FindBy(xpath = "//section[@id='policy-details']/div/div[5]//mat-radio-group[@role='radiogroup']/div/div/form[@action='https://test.oppwa.com/v1/checkouts/D3F7B9D2C8AF53B777F7457770E98211.uat01-vm-tx03/payment']//input[@name='card.holder']")
    WebElement CardHolderName;
    //upload UCA images
    public void UserUploadInvalidPhoto() throws InterruptedException, AWTException {
        ScrollDown();
        Thread.sleep(1000);
        ScrollDown();
        Thread.sleep(1000);

        String imageName="code.PNG";
        String imagePath=System.getProperty("user.dir")+"\\Uploads\\"+imageName;
        ClickButton(Image1);
        // CTRL+C
        Robot robot=new Robot();
        StringSelection selection=new StringSelection(imagePath);
        Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection,null);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);
        // CTRL +V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


    }
    public void UploadValidPhotoImage1() throws AWTException, InterruptedException {
        String imageName1="Test1.PNG";
        String imagePath1=System.getProperty("user.dir")+"\\Uploads\\"+imageName1;
        Thread.sleep(1000);
        ClickButton(Image1);
        // CTRL+C
        Robot robot=new Robot();
        StringSelection selection=new StringSelection(imagePath1);
        Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection,null);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);
        // CTRL +V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public void uploadImage2() throws InterruptedException, AWTException {
        String imageName2="Test1.PNG";
        String imagePath2=System.getProperty("user.dir")+"\\Uploads\\"+imageName2;
        Thread.sleep(1000);
        ClickButton(Image2);
        // CTRL+C
        Robot robot=new Robot();
        StringSelection selection=new StringSelection(imagePath2);
        Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection,null);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);
        // CTRL +V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);
    }
    public void uploadImage3() throws InterruptedException, AWTException {
        String imageName3="Test1.PNG";
        String imagePath3=System.getProperty("user.dir")+"\\Uploads\\"+imageName3;
        Thread.sleep(1000);
        ClickButton(Image3);
        // CTRL+C
        Robot robot=new Robot();
        StringSelection selection=new StringSelection(imagePath3);
        Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection,null);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);
        // CTRL +V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);
    }

    public void uploadImage4() throws InterruptedException, AWTException {
        String imageName4="Test1.PNG";
        String imagePath4=System.getProperty("user.dir")+"\\Uploads\\"+imageName4;
        Thread.sleep(1000);
        ClickButton(Image4);
        // CTRL+C
        Robot robot=new Robot();
        StringSelection selection=new StringSelection(imagePath4);
        Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection,null);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);
        // CTRL +V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);
    }
    public void uploadImage5() throws InterruptedException, AWTException {
        String imageName5="Test1.PNG";
        String imagePath5=System.getProperty("user.dir")+"\\Uploads\\"+imageName5;
        Thread.sleep(1000);
        ClickButton(Image5);
        // CTRL+C
        Robot robot=new Robot();
        StringSelection selection=new StringSelection(imagePath5);
        Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection,null);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);
        // CTRL +V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);
        Thread.sleep(1000);
        ClickButton(CheckAgreement);
    }
    public void UserCanPurchaseUCA() throws InterruptedException {
        ScrollDown();
        Thread.sleep(1000);
        SetTextElement(IBAN,"1254121212111111111111");
        Thread.sleep(1000);
        ClickButton(CheckPayment);
        ScrollDown();
        Thread.sleep(1000);
        ClickButton(Confirm2f);
        Thread.sleep(1000);
        ClickButton(ChooseCreditCard);
        Thread.sleep(2000);
        SetTextElement(CardNumber,"4005550000000001");
        Thread.sleep(1000);
        SetTextElement(Date,"0521");
        Thread.sleep(1000);
        SetTextElement(CardHolderName,"cvv");
    }
}
