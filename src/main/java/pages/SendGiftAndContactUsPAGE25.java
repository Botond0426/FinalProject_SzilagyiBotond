package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendGiftAndContactUsPAGE25 extends BasePage{
    public SendGiftAndContactUsPAGE25(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[6]/a/i")
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
    public void moveCursorArrowToMyAccountButton() {
        Actions actions1 = new Actions(driver);
        WebElement targetElement1 = driver.findElement(By.xpath("//*[@id='widget-navbar-217834']/ul/li[6]/a/div/span"));
        actions1.moveToElement(targetElement1).perform();}
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
    @FindBy(css = "#content > p:nth-child(3)")
    private WebElement textAfterSubmit;
    public String getTextAfterSubmit(){return textAfterSubmit.getText();}
//Thank you for purchasing a gift certificate! Once you have completed your order your gift certificate recipient will be sent an e-mail with details how to redeem their gift certificate.

    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div/a")
    private WebElement continueButtonAfterSubmit;
    public void clickOnContinueAfterSubmit(){continueButtonAfterSubmit.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div[2]/a[2]")
    private WebElement checkOutButton;
    public void clickOnCheckOut(){checkOutButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div/div[1]/div/div[3]/div/a")
    private WebElement contactUsButton;
    public void clickOnContactUs(){contactUsButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div/div[2]/div/div/form/div[1]/div/input")
    private WebElement yourNameField;
    public void typeInYourNameField(String text){yourNameField.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div/div[2]/div/div/form/div[3]/div/textarea")
    private WebElement textContactArea;
    public void typeInTextContactArea(String text){textContactArea.sendKeys(text);}
    @FindBy(css = "input.btn")
    private WebElement submitButton;
    public void clickOnSubmitButton(){submitButton.click();}
    @FindBy(css = "#content > p:nth-child(3)")
    private WebElement messageAfterContact;
    public String getMessageAfterContact(){return messageAfterContact.getText();}
    //Your enquiry has been successfully sent to the store owner!
}