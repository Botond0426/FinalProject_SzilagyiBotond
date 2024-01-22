package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.RegisterForAffiliatePAGE28;

public class RegisterAffiliate28 extends BasePage {
    private RegisterForAffiliatePAGE28 registerForAffiliatePAGE28;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        registerForAffiliatePAGE28 = new RegisterForAffiliatePAGE28(driver);
    }
    @Test
    public void clickOnLoginUser1(){
        registerForAffiliatePAGE28.clickOnLoginUser1();
        registerForAffiliatePAGE28.loginUserEmail("testman@testman.com");
        registerForAffiliatePAGE28.loginUserPassword("TestMan123.");
        registerForAffiliatePAGE28.clickOnLoginButton();
        registerForAffiliatePAGE28.clickOnAffiliate();
        registerForAffiliatePAGE28.typeInCompanyField("TestMan Ltd.");
        registerForAffiliatePAGE28.typeInWebsiteField("www.testmanltd.com");
        registerForAffiliatePAGE28.typeInTaxIDField("EU12345678");
        registerForAffiliatePAGE28.checkPaypal();
        registerForAffiliatePAGE28.typeInEmailForPayPal("testman@testman.com");
        registerForAffiliatePAGE28.checkAgreementCheckbox();
        registerForAffiliatePAGE28.clickOnSignButton();
    }
}
