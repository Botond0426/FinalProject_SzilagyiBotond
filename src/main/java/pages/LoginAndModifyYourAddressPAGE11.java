package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAndModifyYourAddressPAGE11 extends BasePage{
    public LoginAndModifyYourAddressPAGE11(WebDriver driver){
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
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/div[3]/a/i")
    private WebElement modifyYourAddress;
    public void clickOnModifyYourAddress(){modifyYourAddress.click();}
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/a")
    private WebElement newAddress;
    public void clickOnNewAddress(){newAddress.click();}
    @FindBy(xpath = "//*[@id=\"input-firstname\"]")
    private WebElement FirstNameAddress;
    public void typeInFirstNameAddress(String text){FirstNameAddress.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"input-lastname\"]")
    private WebElement LastNameAddress;
    public void typeInLastNameAddress(String text){LastNameAddress.sendKeys(text);}
    @FindBy(xpath ="//*[@id=\"input-address-1\"]")
    private WebElement addressAddress;
    public void typeInAddress(String text){addressAddress.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"input-city\"]")
    private WebElement cityAddress;
    public void typeInCityAddress(String text){cityAddress.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"input-postcode\"]")
    private WebElement postalCodeAddress;
    public void typeInPostalCodeAddress(String text){postalCodeAddress.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"input-zone\"]/option[2]")
    private WebElement countyAddress;
    public void typeInCountyAddress(String text){countyAddress.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[2]/input")
    private WebElement continueButtonAddress;
    public void clickOnContinueAddress(){continueButtonAddress.click();}
}