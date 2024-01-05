package testCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ShopPhonePAGE2;

public class ShopPhoneWithRegistration2 extends BasePage {
    private ShopPhonePAGE2 shopPhonePAGE2;


    @BeforeMethod
    public void setUp(){
        super.setUp();
        shopPhonePAGE2 = new ShopPhonePAGE2(driver);
    }
    @Test()
    public void clickOnPhone(){

        shopPhonePAGE2.clickOnPhone();
    }
    public void clickOnShopCart1(){
        shopPhonePAGE2.clickOnBuyNow();
    }
    public void enterTextInFirstNameField(){
        shopPhonePAGE2.enterTextInFirstNameField("test");
    }
    public void enterTextInSecondNameField(){
        shopPhonePAGE2.enterTextInSecondNameField("test");
    }
    public void enterTextInEmailField(){
        shopPhonePAGE2.enterTextInEmailField("test@test.com");
    }
    public void enterPhoneNumber(){
        shopPhonePAGE2.enterPhoneNumber("1234567891");
    }
    public void enterPassword1(){
        shopPhonePAGE2.enterPassword1("test123.");
    }
    public void enterPassword2(){
        shopPhonePAGE2.enterPassword2("test123.");
    }
    public void enterAddress1(){
        shopPhonePAGE2.enterAddress1("testAddress");
    }
    public void enterCity1(){
        shopPhonePAGE2.enterCity1("testCity");
    }
    public void enterPostCode1(){
        shopPhonePAGE2.enterPostCode1("123456");
    }
    public void clickOnSelectCountryRomania(){
        shopPhonePAGE2.clickOnSelectRegionCluj();
    }
    public void clickOnPrivacyPolicy(){
        shopPhonePAGE2.clickOnPrivacyPolicy();
    }
    public void clickOnTnC(){
        shopPhonePAGE2.clickOnTnC();
    }
    public void clickOnContinue(){
        shopPhonePAGE2.clickOnContinue();
    }
    public void clickOnConfirmOrder1(){
        shopPhonePAGE2.clickOnConfirmOrder1();
    }
    public void clickOnContinueAfterOrder(){
        shopPhonePAGE2.clickOnContinueAfterOrder();
    }








}
