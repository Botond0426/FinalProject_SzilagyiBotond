package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAndCheckRewardsPointsPAGE15 extends BasePage{
    public LoginAndCheckRewardsPointsPAGE15(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"widget-navbar-217834\"]/ul/li[6]/ul/li[1]/a/div/span")
    private WebElement loginUser1;

    public void clickOnLoginUser1() {loginUser1.click();}

    @FindBy(xpath = "//*[@id=\"input-email\"]")
    private WebElement typeInUserEmail;
    public void loginUserEmail(String text){typeInUserEmail.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"input-password\"]")
    private WebElement typeInUserPassword;
    public void loginUserPassword(String text){typeInUserPassword.sendKeys();}
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div/form/input")
    private WebElement loginButton;
    public void clickOnLoginButton(){loginButton.click();}
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[3]/a/i")
    private WebElement showYourRewardPoints;
    public void clickOnRewardPoints(){showYourRewardPoints.click();}
    @FindBy(xpath = "//*[@id=\"content\"]/p/b")
    private WebElement rewardPointsValue;
    public String getTextOfRewardPoints(){ return rewardPointsValue.getText();}
    @FindBy(xpath = "//*[@id=\"content\"]/div[3]/div/a")
    private WebElement continueButtonInRewards;
    public void clickOnContinueInRewards(){continueButtonInRewards.click();}

}