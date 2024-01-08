package testCases;

import org.testng.annotations.BeforeMethod;
import pages.BasePage;
import pages.LoginExistingUserPAGE9;

public class LoginExistingUser9 extends BasePage {
    private LoginExistingUserPAGE9 loginExistingUserPAGE9;
    @BeforeMethod

    public void setUp() {
        super.setUp();
        loginExistingUserPAGE9 = new LoginExistingUserPAGE9(driver);
    }
    public void loginUserEmail(){
        loginExistingUserPAGE9.clickOnLoginUser1();
    }
    public void loginUserPassword(){
        loginExistingUserPAGE9.loginUserEmail("tester@tester.com");
        loginExistingUserPAGE9.loginUserPassword("tester123");
        loginExistingUserPAGE9.clickOnLoginButton();
    }













}
