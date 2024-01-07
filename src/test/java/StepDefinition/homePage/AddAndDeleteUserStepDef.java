package StepDefinition.homePage;

import commonUtils.CommonAssertions;
import commonUtils.CommonHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage.HomePageHelper;
import pages.LoginPage.LoginPageHelper;

public class AddAndDeleteUserStepDef {

    public String TotalNumberOfRecords;

    HomePageHelper homePageHelper;
    LoginPageHelper loginPageHelper;


    public AddAndDeleteUserStepDef() {
        homePageHelper = new HomePageHelper();
        loginPageHelper = new LoginPageHelper();
    }

    @Given("^User Opens Home Page Insert \"([^\"]*)\" And \"([^\"]*)\"$")
    public void UserEntersHisRegisteredNIDAndPassword(String username,String password) {
        CommonHelper.sleep(5000);
        loginPageHelper.verifyLoginPageIsOpened();
        loginPageHelper.insertUsername(username);
        loginPageHelper.insertPassword(password);
        loginPageHelper.clickLoginBtn();
    }

    @And("User get the number of records found as an admin")
    public void clickAdminAndGetRecords(){
        homePageHelper.clickAdminTab();
        TotalNumberOfRecords = homePageHelper.getCurrentRecordsNumber();
        System.out.println(TotalNumberOfRecords);
    }

    @And("^Add new Employee \"([^\"]*)\" with username \"([^\"]*)\" Role \"([^\"]*)\" Status \"([^\"]*)\" and Password \"([^\"]*)\" then Confirm password \"([^\"]*)\"$")
    public void addNewUser(String employeeName, String username, String role , String status, String password, String confirmPassword){
        homePageHelper.clickAddButton();
        homePageHelper.insertEmployeeName(employeeName);
        homePageHelper.insertUserName(username);
        homePageHelper.insertUserRole(role);
        homePageHelper.insertUserStatus(status);
        homePageHelper.insertPassword(password);
        homePageHelper.confirmPassword(confirmPassword);
        homePageHelper.clickSave();
    }
    @And("get new record number and verify records increased")
    public void verifyRecordIncreased(){
        int currentRecordInt = Integer.parseInt(homePageHelper.getCurrentRecordsNumber());
        int TotalNumberOfRecordsInt = Integer.parseInt(TotalNumberOfRecords);
        CommonAssertions.assertTwoIntegers(currentRecordInt,TotalNumberOfRecordsInt+1);
    }
    @And("^Search for \"([^\"]*)\" and Delete user$")
    public void deleteUser(String username){
        homePageHelper.insertUserName(username);
        homePageHelper.clickSearchBtn();
        homePageHelper.deleteSelectedUser();
    }
    @And("get new record number and verify records decreased")
    public void verifyRecordDecreased(){
        int currentRecordInt = Integer.parseInt(homePageHelper.getCurrentRecordsNumber());
        int TotalNumberOfRecordsInt = Integer.parseInt(TotalNumberOfRecords);
        CommonAssertions.assertTwoIntegers(currentRecordInt,TotalNumberOfRecordsInt);
    }
}
