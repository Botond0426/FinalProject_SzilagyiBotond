package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscribeNewsLetterPAGE extends BasePage{
    public SubscribeNewsLetterPAGE(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[6]/a/div")
    private WebElement loginUser1;

    public void clickOnLoginUser1() {loginUser1.click();}

    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div/div[2]/div/div/form/div[1]/input")
    private WebElement typeInUserEmail;
    public void loginUserEmail(String text){typeInUserEmail.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div/div[2]/div/div/form/div[2]/input")
    private WebElement typeInUserPassword;
    public void loginUserPassword(String text){typeInUserPassword.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div/form/input")
    private WebElement loginButton;
    public void clickOnLoginButton(){loginButton.click();}
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/div[5]/a/i")
    private WebElement subscribeNewsLetter;
    public void clickOnSubscribeNL(){subscribeNewsLetter.click();}
    @FindBy(xpath = "//*[@id=\"content\"]/form/fieldset/div/div/div[1]/label")
    private WebElement subscribeYes;
    public void clickOnYesSubscribe(){subscribeYes.click();}
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[2]/input")
    private WebElement continueSubscribe;
    public void clickOnContinueSubscribe(){continueSubscribe.click();}
    @FindBy(css = "#column-right > div > a:nth-child(14)")
    private WebElement logoutButton1;
    public void clickOnLogout1(){logoutButton1.click();}

}