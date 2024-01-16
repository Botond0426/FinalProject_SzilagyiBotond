package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.RegisterForAffiliatePAGE28;

public class RegisterAffiliate28 extends BasePage {
    private RegisterForAffiliatePAGE28 registerForAffiliatePAGE28;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        registerForAffiliatePAGE28 = new RegisterForAffiliatePAGE28(driver);
    }
}
