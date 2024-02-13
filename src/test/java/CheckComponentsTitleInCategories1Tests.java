import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckComponentsTitlePAGE1;

public class CheckComponentsTitleInCategories1Tests extends BasePage {
    private CheckComponentsTitlePAGE1 checkComponentsTitlePAGE1;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        checkComponentsTitlePAGE1 = new CheckComponentsTitlePAGE1(driver);
    }
    @Test()
    public void clickOnCategoryAndComponents(){
        checkComponentsTitlePAGE1.clickOnCategories();
        checkComponentsTitlePAGE1.clickOnComponents();
        String actualTitle = checkComponentsTitlePAGE1.getTextInTitle();
        String expectedTitle = "Components";
        Assert.assertEquals(actualTitle, expectedTitle,"Title does not match");
    }
    //Tested if after accessing the item categories and if user clicks on Components,the same title will appear.
}
