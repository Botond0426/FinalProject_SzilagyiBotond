import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckComparisonPAGE;

public class CheckComparisonTests extends BasePage {
    private CheckComparisonPAGE checkComparisonPAGE;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        checkComparisonPAGE = new CheckComparisonPAGE(driver);
    }

    @Test
    public void appleProduct() {
        checkComparisonPAGE.clickOnAppleProduct();
        checkComparisonPAGE.clickOnAppleComparison();
        checkComparisonPAGE.clickOnHomePageButton();
        checkComparisonPAGE.clickOnFridge();
        checkComparisonPAGE.clickOnCompareFridgeButton();
        checkComparisonPAGE.clickOnCompareButton();

        String actualTitle = checkComparisonPAGE.getTextOf1stItem();
        String expectedTitle = "Apple Cinema 30\"";
        Assert.assertEquals(actualTitle, expectedTitle, "Text does not match");

        String actualTitle2 = checkComparisonPAGE.getTextOf2ndItem();
        String expectedTitle2 = "iPhone";
        Assert.assertEquals(actualTitle, expectedTitle, "Text does not match");
    }
}
