package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="Email")
    WebElement EmailTxt;
    @FindBy(id="password")
    WebElement PasswordTxt;
    @FindBy(xpath = "/html/body/section/div[1]/div[2]/form/button\n")
    WebElement LoginBtn;
    public void Login(String Email, String Password ){
        SetTextElement(EmailTxt,Email);
        SetTextElement(PasswordTxt,Password);
        ClickButton(LoginBtn);
    }
}
