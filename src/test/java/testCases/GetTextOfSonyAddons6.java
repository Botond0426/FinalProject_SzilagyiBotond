package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddOnsModuleSonyPAGE6;
import pages.BasePage;

public class GetTextOfSonyAddons6 extends BasePage {
    private AddOnsModuleSonyPAGE6 addOnsModuleSonyPAGE6;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        addOnsModuleSonyPAGE6 = new AddOnsModuleSonyPAGE6(driver);

    }
    @Test
    public void clickOnAddons1(){
        addOnsModuleSonyPAGE6.clickOnAddOns1();
        addOnsModuleSonyPAGE6.clickOnAddOns1();
        addOnsModuleSonyPAGE6.clickOnModules1();
        WebElement Sony1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='swiper-wrapper-be9ad95eaa5a0b29']/div[8]/a/figure/figcaption")));
        addOnsModuleSonyPAGE6.clickOnSony1();
        String actualTitle = addOnsModuleSonyPAGE6.getTextOfSony();
        String expectedTitle = "Sony";
        Assert.assertEquals(actualTitle,expectedTitle,"Sony");
    }











}
