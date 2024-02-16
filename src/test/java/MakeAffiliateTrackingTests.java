import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.MakeAffiliateTrackingPAGE;

public class MakeAffiliateTrackingTests extends BasePage {
    private MakeAffiliateTrackingPAGE makeAffiliateTrackingPAGE;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        makeAffiliateTrackingPAGE = new MakeAffiliateTrackingPAGE(driver);
    }
    @Test
    public void clickOnLoginUser1(){
        makeAffiliateTrackingPAGE.clickOnLoginUser1();
        makeAffiliateTrackingPAGE.loginUserEmail("tester@tester.com");
        makeAffiliateTrackingPAGE.loginUserPassword("tester123");
        makeAffiliateTrackingPAGE.clickOnLoginButton();
        makeAffiliateTrackingPAGE.clickOnAffiliateTracking();
        makeAffiliateTrackingPAGE.typeInTrackingCodeField("tester123");



        makeAffiliateTrackingPAGE.typeInHTCTouchHD("HTC Touch HD");
        makeAffiliateTrackingPAGE.clickOnSubmit();
        makeAffiliateTrackingPAGE.clickOnMyAccountButton();
        makeAffiliateTrackingPAGE.clickOnLogout1();
    }
}
