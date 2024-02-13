import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckReturnedProductsPAGE23;

public class CheckProductInReturned23Tests extends BasePage {
    private CheckReturnedProductsPAGE23 checkReturnedProductsPAGE23;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        checkReturnedProductsPAGE23 = new CheckReturnedProductsPAGE23(driver);
    }
    @Test
    public void clickOnMyAccount(){
        checkReturnedProductsPAGE23.clickOnMyAccount();
        checkReturnedProductsPAGE23.typeInEmailField("tester@tester.com");
        checkReturnedProductsPAGE23.typeInPasswordField("tester123");
        checkReturnedProductsPAGE23.clickOnLoginButton();
        checkReturnedProductsPAGE23.clickOnReturnRequests();
        checkReturnedProductsPAGE23.clickOnReturnedProduct();
        String actualTitle = checkReturnedProductsPAGE23.getTextOfReturnedProduct();
        String expectedTitle = "HTC Touch HD";
        Assert.assertEquals(actualTitle,expectedTitle,"Product does not match");

    }




}
