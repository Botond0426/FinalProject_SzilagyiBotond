package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LeaveReviewOnBlogPAGE5;

public class LeaveCommentOnBlog5 extends BasePage {
    private LeaveReviewOnBlogPAGE5 leaveReviewOnBlogPAGE5;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        leaveReviewOnBlogPAGE5 = new LeaveReviewOnBlogPAGE5(driver);
    }
    @Test
    public void clickOnLaptopBlog(){
        leaveReviewOnBlogPAGE5.clickOnLaptopBlog();
        leaveReviewOnBlogPAGE5.enterYourNameInField("asdasdasdsadasdasdasdasdasdasdasdasd");
        leaveReviewOnBlogPAGE5.enterEmailAddress("asdasdasd@asdasd.com");
        leaveReviewOnBlogPAGE5.enterComment("asdasdasdsadsadsadasdasdadasdasdsadsadasdasd");
        leaveReviewOnBlogPAGE5.clickOnSaveComment();
        String actualTitle = leaveReviewOnBlogPAGE5.getTextAfterComment(" Thank you for your comment. It has been submitted to the webmaster for approval.");
        String expectedTitle = " Thank you for your comment. It has been submitted to the webmaster for approval.";
        Assert.assertEquals(actualTitle, expectedTitle,"Title does not match");
    }









}
