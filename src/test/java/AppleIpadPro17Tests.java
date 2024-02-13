import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.GetTextOfAppleIpadProPAGE17;

public class AppleIpadPro17Tests extends BasePage {
    private GetTextOfAppleIpadProPAGE17 getTextOfAppleIpadProPAGE17;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        getTextOfAppleIpadProPAGE17 = new GetTextOfAppleIpadProPAGE17(driver);
    }
    @Test
    public void clickOnAppleIpadProWidget(){
        getTextOfAppleIpadProPAGE17.clickOnAppleIpadProWidget();
        String actualTitle = getTextOfAppleIpadProPAGE17.getTextOfAppleIpad();
        String expectedTitle = "Apple ipad Pro";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match with widget.");
//This is a negative test,as the product does not match the advertised one:iPod Touch instead of Apple iPad Pro
    }


}
