package pages.LoginPage;

import StepDefinition.Hooks;
import commonUtils.CommonHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPageHelper extends LoginPageElements{
    WebDriver driver = Hooks.getWebDriver();

    public LoginPageHelper() {
        PageFactory.initElements(driver, this);
    }

    public void verifyLoginPageIsOpened() {
        CommonHelper.waitUntilElementAppears(loginPageHeader, driver);
        Assert.assertTrue(loginPageHeader.isDisplayed());
    }
    public void insertUsername(String username){
        CommonHelper.sendText(usernameTextBox,username,driver);
    }
    public void insertPassword(String password){
        CommonHelper.sendText(passwordTextBox,password,driver);
    }
    public void clickLoginBtn(){
        CommonHelper.clickWhenReady(loginBtn,driver);
    }

}
