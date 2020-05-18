package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserInfoPage extends PageBase {
    public UserInfoPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/app-root/app-base/app-get-quote/section/div/div/div[2]/app-user-info/form/button[2]\n")
    WebElement continuebtn;
    public void UserInfo(){

        ClickButton(continuebtn);

    }
}
