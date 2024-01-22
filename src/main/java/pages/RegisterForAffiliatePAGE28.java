package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterForAffiliatePAGE28 extends BasePage{
    public RegisterForAffiliatePAGE28(WebDriver driver){
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
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div[3]/div/a")
    private WebElement affiliateMenu;
    public void clickOnAffiliate(){affiliateMenu.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[1]/div[1]/div/input")
    private WebElement companyName;
    public void typeInCompanyField(String text){companyName.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[1]/div[2]/div/input")
    private WebElement webSiteField;
    public void typeInWebsiteField(String text){webSiteField.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[2]/div[1]/div/input")
    private WebElement taxId;
    public void typeInTaxIDField(String text){taxId.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[2]/div[2]/div/div[2]/label/input")
    private WebElement paypalCheckbox;
    public void checkPaypal(){paypalCheckbox.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[2]/div[4]/div/input")
    private WebElement emailForPaypal;
    public void typeInEmailForPayPal(String text){emailForPaypal.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div/div/input[1]")
    private WebElement agreeToTerms;
    public void checkAgreementCheckbox(){agreeToTerms.click();}
    @FindBy(css = "#content > form > div > div > input.btn.btn-primary")
    private WebElement signUpButton;
    public void clickOnSignButton(){signUpButton.click();}
}