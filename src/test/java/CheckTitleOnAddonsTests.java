import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CheckTitleOnAddonsPAGE;
import pages.BasePage;

public class CheckTitleOnAddonsTests extends BasePage {
    private CheckTitleOnAddonsPAGE addOnsModuleSonyPAGE6;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        addOnsModuleSonyPAGE6 = new CheckTitleOnAddonsPAGE(driver);
    }

    @Test
    public void clickOnAddons1() {
        addOnsModuleSonyPAGE6.hoverOverAddOns1(); // Hover over Addons1
        addOnsModuleSonyPAGE6.clickOnModules1();
        addOnsModuleSonyPAGE6.clickOnSony1();

        String actualTitle = addOnsModuleSonyPAGE6.getTextOfSony();
        String expectedTitle = "Sony";
        Assert.assertEquals(actualTitle, expectedTitle, "Sony");
    }
}
