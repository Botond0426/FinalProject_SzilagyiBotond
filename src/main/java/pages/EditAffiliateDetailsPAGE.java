package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAffiliateDetailsPAGE extends BasePage{
    public EditAffiliateDetailsPAGE(WebDriver driver){
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
    @FindBy(css ="#content > div:nth-child(3) > div > a:nth-child(1) > i")
    private WebElement editAffiliateInfo;
    public void clickOnEditAffiliate(){editAffiliateInfo.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[2]/div[2]/div/div[3]/label/input")
    private WebElement bankTransfer;
    public void checkBankTransferCheckbox(){bankTransfer.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[2]/div[5]/div[1]/div/input")
    private WebElement bankNameField;
    public void typeInBankNameField(String text){
        bankNameField.clear();
        bankNameField.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[2]/div[5]/div[2]/div/input")
    private WebElement branchNumber;
    public void typeInBranchNumberField(String text){
        branchNumber.clear();
        branchNumber.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[2]/div[5]/div[3]/div/input")
    private  WebElement swiftCode;
    public void typeInSWIFTcodeField(String text){
        swiftCode.clear();
        swiftCode.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[2]/div[5]/div[4]/div/input")
    private WebElement accountName;
    public void typeInAccountName(String text){
        accountNumber.clear();
        accountName.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[2]/div[5]/div[5]/div/input")
    private WebElement accountNumber;
    public void typeInAccountNumber(String text){
        accountNumber.clear();
        accountNumber.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div/div/input")
    private WebElement submitButton;
    public void clickOnSubmit(){submitButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div[1]")
    private WebElement messageAftermod;
    public String getMessageAfterSubmit(){return messageAftermod.getText();}
    @FindBy(css = "#widget-navbar-217834 > ul > li:nth-child(6) > a")
    private WebElement myAccountButton;
    public void clickOnMyAccountButton(){myAccountButton.click();}
    @FindBy(css = "#column-right > div > a:nth-child(14)")
    private WebElement logoutButton1;
    public void clickOnLogout1(){logoutButton1.click();}



}