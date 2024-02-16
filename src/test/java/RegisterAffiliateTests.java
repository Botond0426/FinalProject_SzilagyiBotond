import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.RegisterAffiliatePAGE;

public class RegisterAffiliateTests extends BasePage {
    private RegisterAffiliatePAGE registerAffiliatePAGE;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        registerAffiliatePAGE = new RegisterAffiliatePAGE(driver);
    }
    @Test
    public void clickOnLoginUser1(){
        registerAffiliatePAGE.clickOnLoginUser1();
        registerAffiliatePAGE.loginUserEmail("testman@testman.com");
        registerAffiliatePAGE.loginUserPassword("TestMan123.");
        registerAffiliatePAGE.clickOnLoginButton();
        registerAffiliatePAGE.clickOnAffiliate();
        registerAffiliatePAGE.typeInCompanyField("TestMan Ltd.");
        registerAffiliatePAGE.typeInWebsiteField("www.testmanltd.com");
        registerAffiliatePAGE.typeInTaxIDField("EU12345678");
        registerAffiliatePAGE.checkPaypal();
        registerAffiliatePAGE.typeInEmailForPayPal("aleco@aleco.com");
        registerAffiliatePAGE.clickOnSignButton();
        registerAffiliatePAGE.clickOnMyAccountButton();
        registerAffiliatePAGE.clickOnLogout1();
    }
}
