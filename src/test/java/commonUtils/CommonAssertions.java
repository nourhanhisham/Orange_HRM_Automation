package commonUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class CommonAssertions {

    public static void softAssertionTwoStrings(String actualResult, String expectedResult)
    {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult,expectedResult);
    }
    public static void softAssertElementExist(WebElement element) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(existHelper(element));
    }

    public static boolean clickable(WebElement element, WebDriver driver) {
        try {
            CommonHelper.waitElementToClickable(element, driver);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean assertContains(String Actualtext, String str) {
        return Actualtext.contains(str);
    }

    public static void assertTrue(Boolean condition) {
        Assert.assertTrue(condition);
    }

    public static void assertFalse(Boolean condition) {
        Assert.assertFalse(condition);

    }

    public static void assertIsClickable(WebElement element, WebDriver driver) {
        Assert.assertTrue(clickable(element, driver));
    }

    public static void assertIsNotClickable(WebElement element, WebDriver driver) {
        Assert.assertFalse(clickable(element, driver));
    }

    private static boolean isEnabled(WebElement element) {
        return element.isEnabled();
    }

    public static void assertEnabled(WebElement element) {

        Assert.assertTrue(isEnabled(element));
    }

    public static void assertDisabled(WebElement element) {
        Assert.assertFalse(isEnabled(element));
    }

    public static void assertTwoStrings(String Actual, String Expected) {
        Assert.assertEquals(Actual, Expected);
    }
    public static void assertTwoStringsNotEqual(String actual,String expected) {
        Assert.assertNotEquals(actual,expected);
    }
    public static void softAssertTwoStringsNotEqual(String actual,String expected) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertNotEquals(actual,expected);
    }

    public static void assertTwoIntegers(int Actual, int Expected) {
        Assert.assertEquals(Actual, Expected);
    }

    public static boolean existHelper(WebElement element) {
//        if (element == null) {
//            return false;
//        } else {
//            return true;
//        }

//        return element.isDisplayed();

        return element != null;
    }

    public static boolean checkElementDisplay(WebElement element) {
        return element.isDisplayed();
    }

    public static void assertElementExist(WebElement element) {
        Assert.assertTrue(existHelper(element));
    }
    public static void assertMandatoryDocBeforeUploading(String docName, WebDriver driver) {
        assertElementExist(driver.findElement(By.xpath("(//label[text()='لا']/parent::div[@aria-colindex='3']/following-sibling::div[@aria-colindex='4']/label[text()='نعم'])/parent::div/preceding-sibling::div[@title='"+docName+"']")));
    }
    public static void verifyElementNotExist(WebElement element) throws Exception {
        if (!element.isDisplayed()) {
            throw new Exception(element + " (Element is present)");
        }
    }
    public static void assertElementNotExist(WebElement element) {

        Assert.assertFalse(existHelper(element));
        // Assert.assertFalse(element.isDisplayed());

    }


}
