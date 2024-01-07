package pages.LoginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElements {
    @FindBy(xpath = "//h5[text()='Login']")
    WebElement loginPageHeader;

    @FindBy(xpath = "//input[@name='username']")
    WebElement usernameTextBox;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginBtn;

}
