import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckWidgetTitlePAGE;

public class CheckWidgetTitleTests extends BasePage {
    private CheckWidgetTitlePAGE checkWidgetTitlePAGE;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        checkWidgetTitlePAGE = new CheckWidgetTitlePAGE(driver);
    }
    @Test
    public void clickOnAppleIpadProWidget(){
        checkWidgetTitlePAGE.clickOnAppleIpadProWidget();
        String actualTitle = checkWidgetTitlePAGE.getTextOfAppleIpad();
        String expectedTitle = "Apple ipad Pro";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match with widget.");
//This is a negative test,as the product does not match the advertised one:iPod Touch instead of Apple iPad Pro
    }


}
