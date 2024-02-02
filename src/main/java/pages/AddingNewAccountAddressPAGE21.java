package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingNewAccountAddressPAGE21 extends BasePage{
    public AddingNewAccountAddressPAGE21(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[6]/a")
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
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div[1]/div/div/div[3]/a")
    private WebElement addressBook;
    public void clickOnAddressBookButton(){addressBook.click();

    }

    @FindBy(css = ".float-right")
    private WebElement newAddressButton;
    public void clickOnNewAddressButton(){newAddressButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset/div[1]/div/input")
    private WebElement firstNameField;
    public void typeInFirstNameField(String text){firstNameField.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset/div[2]/div/input")
    private WebElement lastNameField;
    public void typeInLastNameField(String text){lastNameField.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset/div[4]/div/input")
    private WebElement newAddress;
    public void typeInNewAddressField(String text){newAddress.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset/div[6]/div/input")
    private WebElement newCity;
    public void typeInNewCityField(String text){newCity.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset/div[7]/div/input")
    private WebElement postalCode;
    public void typeInPostalCodeField(String text){postalCode.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset/div[8]/div/select/option[186]")
    private WebElement chooseCountry;
    public void chooseNewCountry(){chooseCountry.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset/div[9]/div/select/option[11]")
    private WebElement chooseCounty;
    public void chooseNewCounty(){chooseCounty.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div/div[2]/input")
    private WebElement continueButton;
    public void clickOnContinueButton(){continueButton.click();}

}