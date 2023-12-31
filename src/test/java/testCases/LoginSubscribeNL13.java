package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginAndSubscribeNewsletterPAGE13;

public class LoginSubscribeNL13 extends BasePage {
    private LoginAndSubscribeNewsletterPAGE13 loginAndSubscribeNewsletterPAGE13;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        loginAndSubscribeNewsletterPAGE13 = new LoginAndSubscribeNewsletterPAGE13(driver);
    }
    @Test
    public void clickOnLoginUser1(){
        loginAndSubscribeNewsletterPAGE13.clickOnLoginUser1();
        loginAndSubscribeNewsletterPAGE13.loginUserEmail("tester@tester.com");
        loginAndSubscribeNewsletterPAGE13.loginUserPassword("tester123");
        loginAndSubscribeNewsletterPAGE13.clickOnLoginButton();
    }
    public void clickOnSubscribeNL(){
        loginAndSubscribeNewsletterPAGE13.clickOnSubscribeNL();
        loginAndSubscribeNewsletterPAGE13.clickOnYesSubscribe();
        loginAndSubscribeNewsletterPAGE13.clickOnContinueSubscribe();
    }


}
