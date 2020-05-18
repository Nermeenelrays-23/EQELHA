
package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase
{
    public JavascriptExecutor Jse;

    public PageBase(WebDriver driver)
    {

        PageFactory.initElements(driver,this );
    }


    protected  static void ClickButton(WebElement button)
    {

        button.click();
    }
    protected static void SetTextElement(WebElement textElement, String value)
    {
        textElement.sendKeys(value);
    }


    public void ScrollDown()
    {
        Jse.executeScript("scrollBy(0,300)");
    }
    public void ScrollUp(){

    }

}
