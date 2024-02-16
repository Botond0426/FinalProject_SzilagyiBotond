import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SendGiftAndContactUsPAGE;

public class SendGiftAndContactUsTests extends BasePage {
    private SendGiftAndContactUsPAGE sendGiftAndContactUsPAGE;
    @BeforeMethod
    public void setUp() {
        super.setUp();
        sendGiftAndContactUsPAGE = new SendGiftAndContactUsPAGE(driver);
    }
    @Test
    public void clickOnMyAccount(){
        sendGiftAndContactUsPAGE.clickOnMyAccount();
        sendGiftAndContactUsPAGE.typeInEmailField("tester@tester.com");
        sendGiftAndContactUsPAGE.typeInPasswordField("tester123");

        sendGiftAndContactUsPAGE.clickOnLoginButton();

        sendGiftAndContactUsPAGE.moveCursorArrowToMyAccountButton();
        sendGiftAndContactUsPAGE.clickOnMyVoucher();
        sendGiftAndContactUsPAGE.typeInRecipientsNameField("PanicTester");
        sendGiftAndContactUsPAGE.typeInRecipientsEmail("PanicTester@PanicTester.com");
        sendGiftAndContactUsPAGE.clickOnBirthDayCheckbox();
        sendGiftAndContactUsPAGE.typeInTextArea("Happy Birthday!");
        sendGiftAndContactUsPAGE.clickOnTnC();
        sendGiftAndContactUsPAGE.clickOnContinueButton();

        String actualTitle = sendGiftAndContactUsPAGE.getTextAfterSubmit();
        String expectedTitle = "Thank you for purchasing a gift certificate! Once you have completed your order your gift certificate recipient will be sent an e-mail with details how to redeem their gift certificate.";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");

        sendGiftAndContactUsPAGE.clickOnContinueAfterSubmit();
        sendGiftAndContactUsPAGE.clickOnCheckOut();
        sendGiftAndContactUsPAGE.clickOnContactUs();
        sendGiftAndContactUsPAGE.typeInYourNameField("tester tester");

        sendGiftAndContactUsPAGE.typeInTextContactArea("User is not able to send gifts,as there is no payment option available.");
        sendGiftAndContactUsPAGE.clickOnSubmitButton();

        String actualTitle1 = sendGiftAndContactUsPAGE.getMessageAfterContact();
        String expectedTitle1 ="Your enquiry has been successfully sent to the store owner!";
        Assert.assertEquals(actualTitle1,expectedTitle1,"Title does not match");
        sendGiftAndContactUsPAGE.clickOnMyAccountButton();
        sendGiftAndContactUsPAGE.clickOnLogout1();
    }
}
