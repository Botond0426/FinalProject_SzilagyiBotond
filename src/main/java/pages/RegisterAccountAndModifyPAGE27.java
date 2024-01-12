package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterAccountAndModifyPAGE27 extends BasePage{
    public RegisterAccountAndModifyPAGE27(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[6]/a/div")
    private WebElement myAccount;
    public void clickOnMyAccount(){myAccount.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div/div[1]/div/div/a")
    private WebElement continueToRegister;
    public void clickOnRegister(){continueToRegister.click();}

    //abc abc
    //abc@abc123.com
    //abc123 the password.


    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[1]/div[2]/div/input")
    private WebElement firstName;
    public void typeInFirstNameField(){firstName.sendKeys();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[1]/div[2]/div/input")
    private WebElement lastName;
    public void typeInLastName(){lastName.sendKeys();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[1]/div[4]/div/input")
    private WebElement emailField;
    public void typeInEmailField(){emailField.sendKeys();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[1]/div[5]/div/input")
    private WebElement phoneNumber;
    public void typeInPhoneNumber(){phoneNumber.sendKeys();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[2]/div[1]/div/input")
    private WebElement passwordRegister;
    public void typeInPassword1(){passwordRegister.sendKeys();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[2]/div[2]/div/input")
    private WebElement passwordRepeat;
    public void typeInPassword2(){passwordRepeat.sendKeys();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div/div/div/label")
    private WebElement privacyPolicy;
    public void checkPrivacyPolicy(){privacyPolicy.click();}
    @FindBy(xpath= "/html/body/div[1]/div[5]/div[1]/div/div/form/div/div/input")
    private WebElement registerButton;
    public void registerUser(){registerButton.click();}
    @FindBy(xpath ="/html/body/div[1]/div[5]/div[1]/div/div/div/a")
    private WebElement continueToMyAccount;
    public void clickOnContinueMyAccount(){continueToMyAccount.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/aside/div/a[2]")
    private WebElement modifyMenu;
    public void clickOnModify(){modifyMenu.click();}

    //new credentials:xyz@xyz.com
    //John Doe will be the new name
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset/div[1]/div/input")
    private WebElement firstNameModify;
    public void modifyFirstName(String text){firstNameModify.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset/div[1]/div/input")
    private WebElement lastNameModify;
    public void  modifyLastName(String text){lastNameModify.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset/div[3]/div/input")
    private WebElement emailFieldModify;
    public void modifyEmail(String text){emailFieldModify.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div/div[2]/input")
    private WebElement submitButton;
    public void submitModification(){submitButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div[1]")
    private WebElement resultAfterMod;
    public String getMessageAfterModification(){return resultAfterMod.getText();}

}