import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.DeleteAddressPAGE;

public class DeleteAddressTests extends BasePage {
    private DeleteAddressPAGE deleteAddressPAGE;
    @BeforeMethod
    public void setUp(){
     super.setUp();
     deleteAddressPAGE = new DeleteAddressPAGE(driver);
    }
    @Test
    public void clickOnLoginUser1(){
        deleteAddressPAGE.clickOnLoginUser1();
        deleteAddressPAGE.loginUserEmail("salajean@salajean.com");
        deleteAddressPAGE.loginUserPassword("testcase123");
        deleteAddressPAGE.clickOnLoginButton();

        deleteAddressPAGE.clickOnModifyYourAddress();
        deleteAddressPAGE.clickOnDeleteAddress();
        deleteAddressPAGE.clickOnLogout1();
    }
}
