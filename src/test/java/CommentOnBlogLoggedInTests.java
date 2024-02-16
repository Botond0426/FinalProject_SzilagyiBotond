import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CommentOnBlogLoggedInPAGE;

public class CommentOnBlogLoggedInTests extends BasePage {
    private CommentOnBlogLoggedInPAGE commentOnBlogLoggedInPAGE;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        commentOnBlogLoggedInPAGE = new CommentOnBlogLoggedInPAGE(driver);
    }
    @Test
    public void clickOnMyAccount(){
        commentOnBlogLoggedInPAGE.clickOnMyAccount();
        commentOnBlogLoggedInPAGE.typeInEmailField("tester@tester.com");
        commentOnBlogLoggedInPAGE.typeInPasswordField("tester123");
        commentOnBlogLoggedInPAGE.clickOnLoginButton();

        commentOnBlogLoggedInPAGE.clickOnBlog();
        commentOnBlogLoggedInPAGE.clickOnBlogPost();
        commentOnBlogLoggedInPAGE.typeInCommentField("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        commentOnBlogLoggedInPAGE.clickOnPostComment();
        String actualTitle = commentOnBlogLoggedInPAGE.getTextOfResult();
        String expectedTitle = "Thank you for your comment. It has been submitted to the webmaster for approval.";
        Assert.assertEquals(actualTitle,expectedTitle,"Comment was not successful!");
        commentOnBlogLoggedInPAGE.clickOnMyAccountButton();
        commentOnBlogLoggedInPAGE.clickOnLogout1();


    }
}
