import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckIfComparisonWorksPAGE16;

public class CheckComparisonTitles16Tests extends BasePage {
    private CheckIfComparisonWorksPAGE16 checkIfComparisonWorksPAGE16;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        checkIfComparisonWorksPAGE16 = new CheckIfComparisonWorksPAGE16(driver);
    }

    @Test
    public void appleProduct() {
        checkIfComparisonWorksPAGE16.clickOnAppleProduct();
        checkIfComparisonWorksPAGE16.clickOnAppleComparison();
        checkIfComparisonWorksPAGE16.clickOnHomePageButton();
        checkIfComparisonWorksPAGE16.clickOnFridge();
        checkIfComparisonWorksPAGE16.clickOnCompareFridgeButton();
        checkIfComparisonWorksPAGE16.clickOnCompareButton();

        String actualTitle = checkIfComparisonWorksPAGE16.getTextOf1stItem();
        String expectedTitle = "Apple Cinema 30\"";
        Assert.assertEquals(actualTitle, expectedTitle, "Text does not match");

        String actualTitle2 = checkIfComparisonWorksPAGE16.getTextOf2ndItem();
        String expectedTitle2 = "iPhone";
        Assert.assertEquals(actualTitle, expectedTitle, "Text does not match");
    }
}
