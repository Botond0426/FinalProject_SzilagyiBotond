import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.UpdateAccountInfoPAGE;

public class UpdateAccountInfoTests extends BasePage {
    private UpdateAccountInfoPAGE updateAccountInfoPAGE;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        updateAccountInfoPAGE = new UpdateAccountInfoPAGE(driver);
    }
    @Test
    public void clickOnLoginUser1(){
        updateAccountInfoPAGE.clickOnLoginUser1();
        updateAccountInfoPAGE.loginUserEmail("andrewcollins@andrewmail.com");
        updateAccountInfoPAGE.loginUserPassword("testcase123");
        updateAccountInfoPAGE.clickOnLoginButton();

        updateAccountInfoPAGE.clickOnUpdateAccount();
        updateAccountInfoPAGE.clickOnSubmitAccountUpdate();

        String actualTitle = updateAccountInfoPAGE.setGetTextAfterUpdate();
        String expectedTitle = "Success: Your account has been successfully updated.";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match with expected.");
        updateAccountInfoPAGE.clickOnMyAccountButton();
        updateAccountInfoPAGE.clickOnLogout1();
    }





}
