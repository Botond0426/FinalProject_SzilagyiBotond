package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendGiftAndGetResultPAGE24 extends BasePage{
    public SendGiftAndGetResultPAGE24(WebDriver driver){
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
    @FindBy(xpath = "/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[6]/ul/li[5]/a/div/span")
    private WebElement myVoucher;
    public void clickOnMyVoucher(){myVoucher.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div[1]/div/input")
    private WebElement recipientsName;
    public void typeInRecipientsNameField(String text){recipientsName.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div[2]/div/input")
    private WebElement recipientsEmail;
    public void typeInRecipientsEmail(String text){recipientsEmail.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div[5]/div/div[1]/label/input")
    private WebElement birthdayGift;
    public void clickOnBirthDayCheckbox(){birthdayGift.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div[6]/div/textarea")
    private WebElement textArea;
    public void typeInTextArea(String text){textArea.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div[8]/div/input[1]")
    private WebElement termsConditions;
    public void clickOnTnC(){termsConditions.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div[8]/div/input[2]")
    private WebElement continueButton;
    public void clickOnContinueButton(){continueButton.click();}
    //PanicTester
    //PanicTester@PanicTester.com
    //other account
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/p[2]/text()")
    private WebElement textAfterSubmit;
    public String getTextAfterSubmit(){return textAfterSubmit.getText();}
//Thank you for purchasing a gift certificate! Once you have completed your order your gift certificate recipient will be sent an e-mail with details how to redeem their gift certificate.

    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div/a")
    private WebElement continueButtonAfterSubmit;
    public void clickOnContinueAfterSubmit(){continueButtonAfterSubmit.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div[2]/a[2]")
    private WebElement checkOutButton;
    public void clickOnCheckOut(){checkOutButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div/div[1]/div/div[3]/div/text()[1]")
    private WebElement errorMessage;
    public String getErrorMessage(){return errorMessage.getText();}


}