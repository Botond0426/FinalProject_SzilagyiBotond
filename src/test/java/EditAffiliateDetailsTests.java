import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.EditAffiliateDetailsPAGE;

public class EditAffiliateDetailsTests extends BasePage {
    private EditAffiliateDetailsPAGE editAffiliateDetailsPAGE;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        editAffiliateDetailsPAGE = new EditAffiliateDetailsPAGE(driver);
    }

    @Test
    public void clickOnLoginUser1(){
        editAffiliateDetailsPAGE.clickOnLoginUser1();
        editAffiliateDetailsPAGE.loginUserEmail("asde@asde.com");
        editAffiliateDetailsPAGE.loginUserPassword("asde123.");
        editAffiliateDetailsPAGE.clickOnLoginButton();
        editAffiliateDetailsPAGE.clickOnEditAffiliate();
        editAffiliateDetailsPAGE.checkBankTransferCheckbox();
        editAffiliateDetailsPAGE.typeInBankNameField("TestBank");
        editAffiliateDetailsPAGE.typeInBranchNumberField("123123");
        editAffiliateDetailsPAGE.typeInSWIFTcodeField("123123123");
        editAffiliateDetailsPAGE.typeInAccountName("TesterMan");
        editAffiliateDetailsPAGE.typeInAccountNumber("123123123123");
        editAffiliateDetailsPAGE.clickOnSubmit();


        String actualTitle = editAffiliateDetailsPAGE.getMessageAfterSubmit();
        String expectedTitle = "Success: Your account has been successfully updated.";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
        editAffiliateDetailsPAGE.clickOnMyAccountButton();
        editAffiliateDetailsPAGE.clickOnLogout1();
    }
}
