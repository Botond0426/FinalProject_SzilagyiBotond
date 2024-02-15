package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AskQuestionAboutProductPAGE extends BasePage{
    public AskQuestionAboutProductPAGE(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(css ="#mz-product-listing-image-39213264-0-1 > div > div.carousel-item.active > img")
    private WebElement AppleIpad1;
    public void clickOnAppleIpad1(){AppleIpad1.click();}
    @FindBy(css = "#entry_216850 > a")
    private WebElement askQuestion;
    public void clickOnAskQuestion(){askQuestion.click();}
    @FindBy(css = "#entry_216873 > div > form > div:nth-child(1) > input")
    private WebElement inputName;
    public void inputNameField(String text){inputName.sendKeys(text);}
    @FindBy(css = "#entry_216873 > div > form > div:nth-child(2) > input")
    private WebElement inputEmail;
    public void inputEmailField(String text){inputEmail.sendKeys(text);}
    @FindBy(css = "#entry_216873 > div > form > div:nth-child(3) > input")
    private WebElement subjectMessage;
    public void subjectMessageField(String text){subjectMessage.sendKeys(text);}
    @FindBy(css = "#entry_216873 > div > form > div:nth-child(4) > textarea")
    private WebElement textMessage;
    public void textMessageArea(String text){textMessage.sendKeys(text);}
    @FindBy(css = "#entry_216873 > div > form > button")
    private WebElement subimtButton;
    public void clickOnSubmitButton(){subimtButton.click();}

}