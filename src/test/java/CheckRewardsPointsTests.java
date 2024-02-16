import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckRewardsPointsPAGE;

public class CheckRewardsPointsTests extends BasePage {
    private CheckRewardsPointsPAGE checkRewardsPointsPAGE;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        checkRewardsPointsPAGE = new CheckRewardsPointsPAGE(driver);
    }
    @Test
    public void clickOnLoginUser1(){
        checkRewardsPointsPAGE.clickOnLoginUser1();
        checkRewardsPointsPAGE.loginUserEmail("tester@tester.com");
        checkRewardsPointsPAGE.loginUserPassword("tester123");
        checkRewardsPointsPAGE.clickOnLoginButton();

        checkRewardsPointsPAGE.clickOnRewardPoints();
        checkRewardsPointsPAGE.getTextOfRewardPoints();
        String actualTitle = checkRewardsPointsPAGE.getTextOfRewardPoints();
        String expectedTitle = "0";
        Assert.assertEquals(actualTitle,expectedTitle,"Your RewardsPoint does not match with expected");
        checkRewardsPointsPAGE.clickOnContinueInRewards();
        checkRewardsPointsPAGE.clickOnMyAccountButton();
        checkRewardsPointsPAGE.clickOnLogout1();
    }
}
