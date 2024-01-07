package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.MegaMenuAboutUsTitlePAGE7;

public class VerifyTitleAfterMegaMenu7 extends BasePage {
    private MegaMenuAboutUsTitlePAGE7 megaMenuAboutUsTitlePAGE7;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        megaMenuAboutUsTitlePAGE7 = new MegaMenuAboutUsTitlePAGE7(driver);
    }
    @Test
    public void clickOnMegaMenu() {
        megaMenuAboutUsTitlePAGE7.clickOnMegaMenu1();
        String actualTitle =megaMenuAboutUsTitlePAGE7.getTextOfAboutUs();
        String expectedTitle = "About Us";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");


    }









}
