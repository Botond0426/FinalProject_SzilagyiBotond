package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginAndDeleteAddressPAGE12;

public class LoginDeleteAddress12 extends BasePage {
    private LoginAndDeleteAddressPAGE12 loginAndDeleteAddressPAGE12;
    @BeforeMethod
    public void setUp(){
     super.setUp();
     loginAndDeleteAddressPAGE12 = new LoginAndDeleteAddressPAGE12(driver);
    }
    @Test
    public void clickOnLoginUser1(){
        loginAndDeleteAddressPAGE12.clickOnLoginUser1();
        loginAndDeleteAddressPAGE12.loginUserEmail("tester@tester.com");
        loginAndDeleteAddressPAGE12.loginUserPassword("tester123");
        loginAndDeleteAddressPAGE12.clickOnLoginButton();

        loginAndDeleteAddressPAGE12.clickOnModifyYourAddress();
        loginAndDeleteAddressPAGE12.clickOnDeleteAddress();
    }
}
