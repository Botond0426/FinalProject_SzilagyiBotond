package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ShopPhonePAGE2;

import java.time.Duration;
import java.util.Random;

public class ShopPhoneWithRegistration2 extends BasePage {
    private ShopPhonePAGE2 shopPhonePAGE2;


    @BeforeMethod
    public void setUp() {
        super.setUp();
        shopPhonePAGE2 = new ShopPhonePAGE2(driver);
    }

    @Test(priority = 1)
    public void clickOnPhone() {

        shopPhonePAGE2.clickOnPhone();

        shopPhonePAGE2.clickOnBuyNow();
        shopPhonePAGE2.enterTextInFirstNameField("test");
        shopPhonePAGE2.enterTextInSecondNameField("test");
        shopPhonePAGE2.enterTextInEmailField(generateEmailAddress());

        shopPhonePAGE2.enterPhoneNumber("1234567891");
        shopPhonePAGE2.enterPassword1("abcdefghijklmnop123.");
        shopPhonePAGE2.enterPassword2("abcdefghijklmnop123.");
        shopPhonePAGE2.enterAddress1("testAddress");
        shopPhonePAGE2.enterCity1("testCity");
        shopPhonePAGE2.enterPostCode1("123456");
        shopPhonePAGE2.clickOnSelectRegionCluj();
        shopPhonePAGE2.clickOnPrivacyPolicy();
        shopPhonePAGE2.clickOnTnC();
        shopPhonePAGE2.clickOnContinue();


        shopPhonePAGE2.scrollAndClickOnConfirmOrderButton();


        shopPhonePAGE2.clickOnContinueAfterOrder();
    }
    public String generateEmailAddress() {
        String str = "panitCity%s@testmial.ro";
        Random random = new Random();
        int x = random.nextInt(999);

        String finalString = String.format(str, x);
        return finalString;
    }
}
