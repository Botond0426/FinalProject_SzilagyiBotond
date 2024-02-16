import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.BuyProductAndReturnPAGE;

public class BuyProductAndReturnTests extends BasePage {
    private BuyProductAndReturnPAGE buyProductAndReturnPAGE;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        buyProductAndReturnPAGE = new BuyProductAndReturnPAGE(driver);

    }
    @Test
    public void LoginAccount(){
        buyProductAndReturnPAGE.clickOnMyAccount();
        buyProductAndReturnPAGE.typeInEmailField("tester@tester.com");
        buyProductAndReturnPAGE.typeInPasswordField("tester123");
        buyProductAndReturnPAGE.clickOnLoginButton();

        buyProductAndReturnPAGE.clickOnHomePage();
        buyProductAndReturnPAGE.clickOnPhoneProduct();
        buyProductAndReturnPAGE.clickOnBuyNowButton();

        buyProductAndReturnPAGE.clickOnExistingAddress();
        buyProductAndReturnPAGE.clickOnTnC();
        buyProductAndReturnPAGE.clickOnContinueButton();
        buyProductAndReturnPAGE.clickOnConfirmOrder();
        buyProductAndReturnPAGE.clickOnMyAccount2();
        buyProductAndReturnPAGE.clickOnOrderHistory();
        buyProductAndReturnPAGE.clickOnViewOrder();
        buyProductAndReturnPAGE.clickOnReturnButton();
        buyProductAndReturnPAGE.clickOnOrderError();
        buyProductAndReturnPAGE.clickOnSubmitButton();

        String ActualTitle = buyProductAndReturnPAGE.getTextAfterReturn();
        String ExpectedTitle = "Thank you for submitting your return request. Your request has been sent to the relevant department for processing.";
        Assert.assertEquals(ActualTitle,ExpectedTitle,"Title does not match");
        buyProductAndReturnPAGE.clickOnContinueAfterReturn();
        buyProductAndReturnPAGE.clickOnMyAccountButton3();
        buyProductAndReturnPAGE.clickOnLogout1();



    }
}
