package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddingNewAccountAddressPAGE21;
import pages.BasePage;

public class AddingNewAddress21 extends BasePage {
    private AddingNewAccountAddressPAGE21 addingNewAccountAddressPAGE21;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        addingNewAccountAddressPAGE21 = new AddingNewAccountAddressPAGE21(driver);

    }
    @Test
    public void LogIn() {
        addingNewAccountAddressPAGE21.clickOnMyAccount();
        addingNewAccountAddressPAGE21.typeInEmailField("tester@tester.com");
        addingNewAccountAddressPAGE21.typeInPasswordField("tester123");
        addingNewAccountAddressPAGE21.clickOnLoginButton();
    }
    public void ChangeAddress(){
        addingNewAccountAddressPAGE21.clickOnNewAddressButton();
        addingNewAccountAddressPAGE21.typeInFirstNameField("tester");
        addingNewAccountAddressPAGE21.typeInLastNameField("tester");
        addingNewAccountAddressPAGE21.typeInNewAddressField("1234");
        addingNewAccountAddressPAGE21.typeInNewCityField("Miami");
        addingNewAccountAddressPAGE21.typeInPostalCodeField("451212");
        addingNewAccountAddressPAGE21.chooseNewCountry();
        addingNewAccountAddressPAGE21.chooseNewCounty();
        addingNewAccountAddressPAGE21.clickOnContinueButton();

    }



}
