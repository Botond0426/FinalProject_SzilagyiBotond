package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginAndUpdateAccountInfoPAGE10;

public class LoginUpdateAccountInfo10 extends BasePage {
    private LoginAndUpdateAccountInfoPAGE10 loginAndUpdateAccountInfoPAGE10;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        loginAndUpdateAccountInfoPAGE10 = new LoginAndUpdateAccountInfoPAGE10(driver);
    }
    @Test
    public void clickOnLoginUser1(){
        loginAndUpdateAccountInfoPAGE10.clickOnLoginUser1();
        loginAndUpdateAccountInfoPAGE10.loginUserEmail("tester@tester.com");
        loginAndUpdateAccountInfoPAGE10.loginUserPassword("tester123");
        loginAndUpdateAccountInfoPAGE10.clickOnLoginButton();
    }
    public void clickOnUpdateAccount(){
        loginAndUpdateAccountInfoPAGE10.clickOnUpdateAccount();
        loginAndUpdateAccountInfoPAGE10.clickOnSubmitAccountUpdate();
    }
    public void setGetTextAfterUpdate(){
        String actualTitle = loginAndUpdateAccountInfoPAGE10.setGetTextAfterUpdate();
        String expectedTitle = " Success: Your account has been successfully updated.";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match with expected.");
    }




}
