package Tests;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class TestBase extends AbstractTestNGCucumberTests
{
    public static WebDriver driver;
    @BeforeSuite
    @Parameters({"browser"})
    public void startDriver (@Optional("chrome") String browserName)
    {
        if (browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/Drivers/chromedriver.exe");
            driver = new ChromeDriver();

        }
        else if (browserName.equalsIgnoreCase("chrome-headless"))
        {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/Drivers/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("--window-size=1920,1800");
            driver = new ChromeDriver(options);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        driver.get("http://qc2.bawbty.com/");

    }
  /*  @BeforeSuite
    public void StartDriver()
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qc1.bawbty.com/how-it-works");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }*/

    @AfterSuite
    public void StopDriver()
    {
        // driver.close();
    }

}
