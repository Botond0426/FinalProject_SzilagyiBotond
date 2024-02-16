import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckMaximumQuantityPAGE;

public class CheckMaximumQuantityTests extends BasePage {
    private CheckMaximumQuantityPAGE checkMaximumQuantityPAGE;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        checkMaximumQuantityPAGE = new CheckMaximumQuantityPAGE(driver);
    }
    @Test
    public void buyAnAppleImac(){
        checkMaximumQuantityPAGE.clickOnMyAccount();
        checkMaximumQuantityPAGE.typeInEmailField("max@quantity.com");
        checkMaximumQuantityPAGE.typeInPasswordField("MaxQTY123");
        checkMaximumQuantityPAGE.clickOnLoginButton();
        checkMaximumQuantityPAGE.clickOnHomePage();
        checkMaximumQuantityPAGE.clickOnAppleiMac();
        checkMaximumQuantityPAGE.clickOnAddToCart();
        checkMaximumQuantityPAGE.clickOnViewCart();
        checkMaximumQuantityPAGE.insertQuantityOfProduct("99");
        checkMaximumQuantityPAGE.reloadQuantityOfProduct();

        String actualTitle = checkMaximumQuantityPAGE.getTextAfterReload();
        String expectedTitle = "Success: You have modified your shopping cart!\n" +
                "×";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");


    }

}

