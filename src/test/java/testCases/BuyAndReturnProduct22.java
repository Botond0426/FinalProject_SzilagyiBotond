package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.BuySomeProductAndReturnPAGE22;

public class BuyAndReturnProduct22 extends BasePage {
    private BuySomeProductAndReturnPAGE22 buySomeProductAndReturnPAGE22;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        buySomeProductAndReturnPAGE22 = new BuySomeProductAndReturnPAGE22(driver);

    }
    @Test
    public void LoginAccount(){
        buySomeProductAndReturnPAGE22.clickOnMyAccount();
        buySomeProductAndReturnPAGE22.typeInEmailField("tester@tester.com");
        buySomeProductAndReturnPAGE22.typeInPasswordField("tester123");
        buySomeProductAndReturnPAGE22.clickOnLoginButton();

        buySomeProductAndReturnPAGE22.clickOnHomePage();
        buySomeProductAndReturnPAGE22.clickOnPhoneProduct();
        buySomeProductAndReturnPAGE22.clickOnBuyNowButton();

        buySomeProductAndReturnPAGE22.clickOnExistingAddress();
        buySomeProductAndReturnPAGE22.clickOnTnC();
        buySomeProductAndReturnPAGE22.clickOnContinueButton();
        buySomeProductAndReturnPAGE22.clickOnConfirmOrder();
        buySomeProductAndReturnPAGE22.clickOnMyAccount2();
        buySomeProductAndReturnPAGE22.clickOnOrderHistory();
        buySomeProductAndReturnPAGE22.clickOnViewOrder();
        buySomeProductAndReturnPAGE22.clickOnReturnButton();
        buySomeProductAndReturnPAGE22.clickOnOrderError();
        buySomeProductAndReturnPAGE22.clickOnSubmitButton();

        String ActualTitle = buySomeProductAndReturnPAGE22.getTextAfterReturn();
        String ExpectedTitle = "Thank you for submitting your return request. Your request has been sent to the relevant department for processing.";
        Assert.assertEquals(ActualTitle,ExpectedTitle,"Title does not match");
        buySomeProductAndReturnPAGE22.clickOnContinueAfterReturn();



    }
}
