package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginAndCheckRewardsPointsPAGE15;

public class LoginCheckRewardsPoints15 extends BasePage {
    private LoginAndCheckRewardsPointsPAGE15 loginAndCheckRewardsPointsPAGE15;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        loginAndCheckRewardsPointsPAGE15 = new LoginAndCheckRewardsPointsPAGE15(driver);
    }
    @Test
    public void clickOnLoginUser1(){
        loginAndCheckRewardsPointsPAGE15.clickOnLoginUser1();
        loginAndCheckRewardsPointsPAGE15.loginUserEmail("tester@tester.com");
        loginAndCheckRewardsPointsPAGE15.loginUserPassword("tester123");
        loginAndCheckRewardsPointsPAGE15.clickOnLoginButton();
    }
    public void clickOnRewardsPoints(){
        loginAndCheckRewardsPointsPAGE15.clickOnRewardPoints();
        loginAndCheckRewardsPointsPAGE15.getTextOfRewardPoints();
        String actualTitle = loginAndCheckRewardsPointsPAGE15.getTextOfRewardPoints();
        String expectedTitle = "Your total number of reward points is: 0.";
        Assert.assertEquals(actualTitle,expectedTitle,"Your RewardsPoint does not match with expected");
        loginAndCheckRewardsPointsPAGE15.clickOnContinueInRewards();
    }
}
//String actualTitle = PAGE.getText();
//        String expectedTitle = "Text";
//        Assert.assertEquals(actualTitle,expectedTitle,"Text does not match");