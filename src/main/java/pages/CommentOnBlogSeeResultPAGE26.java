package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommentOnBlogSeeResultPAGE26 extends BasePage{
    public CommentOnBlogSeeResultPAGE26(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[6]/a/div")
    private WebElement myAccount;
    public void clickOnMyAccount(){myAccount.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div/div[2]/div/div/form/div[1]/input")
    private WebElement emailField;
    public void typeInEmailField(String text){emailField.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div/div[2]/div/div/form/div[2]/input")
    private WebElement passwordField;
    public void typeInPasswordField(String text){passwordField.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div/div[2]/div/div/form/input[1]")
    private WebElement loginButton;
    public void clickOnLoginButton(){loginButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[3]/a")
    private WebElement blogButton;
    public void clickOnBlog(){blogButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/div/div/div/div[3]/div/div[1]/a")
    private WebElement blogImage;
    public void clickOnBlogPost(){blogImage.click();}
    //text of the comment:Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div[2]/div[2]/div[1]/div[9]/form/div[2]/textarea")
    private WebElement commentField;
    public void typeInCommentField(String text){commentField.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div[2]/div[2]/div[1]/div[9]/form/button")
    private WebElement postCommentButton;
    public void clickOnPostComment(){postCommentButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div[2]/div[2]/div[1]/div[9]/form/div[1]/text()")
    private WebElement resultAfterComment;
    public String getTextOfResult(){return resultAfterComment.getText();}
    // Thank you for your comment. It has been submitted to the webmaster for approval.


}