package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUserPAGE3 extends BasePage{
    public RegisterUserPAGE3(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    //This page selects elements for registration at the main page.
    @FindBy(xpath = "//*[@id=\"widget-navbar-217834\"]/ul/li[6]/a/div/span")
    private WebElement MyAccountButton;
    public void clickOnMyAccountButton(){MyAccountButton.click();}
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div/a")
    private WebElement ContinueToRegistration;
    public void clickOnContinueToRegisterButton(){ContinueToRegistration.click();
}
    @FindBy(xpath = "//*[@id=\"input-firstname\"]")
    private WebElement RegisterFirstName;
    public void clickOnRegisterFirstName(String text){RegisterFirstName.sendKeys("testament");}
    @FindBy(xpath = "//*[@id=\"input-lastname\"]")
    private WebElement RegisterLastName;
    public void clickOnRegisterLastName(String text){RegisterLastName.sendKeys("testament");}
    @FindBy(xpath = "//*[@id=\"input-email\"]")
    private WebElement RegisterEmail;
    public void clickOnRegisterEmail(String text){RegisterEmail.sendKeys("test@testament.com");}
    @FindBy(xpath = "//*[@id=\"input-telephone\"]")
    private WebElement RegisterPhone;
    public void clickOnRegisterPhone(String text){RegisterPhone.sendKeys("0671234123");}
    @FindBy(xpath = "//*[@id=\"input-password\"]")
    private WebElement RegisterPassword;
    public void clickOnRegisterPassword(String text){RegisterPassword.sendKeys("passwordtest123");}
    @FindBy(xpath = "//*[@id=\"input-confirm\"]")
    private WebElement RegisterConfirm;
    public void clickOnPasswordConfirm(String text){RegisterConfirm.sendKeys("passwordtest123");}
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div/div/label")
    private WebElement AgreementCheckBox;
    public void clickOnAgreementCheckBox(){
        AgreementCheckBox.click();
    }
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input")
    private WebElement ContinueRegistration;
    public void clickOnContinueRegistration(){
        ContinueRegistration.click();
    }
}
