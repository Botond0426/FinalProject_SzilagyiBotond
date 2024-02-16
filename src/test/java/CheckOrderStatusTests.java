import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckOrderStatusPAGE;

public class CheckOrderStatusTests extends BasePage {
    private CheckOrderStatusPAGE checkOrderStatusPAGE;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        checkOrderStatusPAGE = new CheckOrderStatusPAGE(driver);
    }

    @Test
    public void LogInUser() {
        checkOrderStatusPAGE.clickOnMyAccountButton();
        checkOrderStatusPAGE.typeInEmailField("tester@tester.com");
        checkOrderStatusPAGE.typeInPasswordField("tester123");
        checkOrderStatusPAGE.clickOnLoginButton();
        checkOrderStatusPAGE.clickOnOrderHistory();
        checkOrderStatusPAGE.clickOnViewOrders();
        String actualTitle = checkOrderStatusPAGE.getStatusOfOrder();
        String expectedTitle = "Pending";
        Assert.assertEquals(actualTitle, expectedTitle, "Order does not match");
        checkOrderStatusPAGE.clickOnContinueButton();
        checkOrderStatusPAGE.clickOnMyAccountButton2();
        checkOrderStatusPAGE.clickOnLogout1();

    }


}