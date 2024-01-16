package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckOrderStatusPAGE20;

public class CheckOrderStatus20 extends BasePage {
    private CheckOrderStatusPAGE20 checkOrderStatusPAGE20;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        checkOrderStatusPAGE20 = new CheckOrderStatusPAGE20(driver);
    }

    @Test
    public void LogInUser() {
        checkOrderStatusPAGE20.clickOnMyAccountButton();
        checkOrderStatusPAGE20.typeInEmailField("tester@tester.com");
        checkOrderStatusPAGE20.typeInPasswordField("tester123");
        checkOrderStatusPAGE20.clickOnLoginButton();
        checkOrderStatusPAGE20.clickOnOrderHistory();
        checkOrderStatusPAGE20.clickOnViewOrders();
        String actualTitle = checkOrderStatusPAGE20.getStatusOfOrder();
        String expectedTitle = "Pending";
        Assert.assertEquals(actualTitle, expectedTitle, "Order does not match");
        checkOrderStatusPAGE20.clickOnContinueButton();

    }


}