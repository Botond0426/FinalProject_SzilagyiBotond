package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.GetTextOfAppleIpadProPAGE17;

public class AppleIpadPro17 extends BasePage {
    private GetTextOfAppleIpadProPAGE17 getTextOfAppleIpadProPAGE17;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        getTextOfAppleIpadProPAGE17 = new GetTextOfAppleIpadProPAGE17(driver);
    }
    @Test
    public void clickOnAppleIpadProWidget(){
        getTextOfAppleIpadProPAGE17.clickOnAppleIpadProWidget();
    }
    public void getTextOfAppleIpad(){
        String actualTitle = getTextOfAppleIpadProPAGE17.getTextOfAppleIpad();
        String expectedTitle = "Apple ipad Pro";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match with widget.");

    }


}
