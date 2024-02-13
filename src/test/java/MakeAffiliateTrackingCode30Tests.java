import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.MakeAffiliateTrackingPAGE30;

public class MakeAffiliateTrackingCode30Tests extends BasePage {
    private MakeAffiliateTrackingPAGE30 makeAffiliateTrackingPAGE30;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        makeAffiliateTrackingPAGE30 = new MakeAffiliateTrackingPAGE30(driver);
    }
    @Test
    public void clickOnLoginUser1(){
        makeAffiliateTrackingPAGE30.clickOnLoginUser1();
        makeAffiliateTrackingPAGE30.loginUserEmail("tester@tester.com");
        makeAffiliateTrackingPAGE30.loginUserPassword("tester123");
        makeAffiliateTrackingPAGE30.clickOnLoginButton();
        makeAffiliateTrackingPAGE30.clickOnAffiliateTracking();
        makeAffiliateTrackingPAGE30.typeInTrackingCodeField("tester123");



        makeAffiliateTrackingPAGE30.typeInHTCTouchHD("HTC Touch HD");
        makeAffiliateTrackingPAGE30.clickOnSubmit();
    }
}
