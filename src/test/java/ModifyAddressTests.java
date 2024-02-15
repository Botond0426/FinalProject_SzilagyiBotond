import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ModifyAddressPAGE;

public class ModifyAddressTests extends BasePage {
    private ModifyAddressPAGE modifyAddressPAGE;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        modifyAddressPAGE = new ModifyAddressPAGE(driver);
    }
    @Test
    public void clickOnLoginUser1(){
        modifyAddressPAGE.clickOnLoginUser1();
        modifyAddressPAGE.loginUserEmail("mikecollins@collinsemail.com");
        modifyAddressPAGE.loginUserPassword("testcase123");
        modifyAddressPAGE.clickOnLoginButton();

        modifyAddressPAGE.clickOnModifyYourAddress();
        modifyAddressPAGE.clickOnNewAddress();
        modifyAddressPAGE.typeInFirstNameAddress("tester");
        modifyAddressPAGE.typeInLastNameAddress("tester");
        modifyAddressPAGE.typeInAddress("testCity123");
        modifyAddressPAGE.typeInCityAddress("testcity road 123");
        modifyAddressPAGE.typeInPostalCodeAddress("457171");
        modifyAddressPAGE.typeInCountyAddress("testCounty");
        modifyAddressPAGE.clickOnContinueAddress();
        String actualText = modifyAddressPAGE.getTextOfResult();
        String expectedText ="Your address has been successfully added";
        Assert.assertEquals(actualText,expectedText,"Modification was not successful");
    }

}
