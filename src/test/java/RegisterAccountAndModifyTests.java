import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.RegisterAccountAndModifyPAGE;

import java.time.Duration;

public class RegisterAccountAndModifyTests extends BasePage {
    private RegisterAccountAndModifyPAGE registerAccountAndModifyPAGE;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        registerAccountAndModifyPAGE = new RegisterAccountAndModifyPAGE(driver);
    }
    @Test
    public void clickOnMyAccount() {
        registerAccountAndModifyPAGE.clickOnMyAccount();
        registerAccountAndModifyPAGE.clickOnRegister();
        registerAccountAndModifyPAGE.typeInFirstNameField("TheBiggestTesterDinSalaj");
        registerAccountAndModifyPAGE.typeInLastName("TestCaseUser");
        registerAccountAndModifyPAGE.typeInEmailField(generateEmailAddress());
        registerAccountAndModifyPAGE.typeInPhoneNumber("0123456789");
        registerAccountAndModifyPAGE.typeInPassword1("TestCase123.");
        registerAccountAndModifyPAGE.typeInPassword2("TestCase123.");
        registerAccountAndModifyPAGE.checkPrivacyPolicy();
        registerAccountAndModifyPAGE.registerUser();

        registerAccountAndModifyPAGE.clickOnContinueMyAccount();
        registerAccountAndModifyPAGE.clickOnModify();

        registerAccountAndModifyPAGE.clearFirstName();
        registerAccountAndModifyPAGE.clearLastName();
        registerAccountAndModifyPAGE.clearEmail();
        registerAccountAndModifyPAGE.modifyFirstName("vxyz");
        registerAccountAndModifyPAGE.modifyLastName("vxyz");
        registerAccountAndModifyPAGE.modifyEmail(generateEmailAddress());
        registerAccountAndModifyPAGE.submitModification();
        String actualTitle = registerAccountAndModifyPAGE.getMessageAfterModification();
        String expectedTitle ="Success: Your account has been successfully updated.";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");

        try {
            // Click on the element that triggers the alert
            registerAccountAndModifyPAGE.clickOnModify();

            // Wait for the alert to be present
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.alertIsPresent());

            // Switch to the alert and dismiss it
            Alert alert = driver.switchTo().alert();
            alert.dismiss();
        } catch (Exception e) {
            // Handle exceptions or log if necessary
            e.printStackTrace();
        }
        registerAccountAndModifyPAGE.clickOnMyAccountButton();
        registerAccountAndModifyPAGE.clickOnLogout1();
    }
}
