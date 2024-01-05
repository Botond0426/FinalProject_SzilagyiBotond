package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeaveReviewOnBlogPAGE5 extends BasePage {
    public LeaveReviewOnBlogPAGE5(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    //This page selects elements from laptop picture blog and leaving a review
    // and checking if the save of the review was successful
    @FindBy(xpath = "//*[@id=\"swiper-wrapper-5c070a8c6316984b\"]/div[1]/div/div[1]/a/img")
    private WebElement laptopBlog;
    public void clickOnLaptopBlog(){laptopBlog.click();}
    @FindBy(xpath = "//*[@id=\"input-name\"]")
    private WebElement yourNameAtReview;
    public void enterYourNameInField(String text){yourNameAtReview.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"input-email\"]")
    private WebElement emailAddress;
    public void enterEmailAddress(String text){emailAddress.sendKeys();}
    @FindBy(xpath = "//*[@id=\"input-comment\"]")
    private WebElement leaveComment;
    public void enterComment(String text){leaveComment.sendKeys();}
    @FindBy(xpath = "//*[@id=\"button-comment\"]")
    private WebElement saveComment;
    public void clickOnSaveComment(){saveComment.click();}
    @FindBy(css = "#form-comment > div.alert.alert-success.alert-dismissible > i")
    private WebElement commentSaved;
    public void getTextAfterComment(String text){
        commentSaved.getText();
    }
    // Thank you for your comment. It has been submitted to the webmaster for approval.
}
