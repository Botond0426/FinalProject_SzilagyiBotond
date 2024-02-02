package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CommentOnBlogSeeResultPAGE26;

public class BlogCommentResult26 extends BasePage {
    private CommentOnBlogSeeResultPAGE26 commentOnBlogSeeResultPAGE26;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        commentOnBlogSeeResultPAGE26 = new CommentOnBlogSeeResultPAGE26(driver);
    }
    @Test
    public void clickOnMyAccount(){
        commentOnBlogSeeResultPAGE26.clickOnMyAccount();
        commentOnBlogSeeResultPAGE26.typeInEmailField("tester@tester.com");
        commentOnBlogSeeResultPAGE26.typeInPasswordField("tester123");
        commentOnBlogSeeResultPAGE26.clickOnLoginButton();

        commentOnBlogSeeResultPAGE26.clickOnBlog();
        commentOnBlogSeeResultPAGE26.clickOnBlogPost();
        commentOnBlogSeeResultPAGE26.typeInCommentField("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        commentOnBlogSeeResultPAGE26.clickOnPostComment();
        String actualTitle = commentOnBlogSeeResultPAGE26.getTextOfResult();
        String expectedTitle = "Thank you for your comment. It has been submitted to the webmaster for approval.";
        Assert.assertEquals(actualTitle,expectedTitle,"Comment was not successful!");


    }
}
