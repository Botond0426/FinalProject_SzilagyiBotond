import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckReturnedProductPAGE;

public class CheckReturnedProductTests extends BasePage {
    private CheckReturnedProductPAGE checkReturnedProductPAGE;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        checkReturnedProductPAGE = new CheckReturnedProductPAGE(driver);
    }
    @Test
    public void clickOnMyAccount(){
        checkReturnedProductPAGE.clickOnMyAccount();
        checkReturnedProductPAGE.typeInEmailField("tester@tester.com");
        checkReturnedProductPAGE.typeInPasswordField("tester123");
        checkReturnedProductPAGE.clickOnLoginButton();
        checkReturnedProductPAGE.clickOnReturnRequests();
        checkReturnedProductPAGE.clickOnReturnedProduct();
        String actualTitle = checkReturnedProductPAGE.getTextOfReturnedProduct();
        String expectedTitle = "HTC Touch HD";
        Assert.assertEquals(actualTitle,expectedTitle,"Product does not match");
        checkReturnedProductPAGE.clickOnMyAccountButton2();
        checkReturnedProductPAGE.clickOnLogout1();

    }




}
