import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.EditAffiliatePAGE29;

public class EditAffiliateDetails29Tests extends BasePage {
    private EditAffiliatePAGE29 editAffiliatePAGE29;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        editAffiliatePAGE29 = new EditAffiliatePAGE29(driver);
    }

    @Test
    public void clickOnLoginUser1(){
        editAffiliatePAGE29.clickOnLoginUser1();
        editAffiliatePAGE29.loginUserEmail("asde@asde.com");
        editAffiliatePAGE29.loginUserPassword("asde123.");
        editAffiliatePAGE29.clickOnLoginButton();
        editAffiliatePAGE29.clickOnEditAffiliate();
        editAffiliatePAGE29.checkBankTransferCheckbox();
        editAffiliatePAGE29.typeInBankNameField("TestBank");
        editAffiliatePAGE29.typeInBranchNumberField("123123");
        editAffiliatePAGE29.typeInSWIFTcodeField("123123123");
        editAffiliatePAGE29.typeInAccountName("TesterMan");
        editAffiliatePAGE29.typeInAccountNumber("123123123123");
        editAffiliatePAGE29.clickOnSubmit();


        String actualTitle = editAffiliatePAGE29.getMessageAfterSubmit();
        String expectedTitle = "Success: Your account has been successfully updated.";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }
}
