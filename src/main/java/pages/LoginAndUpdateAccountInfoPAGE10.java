package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAndUpdateAccountInfoPAGE10 extends BasePage{
    public LoginAndUpdateAccountInfoPAGE10(WebDriver driver){
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
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/div[1]/a/i")
    private WebElement updateAccountInfo;
    public void clickOnUpdateAccount(){updateAccountInfo.click();}
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[2]/input")
    private WebElement submitAccountUpdate;
    public void clickOnSubmitAccountUpdate(){submitAccountUpdate.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div[1]/i")
    private WebElement getTextAfterUpdate;
    public String setGetTextAfterUpdate(){return getTextAfterUpdate.getText();}


}
