package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserInfoPage extends PageBase {
    public UserInfoPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//section[@id='get-quote']//app-user-info[@class='ng-star-inserted']/form/button[@type='submit']")
    WebElement continuebtn;
    public void UserInfo(){

        ClickButton(continuebtn);

    }
}
