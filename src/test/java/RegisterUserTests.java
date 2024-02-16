import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.RegisterUserPAGE;

import java.util.Random;

public class RegisterUserTests extends BasePage {
    private RegisterUserPAGE registerUserPAGE3;
    private Random random;
    @BeforeMethod
    public void setUp() {
        super.setUp();
        registerUserPAGE3 = new RegisterUserPAGE(driver);
        random = new Random();
    }

    @Test
    public void clickOnRegisterButton() {
        registerUserPAGE3.clickOnMyAccountButton();
        registerUserPAGE3.clickOnContinueToRegisterButton();
        String firstName = "testament";
        String lastName = "testament";
        String email = generateRandomEmail();
        String phone = generateRandomPhone();
        String password = "passwordtest123";
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

    // Method to generate a random email address
    private String generateRandomEmail() {
        String domain = "@example.com";
        return "test" + random.nextInt(1000) + domain;
    }

    // Method to generate a random phone number
    private String generateRandomPhone() {
        StringBuilder phone = new StringBuilder("067");

        // Generate random digits for phone number
        for (int i = 0; i < 7; i++) {
            phone.append(random.nextInt(10)); // Random digit from 0 to 9
        }

        return phone.toString();
    }
}
