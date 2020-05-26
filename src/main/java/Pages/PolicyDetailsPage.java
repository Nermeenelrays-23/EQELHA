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
    @FindBy(xpath = "/html/body/app-root/app-base/app-policy-details/section/div/div[3]/div/div/div[6]/mat-checkbox/label/div\n")
    WebElement CheckAgreement;
    //Data For payment CC

    //upload walaa images
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
        String imageName1="image.PNG";
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
        String imageName2="image.PNG";
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
        String imageName3="image.PNG";
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
        String imageName4="image.PNG";
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
        String imageName5="image.PNG";
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

}
