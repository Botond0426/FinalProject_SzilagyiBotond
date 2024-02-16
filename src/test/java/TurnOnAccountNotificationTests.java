import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TurnOnAccountNotificationPAGE;
import pages.BasePage;

public class TurnOnAccountNotificationTests extends BasePage {
    private TurnOnAccountNotificationPAGE turnOnAccountNotificationPAGE19;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        turnOnAccountNotificationPAGE19 = new TurnOnAccountNotificationPAGE(driver);
    }
    @Test
    public void clickOnMyAccount(){
        turnOnAccountNotificationPAGE19.clickOnMyAccount();
        turnOnAccountNotificationPAGE19.typeInEmailField("tester@tester.com");
        turnOnAccountNotificationPAGE19.typeInPasswordField("tester123");
        turnOnAccountNotificationPAGE19.clickOnLoginButton();

        turnOnAccountNotificationPAGE19.clickOnNotificationButton();
        turnOnAccountNotificationPAGE19.clickOnBrandButton();
        turnOnAccountNotificationPAGE19.clickOnContinueButton();
        turnOnAccountNotificationPAGE19.clickOnMyAccountButton();
        turnOnAccountNotificationPAGE19.clickOnLogout1();
    }



}
