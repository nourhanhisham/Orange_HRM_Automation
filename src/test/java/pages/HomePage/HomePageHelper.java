package pages.HomePage;

import StepDefinition.Hooks;
import commonUtils.CommonHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePageHelper extends HomePageElements {
    WebDriver driver = Hooks.getWebDriver();

    public HomePageHelper() {
        PageFactory.initElements(driver, this);
    }

    public void clickAdminTab(){
        CommonHelper.clickWhenReady(AdminTab, driver);
    }
    public String getCurrentRecordsNumber(){
        String RecordText = CommonHelper.getElementTextValue(NumberOfRecords,driver);
        String RecordsNumber= RecordText.replaceAll("[^0-9]", "");
        return RecordsNumber;
    }
    public void clickAddButton(){
        CommonHelper.refreshPage(driver);
        CommonHelper.clickWhenReady(AddBtn,driver);
    }
    public void insertUserRole(String userRole){
        CommonHelper.clickWhenReady(UserRole,driver);
        CommonHelper.clickWhenReady(CommonHelper.findElementByText("span",userRole,driver),driver);
//        WebElement essOption = UserRoleDropDownList.findElement(By.xpath("//span[contains(text(), 'ESS')]"));
//        essOption.click();
    }


    public void insertUserStatus(String userStatus){
        CommonHelper.clickWhenReady(Status,driver);
        CommonHelper.clickWhenReady(CommonHelper.findElementByText("span",userStatus,driver),driver);
    }

    public void insertEmployeeName(String employeeName){
       CommonHelper.refreshPage(driver);
        CommonHelper.sleep(3000);
        CommonHelper.sendText(EmployeeName,employeeName,driver);
        CommonHelper.sleep(3000);
       CommonHelper.clickWhenReady(EmployeeNameDropDownListFirstOption,driver);
    }

    public void insertUserName(String userName){
        CommonHelper.sendText(UserName,userName,driver);
    }

    public void insertPassword(String password){
        CommonHelper.sendText(Password,password,driver);
    }

    public void confirmPassword(String password){
        CommonHelper.sendText(ConfirmPassword,password,driver);
    }
    public void clickSave(){
        CommonHelper.clickWhenReady(SaveBtn,driver);
    }

    public void clickSearchBtn(){
        CommonHelper.clickWhenReady(SearchBtn,driver);
    }

    public void deleteSelectedUser(){
        CommonHelper.clickWhenReady(deleteBtn,driver);
        CommonHelper.clickWhenReady(confirmDelete,driver);
        CommonHelper.refreshPage(driver);
    }




}
