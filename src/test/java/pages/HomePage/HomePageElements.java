package pages.HomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElements {

    @FindBy(xpath = "//span[text()='Admin']")
    WebElement AdminTab;

    @FindBy(xpath = "//span[text()[contains(.,'Records')]]")
    WebElement NumberOfRecords;

    @FindBy(xpath = "//button[text()=' Add ']")
    WebElement AddBtn;

    @FindBy(xpath = "//label[text()='User Role']/parent::div/following-sibling::div")
    WebElement UserRole;
    @FindBy(xpath = "//div[@role='listbox']")
    WebElement UserRoleDropDownList;


    @FindBy(xpath = "//label[text()='Status']/parent::div/following-sibling::div")
    WebElement Status;

    @FindBy(xpath = "//label[text()='Employee Name']/parent::div/following-sibling::div//input")
    WebElement EmployeeName;

    @FindBy(xpath = "(//div[@role='option'])[1]")
    WebElement EmployeeNameDropDownListFirstOption;

    @FindBy(xpath ="//label[text()='Username']/parent::div/following-sibling::div//input")
    WebElement UserName;

    @FindBy(xpath = "//label[text()='Password']/parent::div/following-sibling::div//input")
    WebElement Password;

    @FindBy(xpath = "//label[text()='Confirm Password']/parent::div/following-sibling::div//input")
    WebElement ConfirmPassword;

    @FindBy(xpath = "//button[text()=' Save ']")
    WebElement SaveBtn;

    @FindBy(xpath = "//button[text()=' Search ']")
    WebElement SearchBtn;

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement userCheckBox;

    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']/..")
    WebElement deleteBtn;
    @FindBy(xpath = "//button[text()=' Yes, Delete ']")
    WebElement confirmDelete;


}

