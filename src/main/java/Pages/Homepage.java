package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends PageBase {
    public Homepage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath="/html/body/app-root/app-base/app-header/div/nav/div/div[1]/div[2]/div/a\n")
    WebElement RegisterBtn;
    @FindBy(xpath = "/html/body/app-root/app-signup/section/div[1]/div/a\n")
    WebElement LoginBtn;
    //احصل عل العروَض
    @FindBy(xpath = "/html/body/app-root/app-base/app-home/app-home-main-section/section/div/div/form/div[2]/button\n")
    WebElement GetQuotesBtn;
    public void Login() throws InterruptedException {
        ClickButton(RegisterBtn);
        Thread.sleep(1000);
        ClickButton(LoginBtn);
    }
    public void FirstScreen(){
        ClickButton(GetQuotesBtn);
    }


}
