package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommentOnBlogPAGE extends BasePage {
    public CommentOnBlogPAGE(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    //This page selects elements from laptop picture blog and leaving a review
    // and checking if the save of the review was successful
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div[7]/div/div[6]/div/div/div/div/div/div[1]/div[1]/div/div[2]/h4/a")
    private WebElement laptopBlog;
    public void clickOnLaptopBlog(){laptopBlog.click();}
    @FindBy(xpath = "//*[@id=\"input-name\"]")
    private WebElement yourNameAtReview;
    public void enterYourNameInField(String text){yourNameAtReview.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div[2]/div[2]/div[1]/div[9]/form/div[2]/input")
    private WebElement emailAddress;
    public void enterEmailAddress(String text){emailAddress.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"input-comment\"]")
    private WebElement leaveComment;
    public void enterComment(String text){leaveComment.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"button-comment\"]")
    private WebElement saveComment;
    public void clickOnSaveComment(){saveComment.click();}
    @FindBy(xpath = "//*[@id=\"form-comment\"]/div[1]")
    private WebElement commentSaved;
    public String getTextAfterComment(String text){return commentSaved.getText();
    }
    // Thank you for your comment. It has been submitted to the webmaster for approval.
}
