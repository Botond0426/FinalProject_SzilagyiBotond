package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SendGiftAndGetResultPAGE24;

public class SendGiftSeeResut24 extends BasePage {
    SendGiftAndGetResultPAGE24 sendGiftAndGetResultPAGE24;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        sendGiftAndGetResultPAGE24 = new SendGiftAndGetResultPAGE24(driver);

    }
    @Test
    public void clickOnMyVoucher() {
        sendGiftAndGetResultPAGE24.clickOnMyAccount();
    
        sendGiftAndGetResultPAGE24.typeInEmailField("tester@tester.com");
        sendGiftAndGetResultPAGE24.typeInPasswordField("tester123");
        sendGiftAndGetResultPAGE24.clickOnLoginButton();
        sendGiftAndGetResultPAGE24.clickOnMyVoucher();
        sendGiftAndGetResultPAGE24.typeInRecipientsNameField("PanicTester");
        sendGiftAndGetResultPAGE24.typeInRecipientsEmail("PanicTester@PanicTester.com");
        sendGiftAndGetResultPAGE24.clickOnBirthDayCheckbox();
        sendGiftAndGetResultPAGE24.typeInTextArea("Happy Birthday!");
        sendGiftAndGetResultPAGE24.clickOnTnC();
        sendGiftAndGetResultPAGE24.clickOnContinueButton();

        String actualTitle = sendGiftAndGetResultPAGE24.getTextAfterSubmit();
        String expectedTitle = "Thank you for purchasing a gift certificate! Once you have completed your order your gift certificate recipient will be sent an e-mail with details how to redeem their gift certificate.";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
        sendGiftAndGetResultPAGE24.clickOnContinueAfterSubmit();
        sendGiftAndGetResultPAGE24.clickOnCheckOut();
        String actualTitle1 = sendGiftAndGetResultPAGE24.getErrorMessage();
        String expectedTitle2 = "asd";
        Assert.assertEquals(actualTitle1,expectedTitle2,"Error Text does not match.");
    }





}

