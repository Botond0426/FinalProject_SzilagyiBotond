package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountNotificationPAGE19 extends BasePage{
    public AccountNotificationPAGE19(WebDriver driver){
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
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/aside/div/a[6]")
    private WebElement notificationButton;
    public void clickOnNotificationButton(){notificationButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div/ul/li[2]/a")
    private WebElement brandButton;
    public void clickOnBrandButton(){brandButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div/div/a")
    private WebElement continueButton;
    public void clickOnContinueButton(){continueButton.click();}


}