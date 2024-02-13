import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SendGiftAndGetResultPAGE24;

public class SendGiftSeeResult24Tests extends BasePage {
    SendGiftAndGetResultPAGE24 sendGiftAndGetResultPAGE24;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        sendGiftAndGetResultPAGE24 = new SendGiftAndGetResultPAGE24(driver);

    }
    @Test
    public void clickOnMyAccount() {
        sendGiftAndGetResultPAGE24.clickOnMyAccount();

        sendGiftAndGetResultPAGE24.typeInEmailField("tester@tester.com");
        sendGiftAndGetResultPAGE24.typeInPasswordField("tester123");
        sendGiftAndGetResultPAGE24.clickOnLoginButton();
        sendGiftAndGetResultPAGE24.moveCursorArrowToMyAccountButton();
        sendGiftAndGetResultPAGE24.clickOnMyVoucherButton();
        sendGiftAndGetResultPAGE24.typeInRecipientsNameField("PanicTester");
        sendGiftAndGetResultPAGE24.typeInRecipientsEmail("PanicTester@PanicTester.com");
        sendGiftAndGetResultPAGE24.clickOnBirthDayCheckbox();
        sendGiftAndGetResultPAGE24.typeInTextArea("Happy Birthday!");
        sendGiftAndGetResultPAGE24.clickOnTnC();
        sendGiftAndGetResultPAGE24.clickOnContinueButton();

        sendGiftAndGetResultPAGE24.clickOnContinueAfterSubmit();
        sendGiftAndGetResultPAGE24.clickOnCheckOut();
        String actualTitle1 = sendGiftAndGetResultPAGE24.getErrorMessage();
        String expectedTitle2 = "Warning: No Payment options are available. Please\n" +
                "contact us\n" +
                "for assistance!";
        Assert.assertEquals(actualTitle1,expectedTitle2,"Error Text does not match.");

    }



}

