package StepDefinition;

import Data.LoadProperties;
import Driver.DriverSetup;
import commonUtils.CommonHelper;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;

public class Hooks {

    String URL = LoadProperties.userData.getProperty("URL");
    String browser = LoadProperties.userData.getProperty("Browser");
    public static WebDriver driver = null;


    public static WebDriver getWebDriver() {
        return driver;
    }


    @Before("@test")
    public void initialization() throws MalformedURLException {
        DriverSetup.driverConf(browser);
        driver = DriverSetup.getDriver();
        driver.navigate().to(URL);
        driver.manage().window().maximize();
    }


    @After("@test")
    public void stopDriver() {
        System.out.println("quit");
      //  driver.close();
    }

    @AfterStep("@test")
    public void addScreenshot(Scenario scenario) {
        CommonHelper.addScreenshotToCucumberReport(scenario, driver);

    }

}
