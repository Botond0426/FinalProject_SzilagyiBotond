import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.BuyMacWithMaxQtyPAGE18;

public class BuyMacMaximumQty18Tests extends BasePage {
    private BuyMacWithMaxQtyPAGE18 buyMacWithMaxQtyPAGE18;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        buyMacWithMaxQtyPAGE18 = new BuyMacWithMaxQtyPAGE18(driver);
    }
    @Test
    public void buyAnAppleImac(){
        buyMacWithMaxQtyPAGE18.clickOnMyAccount();
        buyMacWithMaxQtyPAGE18.typeInEmailField("tester@tester.com");
        buyMacWithMaxQtyPAGE18.typeInPasswordField("tester123");
        buyMacWithMaxQtyPAGE18.clickOnLoginButton();
        buyMacWithMaxQtyPAGE18.clickOnHomePage();
        buyMacWithMaxQtyPAGE18.clickOnAppleiMac();
        buyMacWithMaxQtyPAGE18.clickOnAddToCart();
        buyMacWithMaxQtyPAGE18.clickOnViewCart();
        buyMacWithMaxQtyPAGE18.insertQuantityOfProduct("5");
        buyMacWithMaxQtyPAGE18.reloadQuantityOfProduct();
        buyMacWithMaxQtyPAGE18.clickOnCheckOut();
        buyMacWithMaxQtyPAGE18.clickOnSavedAddress();
        buyMacWithMaxQtyPAGE18.clickOnTnCcheckBox();
        buyMacWithMaxQtyPAGE18.clickOnContinueButton();
        buyMacWithMaxQtyPAGE18.clickOnConfirmOrderButton();

        String actualTitle = buyMacWithMaxQtyPAGE18.getTextAfterPurchase();
        String expectedTitle = "Your order has been successfully processed!";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }
}

