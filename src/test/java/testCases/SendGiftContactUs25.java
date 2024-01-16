package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SendGiftAndContactUsPAGE25;

public class SendGiftContactUs25 extends BasePage {
    private SendGiftAndContactUsPAGE25 sendGiftAndContactUsPAGE25;
    @BeforeMethod
    public void setUp() {
        super.setUp();
        sendGiftAndContactUsPAGE25 = new SendGiftAndContactUsPAGE25(driver);
    }
    @Test
    public void clickOnMyAccount(){
        sendGiftAndContactUsPAGE25.clickOnMyAccount();
        sendGiftAndContactUsPAGE25.typeInEmailField("tester@tester.com");
        sendGiftAndContactUsPAGE25.typeInPasswordField("tester123");
        sendGiftAndContactUsPAGE25.clickOnLoginButton();
    }
    public void moveCursorArrowToMyAccountButton(){
        sendGiftAndContactUsPAGE25.moveCursorArrowToMyAccountButton();
        sendGiftAndContactUsPAGE25.clickOnMyVoucher();
        sendGiftAndContactUsPAGE25.typeInRecipientsNameField("PanicTester");
        sendGiftAndContactUsPAGE25.typeInRecipientsEmail("PanicTester@PanicTester.com");
        sendGiftAndContactUsPAGE25.clickOnBirthDayCheckbox();
        sendGiftAndContactUsPAGE25.typeInTextArea("Happy Birthday!");
        sendGiftAndContactUsPAGE25.clickOnTnC();
        sendGiftAndContactUsPAGE25.clickOnContinueButton();
    }
    public void getTextAfterSubmit(){
        String actualTitle = sendGiftAndContactUsPAGE25.getTextAfterSubmit();
        String expectedTitle = "Thank you for purchasing a gift certificate! Once you have completed your order your gift certificate recipient will be sent an e-mail with details how to redeem their gift certificate.\n";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }
    public void clickOnContinueAfterSubmit(){
        sendGiftAndContactUsPAGE25.clickOnContinueAfterSubmit();
        sendGiftAndContactUsPAGE25.clickOnCheckOut();
        sendGiftAndContactUsPAGE25.clickOnContactUs();
        sendGiftAndContactUsPAGE25.typeInYourNameField("tester tester");
        sendGiftAndContactUsPAGE25.typeInYourEmailField("tester@tester.com");
        sendGiftAndContactUsPAGE25.typeInTextContactArea("User is not able to send gifts,as there is no payment option available.");
        sendGiftAndContactUsPAGE25.clickOnSubmitButton();
    }
    public void getMessageAfterContact(){
        String actualTitle1 = sendGiftAndContactUsPAGE25.getMessageAfterContact();
        String expectedTitle1 ="Your enquiry has been successfully sent to the store owner!";
        Assert.assertEquals(actualTitle1,expectedTitle1,"Title does not match");
    }
}
