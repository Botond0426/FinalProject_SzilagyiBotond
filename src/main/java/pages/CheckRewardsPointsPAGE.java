package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckRewardsPointsPAGE extends BasePage{
    public CheckRewardsPointsPAGE(WebDriver driver){
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
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[3]/a/i")
    private WebElement showYourRewardPoints;
    public void clickOnRewardPoints(){showYourRewardPoints.click();}
    @FindBy(css = "#content > p > b")
    private WebElement rewardPointsValue;
    public String getTextOfRewardPoints(){ return rewardPointsValue.getText();}
    // /html/body/div[1]/div[5]/div[1]/div/div/p/text()[1]
    @FindBy(xpath = "//*[@id=\"content\"]/div[3]/div/a")
    private WebElement continueButtonInRewards;
    public void clickOnContinueInRewards(){continueButtonInRewards.click();}
    @FindBy(css = "#widget-navbar-217834 > ul > li:nth-child(6) > a")
    private WebElement myAccountButton;
    public void clickOnMyAccountButton(){myAccountButton.click();}
    @FindBy(css = "#column-right > div > a:nth-child(14)")
    private WebElement logoutButton1;
    public void clickOnLogout1(){logoutButton1.click();}

}