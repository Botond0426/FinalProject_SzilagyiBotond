package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAffiliatePAGE29 extends BasePage{
    public EditAffiliatePAGE29(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[6]/a/div")
    private WebElement loginUser1;

    public void clickOnLoginUser1() {loginUser1.click();}

    @FindBy(xpath = "//*[@id=\"input-email\"]")
    private WebElement typeInUserEmail;
    public void loginUserEmail(String text){typeInUserEmail.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"input-password\"]")
    private WebElement typeInUserPassword;
    public void loginUserPassword(String text){typeInUserPassword.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div/form/input")
    private WebElement loginButton;
    public void clickOnLoginButton(){loginButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div[2]/div/div[3]/div/a[1]/i")
    private WebElement editAffiliateInfo;
    public void clickOnEditAffiliate(){editAffiliateInfo.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[2]/div[2]/div/div[3]/label/input")
    private WebElement bankTransfer;
    public void checkBankTransferCheckbox(){bankTransfer.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[2]/div[5]/div[1]/div/input")
    private WebElement bankNameField;
    public void typeInBankNameField(String text){bankNameField.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[2]/div[5]/div[2]/div/input")
    private WebElement branchNumber;
    public void typeInBranchNumberField(String text){branchNumber.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[2]/div[5]/div[3]/div/input")
    private  WebElement swiftCode;
    public void typeInSWIFTcodeField(String text){swiftCode.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[2]/div[5]/div[4]/div/input")
    private WebElement accountName;
    public void typeInAccountName(String text){accountName.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[2]/div[5]/div[5]/div/input")
    private WebElement accountNumber;
    public void typeInAccountNumber(String text){accountNumber.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div/div/input")
    private WebElement submitButton;
    public void clickOnSubmit(){submitButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div[1]/text()")
    private WebElement messageAftermod;
    public String getMessageAfterSubmit(){return messageAftermod.getText();}



}