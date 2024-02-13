import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.RegisterAccountAndModifyPAGE27;

import java.time.Duration;

public class ModifyNewlyRegisteredAccount27Tests extends BasePage {
    private RegisterAccountAndModifyPAGE27 registerAccountAndModifyPAGE27;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        registerAccountAndModifyPAGE27 = new RegisterAccountAndModifyPAGE27(driver);
    }
    @Test
    public void clickOnMyAccount() {
        registerAccountAndModifyPAGE27.clickOnMyAccount();
        registerAccountAndModifyPAGE27.clickOnRegister();
        registerAccountAndModifyPAGE27.typeInFirstNameField("TheBiggestTesterDinSalaj");
        registerAccountAndModifyPAGE27.typeInLastName("TestCaseUser");
        registerAccountAndModifyPAGE27.typeInEmailField(generateEmailAddress());
        registerAccountAndModifyPAGE27.typeInPhoneNumber("0123456789");
        registerAccountAndModifyPAGE27.typeInPassword1("TestCase123.");
        registerAccountAndModifyPAGE27.typeInPassword2("TestCase123.");
        registerAccountAndModifyPAGE27.checkPrivacyPolicy();
        registerAccountAndModifyPAGE27.registerUser();

        registerAccountAndModifyPAGE27.clickOnContinueMyAccount();
        registerAccountAndModifyPAGE27.clickOnModify();

        registerAccountAndModifyPAGE27.clearFirstName();
        registerAccountAndModifyPAGE27.clearLastName();
        registerAccountAndModifyPAGE27.clearEmail();
        registerAccountAndModifyPAGE27.modifyFirstName("vxyz");
        registerAccountAndModifyPAGE27.modifyLastName("vxyz");
        registerAccountAndModifyPAGE27.modifyEmail(generateEmailAddress());
        registerAccountAndModifyPAGE27.submitModification();
        String actualTitle = registerAccountAndModifyPAGE27.getMessageAfterModification();
        String expectedTitle ="Success: Your account has been successfully updated.";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");

        try {
            // Click on the element that triggers the alert
            registerAccountAndModifyPAGE27.clickOnModify();

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
    }
}
