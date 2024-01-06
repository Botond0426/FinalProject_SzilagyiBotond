package testCases;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.RegisterUserPAGE3;

public class RegisterNewAccount3 extends BasePage {
    private RegisterUserPAGE3 registerUserPAGE3;
    @BeforeMethod
    public void setUp() {
        super.setUp();
        registerUserPAGE3 = new RegisterUserPAGE3(driver);
    }

    @Test
    public void clickOnRegisterButton() {
        registerUserPAGE3.clickOnMyAccountButton();
        registerUserPAGE3.clickOnContinueToRegisterButton();
        registerUserPAGE3.clickOnRegisterFirstName("testament");
        registerUserPAGE3.clickOnRegisterLastName("testament");
        registerUserPAGE3.clickOnRegisterEmail("panic@tester.com");
        registerUserPAGE3.clickOnRegisterPhone("0671234123");
        registerUserPAGE3.clickOnRegisterPassword("passwordtest123");
        registerUserPAGE3.clickOnPasswordConfirm("passwordtest123");
        registerUserPAGE3.clickOnAgreementCheckBox();
        registerUserPAGE3.clickOnContinueRegistration();

    }

    @AfterMethod
    public void teardown() {
        // Close the browser
        driver.quit();
    }
}
