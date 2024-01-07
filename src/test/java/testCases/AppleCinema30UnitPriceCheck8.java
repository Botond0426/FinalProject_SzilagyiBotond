package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.Check30UnitPriceAppleCinemaPAGE8;

public class AppleCinema30UnitPriceCheck8 extends BasePage {
    private Check30UnitPriceAppleCinemaPAGE8 check30UnitPriceAppleCinemaPAGE8;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        check30UnitPriceAppleCinemaPAGE8 = new Check30UnitPriceAppleCinemaPAGE8(driver);

    }
    @Test
    public void clickOnAppleIpad() {
        check30UnitPriceAppleCinemaPAGE8.clickOnAppleIpad1();
    }
    public void clickOnCheckboxInstock1(){


        check30UnitPriceAppleCinemaPAGE8.clickOnCheckboxInstock1();
        check30UnitPriceAppleCinemaPAGE8.clickOnXXLSize1();
        check30UnitPriceAppleCinemaPAGE8.clickOnAppleCinema30();
        check30UnitPriceAppleCinemaPAGE8.clickOnSizeOfAppleCinema30();
        check30UnitPriceAppleCinemaPAGE8.clickOnLargeSizeApple();
        check30UnitPriceAppleCinemaPAGE8.clickOnPlusApple();
        check30UnitPriceAppleCinemaPAGE8.clickOnBuyNowButtonApple();
        String actualTitle =check30UnitPriceAppleCinemaPAGE8.getTextOfAppleUnitPrice();
        String expectedTitle = "$140.00";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");





    }





}
