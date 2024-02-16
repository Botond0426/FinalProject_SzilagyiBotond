import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddingNewAddressPAGE;
import pages.BasePage;

public class AddingNewAddressTests extends BasePage {
    private AddingNewAddressPAGE addingNewAddressPAGE;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        addingNewAddressPAGE = new AddingNewAddressPAGE(driver);

    }
    @Test
    public void LogIn() {
        addingNewAddressPAGE.clickOnMyAccount();
        addingNewAddressPAGE.typeInEmailField("tester@tester.com");
        addingNewAddressPAGE.typeInPasswordField("tester123");
        addingNewAddressPAGE.clickOnLoginButton();
        addingNewAddressPAGE.clickOnAddressBookButton();

        addingNewAddressPAGE.clickOnNewAddressButton();
        addingNewAddressPAGE.typeInFirstNameField("tester");
        addingNewAddressPAGE.typeInLastNameField("tester");
        addingNewAddressPAGE.typeInNewAddressField("1234");
        addingNewAddressPAGE.typeInNewCityField("Miami");
        addingNewAddressPAGE.typeInPostalCodeField("451212");
        addingNewAddressPAGE.chooseNewCountry();
        addingNewAddressPAGE.chooseNewCounty();
        addingNewAddressPAGE.clickOnContinueButton();
        addingNewAddressPAGE.clickOnMyAccountButton();
        addingNewAddressPAGE.clickOnLogout1();

    }



}
