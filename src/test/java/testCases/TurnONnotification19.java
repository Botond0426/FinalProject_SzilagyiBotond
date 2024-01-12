package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountNotificationPAGE19;
import pages.BasePage;

public class TurnONnotification19 extends BasePage {
    private AccountNotificationPAGE19 accountNotificationPAGE19;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        accountNotificationPAGE19 = new AccountNotificationPAGE19(driver);
    }
    @Test
    public void clickOnMyAccount(){
        accountNotificationPAGE19.clickOnMyAccount();
        accountNotificationPAGE19.typeInEmailField("tester@tester.com");
        accountNotificationPAGE19.typeInPasswordField("tester123");
        accountNotificationPAGE19.clickOnLoginButton();
    }
    public void clickOnNotificationButton(){
        accountNotificationPAGE19.clickOnNotificationButton();
        accountNotificationPAGE19.clickOnBrandButton();
        accountNotificationPAGE19.clickOnContinueButton();
    }



}
