package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginAndModifyYourAddressPAGE11;

public class LoginModifyAddress11 extends BasePage {
    private LoginAndModifyYourAddressPAGE11 loginAndModifyYourAddressPAGE11;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        loginAndModifyYourAddressPAGE11 = new LoginAndModifyYourAddressPAGE11(driver);
    }
    @Test
    public void clickOnLoginUser1(){
        loginAndModifyYourAddressPAGE11.clickOnLoginUser1();
        loginAndModifyYourAddressPAGE11.loginUserEmail("tester@tester.com");
        loginAndModifyYourAddressPAGE11.loginUserPassword("tester123");
        loginAndModifyYourAddressPAGE11.clickOnLoginButton();
    }
    public void clickOnModifyYourAddress(){
        loginAndModifyYourAddressPAGE11.clickOnModifyYourAddress();
        loginAndModifyYourAddressPAGE11.clickOnNewAddress();
        loginAndModifyYourAddressPAGE11.typeInFirstNameAddress("tester");
        loginAndModifyYourAddressPAGE11.typeInLastNameAddress("tester");
        loginAndModifyYourAddressPAGE11.typeInAddress("testCity123");
        loginAndModifyYourAddressPAGE11.typeInCityAddress("testcity road 123");
        loginAndModifyYourAddressPAGE11.typeInPostalCodeAddress("457171");
        loginAndModifyYourAddressPAGE11.typeInCountyAddress("testCounty");
        loginAndModifyYourAddressPAGE11.clickOnContinueAddress();
    }

}
