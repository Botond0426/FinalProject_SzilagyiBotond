package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdTestPage extends BasePage{
    public ThirdTestPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    //This page selects elements for registration at the main page.
    @FindBy(xpath = "//*[@id=\"widget-navbar-217834\"]/ul/li[6]/ul/li[2]/a/div/span")
    private WebElement RegisterButton;
    public void clickOnRegisterButton(){
        RegisterButton.click();
    }
    @FindBy(xpath = "//*[@id=\"input-firstname\"]")
    private WebElement RegisterFirstName;
    public void clickOnRegisterFirstName(String text){RegisterFirstName.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"input-lastname\"]")
    private WebElement RegisterLastName;
    public void clickOnRegisterLastName(String text){RegisterLastName.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"input-email\"]")
    private WebElement RegisterEmail;
    public void clickOnRegisterEmail(String text){RegisterEmail.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"input-telephone\"]")
    private WebElement RegisterPhone;
    public void clickOnRegisterPhone(String text){RegisterPhone.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"input-password\"]")
    private WebElement RegisterPassword;
    public void clickOnRegisterPassword(String text){RegisterPassword.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"input-confirm\"]")
    private WebElement RegisterConfirm;
    public void clickOnRegisterConfirm(String text){RegisterConfirm.sendKeys(text);}
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
    @FindBy(xpath = "//*[@id=\"content\"]/div/a")
    private WebElement ContinueAfterRegistration;
    public void clickOnContinueAfterRegistration(){
        ContinueRegistration.click();
    }
}
