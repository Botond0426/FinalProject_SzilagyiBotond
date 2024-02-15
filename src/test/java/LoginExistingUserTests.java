import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginExistingUserPAGE;

public class LoginExistingUserTests extends BasePage {
    private LoginExistingUserPAGE loginExistingUserPAGE;
    @BeforeMethod

    public void setUp() {
        super.setUp();
        loginExistingUserPAGE = new LoginExistingUserPAGE(driver);
    }
    @Test
    public void loginUserEmail(){

        loginExistingUserPAGE.clickOnLoginUser1();

        loginExistingUserPAGE.loginUserEmail("andrewcollins@andrewmail.com");
        loginExistingUserPAGE.loginUserPassword("testcase123");
        loginExistingUserPAGE.clickOnLoginButton();
    }













}
