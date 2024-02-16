import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SendGiftAndGetResultPAGE;

public class SendGiftAndSeeResultTests extends BasePage {
    SendGiftAndGetResultPAGE sendGiftAndGetResultPAGE;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        sendGiftAndGetResultPAGE = new SendGiftAndGetResultPAGE(driver);

    }
    @Test
    public void clickOnMyAccount() {
        sendGiftAndGetResultPAGE.clickOnMyAccount();

        sendGiftAndGetResultPAGE.typeInEmailField("panicboy@gmail.com");
        sendGiftAndGetResultPAGE.typeInPasswordField("panicboy123");
        sendGiftAndGetResultPAGE.clickOnLoginButton();
        sendGiftAndGetResultPAGE.moveCursorArrowToMyAccountButton();
        sendGiftAndGetResultPAGE.clickOnMyVoucherButton();
        sendGiftAndGetResultPAGE.typeInRecipientsNameField("PanicTester");
        sendGiftAndGetResultPAGE.typeInRecipientsEmail("PanicTester@PanicTester.com");
        sendGiftAndGetResultPAGE.clickOnBirthDayCheckbox();
        sendGiftAndGetResultPAGE.typeInTextArea("Happy Birthday!");
        sendGiftAndGetResultPAGE.clickOnTnC();
        sendGiftAndGetResultPAGE.clickOnContinueButton();

        sendGiftAndGetResultPAGE.clickOnContinueAfterSubmit();
        sendGiftAndGetResultPAGE.clickOnCheckOut();
        String actualTitle1 = sendGiftAndGetResultPAGE.getErrorMessage();
        String expectedTitle2 = "Warning: No Payment options are available. Please\n" +
                "contact us\n" +
                "for assistance!";
        Assert.assertEquals(actualTitle1,expectedTitle2,"Error Text does not match.");
        sendGiftAndGetResultPAGE.clickOnMyAccountButton();
        sendGiftAndGetResultPAGE.clickOnLogout1();

    }



}

