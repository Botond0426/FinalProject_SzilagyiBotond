package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SecondTestPage;

import java.time.Duration;

public class SecondTestCaseShopThePhone extends BasePage {
    private SecondTestPage secondTestPage;
    private static final By SHOP_PHONE = By.xpath("//*[@id=\"swiper-wrapper-b4110bffa7689e74b\"]/div[1]/div/div[1]/div[2]/button[1]/i");
    private static final By SHOP_CART = By.xpath("//*[@id=\"entry_217825\"]/a/div[1]/div/svg");
    private static final By CHECK_OUT1 = By.xpath("//*[@id=\"entry_217851\"]/a");
    private static final By FIRST_NAME_FIELD = By.xpath("//*[@id=\"input-payment-firstname\"]");
    private static final By SECOND_NAME_FIELD = By.xpath("//*[@id=\"input-payment-lastname\"]");
    private static final By EMAIL_FIELD = By.xpath("//*[@id=\"input-payment-email\"]");
    private static final By PHONE_NUMBER = By.cssSelector("#input-payment-telephone");
    private static final By PASSWORD1 = By.xpath("//*[@id=\"input-payment-password\"]");
    private static final By PASSWORD2 = By.xpath("//*[@id=\"input-payment-confirm\"]");
    private static final By ADDRESS1 = By.xpath("//*[@id=\"input-payment-address-1\"]");
    private static final By CITY1 = By.xpath("//*[@id=\"input-payment-city\"]");
    private static final By POSTCODE = By.xpath("//*[@id=\"input-payment-postcode\"]");
    private static final By COUNTRY = By.xpath("//*[@id=\"input-payment-country\"]/option[186]");
    private static final By REGION = By.xpath("//*[@id=\"input-payment-zone\"]/option[15]");
    private static final By PRIVACY_POLICY = By.cssSelector("#form-checkout > div > div.col-lg-7.mb-5.mb-lg-0 > div > div:nth-child(4) > label");
    private static final By TnC = By.cssSelector("#form-checkout > div > div.col-lg-7.mb-5.mb-lg-0 > div > div:nth-child(6) > label");
    private static final By CONTINUE1 = By.xpath("//*[@id=\"button-save\"]");
    private static final By CONFIRM_ORDER = By.cssSelector("#button-confirm");
    private static final By CONTINUE_AFTER_ORDER = By.xpath("//*[@id=\"content\"]/div/a");

    @BeforeMethod
    public void setUp(){
        super.setUp();
        secondTestPage = new SecondTestPage(driver);
    }
    @Test()
    public void clickOnPhone(){
        driver.findElement(SHOP_PHONE).click();
        secondTestPage.clickOnPhone();
    }
    @Test()
    public void clickOnShopCart1(){
        driver.findElement(SHOP_CART).click();
        secondTestPage.clickOnShopCart1();
    }
    @Test()
    public void clickOnCheckout1(){
        driver.findElement(CHECK_OUT1).click();
        secondTestPage.clickOnCheckout1();
    }
    @Test()
    public void enterTextInFirstNameField(){
        driver.findElement(FIRST_NAME_FIELD).sendKeys();
        secondTestPage.enterTextInFirstNameField("test");
    }
    @Test()
    public void enterTextInSecondNameField(){
        driver.findElement(SECOND_NAME_FIELD).sendKeys();
        secondTestPage.enterTextInSecondNameField("test");
    }
    @Test()
    public void enterTextInEmailField(){
        driver.findElement(EMAIL_FIELD).sendKeys();
        secondTestPage.enterTextInEmailField("test@test.com");
    }
    @Test()
    public void enterPhoneNumber(){
        driver.findElement(PHONE_NUMBER).sendKeys();
        secondTestPage.enterPhoneNumber("1234567891");
    }
    @Test()
    public void enterPassword1(){
        driver.findElement(PASSWORD1).sendKeys();
        secondTestPage.enterPassword1("test123.");
    }
    @Test()
    public void enterPassword2(){
        driver.findElement(PASSWORD2).sendKeys();
        secondTestPage.enterPassword2("test123.");
    }
    @Test()
    public void enterAddress1(){
        driver.findElement(ADDRESS1).sendKeys();
        secondTestPage.enterAddress1("testAddress");
    }
    @Test()
    public void enterCity1(){
        driver.findElement(CITY1).sendKeys();
        secondTestPage.enterCity1("testCity");
    }
    @Test()
    public void enterPostCode1(){
        driver.findElement(POSTCODE).sendKeys();
        secondTestPage.enterPostCode1("123456");
    }
    @Test()
    public void clickOnSelectCountryRomania(){
        WebElement countryDropdown = driver.findElement(COUNTRY);
        driver.findElement(REGION).click();
        secondTestPage.clickOnSelectRegionCluj();
    }
    @Test()
    public void clickOnPrivacyPolicy(){
        driver.findElement(PRIVACY_POLICY).click();
        secondTestPage.clickOnPrivacyPolicy();
    }
    @Test()
    public void clickOnTnC(){
        driver.findElement(TnC).click();
        secondTestPage.clickOnTnC();
    }
    @Test()
    public void clickOnContinue(){
        driver.findElement(CONTINUE1).click();
        secondTestPage.clickOnContinue();
    }
    @Test()
    public void clickOnConfirmOrder1(){
        driver.findElement(CONFIRM_ORDER).click();
        secondTestPage.clickOnConfirmOrder1();
    }
    @Test()
    public void clickOnContinueAfterOrder(){
        driver.findElement(CONTINUE_AFTER_ORDER).click();
        secondTestPage.clickOnContinueAfterOrder();
    }








}
