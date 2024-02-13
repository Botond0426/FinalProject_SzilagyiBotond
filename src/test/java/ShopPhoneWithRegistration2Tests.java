import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ShopPhonePAGE2;

public class ShopPhoneWithRegistration2Tests extends BasePage {
    private ShopPhonePAGE2 shopPhonePAGE2;


    @BeforeMethod
    public void setUp() {
        super.setUp();
        shopPhonePAGE2 = new ShopPhonePAGE2(driver);
    }

    @Test(priority = 1)
    public void clickOnPhone() {

        shopPhonePAGE2.clickOnPhone();

        shopPhonePAGE2.clickOnBuyNow();
        shopPhonePAGE2.enterTextInFirstNameField("test");
        shopPhonePAGE2.enterTextInSecondNameField("test");
        shopPhonePAGE2.enterTextInEmailField(generateEmailAddress());

        shopPhonePAGE2.enterPhoneNumber("1234567891");
        shopPhonePAGE2.enterPassword1("abcdefghijklmnop123.");
        shopPhonePAGE2.enterPassword2("abcdefghijklmnop123.");
        shopPhonePAGE2.enterAddress1("testAddress");
        shopPhonePAGE2.enterCity1("testCity");
        shopPhonePAGE2.enterPostCode1("123456");
        shopPhonePAGE2.clickOnSelectRegionCluj();
        shopPhonePAGE2.clickOnPrivacyPolicy();
        shopPhonePAGE2.clickOnTnC();
        shopPhonePAGE2.clickOnContinue();


        shopPhonePAGE2.scrollAndClickOnConfirmOrderButton();


        shopPhonePAGE2.clickOnContinueAfterOrder();
    }

}
