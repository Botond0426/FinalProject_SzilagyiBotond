package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.FirstTestPage;

public class FirstTestCaseComponentsCategory extends BasePage {
    private FirstTestPage firstTestPage;
    private static final By COMPONENTS_CATEGORY = By.cssSelector("#entry_217832 > a");
    @BeforeMethod
    public void setUp(){
        super.setUp();
        firstTestPage = new FirstTestPage(driver);
    }
    @Test()
    public void clickOnCategoryAndComponents(){
        driver.findElement(COMPONENTS_CATEGORY).click();
        firstTestPage.clickOnComponents();
        String actualTitle = firstTestPage.getTextInTitle();
        String expectedTitle = "Components";
        Assert.assertEquals(actualTitle, expectedTitle,"Title does not match");
    }















}
