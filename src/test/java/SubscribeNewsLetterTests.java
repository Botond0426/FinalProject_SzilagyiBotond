import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SubscribeNewsLetterPAGE;

public class SubscribeNewsLetterTests extends BasePage {
    private SubscribeNewsLetterPAGE subscribeNewsLetterPAGE;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        subscribeNewsLetterPAGE = new SubscribeNewsLetterPAGE(driver);
    }
    @Test
    public void clickOnLoginUser1(){
        subscribeNewsLetterPAGE.clickOnLoginUser1();
        subscribeNewsLetterPAGE.loginUserEmail("tester@tester.com");
        subscribeNewsLetterPAGE.loginUserPassword("tester123");
        subscribeNewsLetterPAGE.clickOnLoginButton();

        subscribeNewsLetterPAGE.clickOnSubscribeNL();
        subscribeNewsLetterPAGE.clickOnYesSubscribe();
        subscribeNewsLetterPAGE.clickOnContinueSubscribe();
        subscribeNewsLetterPAGE.clickOnMyAccountButton();
        subscribeNewsLetterPAGE.clickOnLogout1();
    }


}
