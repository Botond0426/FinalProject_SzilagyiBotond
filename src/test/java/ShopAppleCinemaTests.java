import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ShopAppleCinemaPAGE;

public class ShopAppleCinemaTests extends BasePage {
    private ShopAppleCinemaPAGE shopAppleDisplayPAGE4;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        shopAppleDisplayPAGE4 = new ShopAppleCinemaPAGE(driver);
    }

    @Test()
    public void shopAppleDisplayAndVerifySizeRequirement() {
        shopAppleDisplayPAGE4.clickOnShopAppleDisplay();
            shopAppleDisplayPAGE4.clickOnBuyNowButton();
            String actualTitle = shopAppleDisplayPAGE4.getTextInSizeRequirement();
            String expectedTitle = "Size required!";
            Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
        }
    }


