package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
    private WebElement myVoucherButton;
    public void clickOnMyVoucherButton() {myVoucherButton.click();}
    public void moveCursorArrowToMyAccountButton() {
        Actions actions1 = new Actions(driver);
        WebElement targetElement1 = driver.findElement(By.xpath("//*[@id='widget-navbar-217834']/ul/li[6]/a/div/span"));
        actions1.moveToElement(targetElement1).perform();}
    @FindBy(css = "#input-to-name")
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
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div/a")
    private WebElement continueButtonAfterSubmit;
    public void clickOnContinueAfterSubmit(){continueButtonAfterSubmit.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div[2]/a[2]")
    private WebElement checkOutButton;
    public void clickOnCheckOut(){checkOutButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div/div[1]/div/div[3]/div")
    private WebElement errorMessage;
    public String getErrorMessage(){return errorMessage.getText();}
}