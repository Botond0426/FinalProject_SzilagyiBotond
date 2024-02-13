import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddOnsModuleSonyPAGE6;
import pages.BasePage;

public class GetTextOfSonyAddons6Tests extends BasePage {
    private AddOnsModuleSonyPAGE6 addOnsModuleSonyPAGE6;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        addOnsModuleSonyPAGE6 = new AddOnsModuleSonyPAGE6(driver);
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
