package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BuySomeProductAndReturnPAGE22 extends BasePage{
    public BuySomeProductAndReturnPAGE22(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[6]/a/div")
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
    @FindBy(xpath = "/html/body/div[1]/div[5]/header/div[2]/div[1]/div[1]")
    private WebElement homePage;
    public void clickOnHomePage(){homePage.click();}
    @FindBy(css = "#mz-product-listing-image-39213264-0-0 > div:nth-child(1)")
    private WebElement phoneProduct;
    public void clickOnPhoneProduct(){phoneProduct.click();}
    @FindBy(css = ".btn-buynow")
    private WebElement buyNowButton;
    public void clickOnBuyNowButton(){buyNowButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div/div[1]/div/div[2]/div[1]/div[1]")
    private WebElement existingAddress;
    public void clickOnExistingAddress(){existingAddress.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div/div[2]/div/div[5]/label")
    private WebElement termsConditions;
    public void clickOnTnC(){termsConditions.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div/div[2]/div/button")
    private WebElement continueButton;
    public void clickOnContinueButton(){continueButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div[4]/button")
    private WebElement confirmOrder;
    public void clickOnConfirmOrder(){
        WebElement confirmOrderWait = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(confirmOrder));
        confirmOrder.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[6]/a/div")
    private WebElement getMyAccount2;
    public void clickOnMyAccount2(){getMyAccount2.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div[2]/div/div/div[1]/a/i")
    private WebElement orderHistory;
    public void clickOnOrderHistory(){orderHistory.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div[1]/table/tbody/tr[1]/td[7]/a")
    private WebElement viewOrder;
    public void clickOnViewOrder(){viewOrder.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div[1]/table/tbody/tr/td[6]/a[2]")
    private WebElement returnButton;
    public void clickOnReturnButton(){returnButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[2]/div[4]/div/div[3]/label/input")
    private WebElement orderError;
    public void clickOnOrderError(){orderError.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div/div[2]/input")
    private WebElement submitButton;
    public void clickOnSubmitButton(){submitButton.click();}
    //Thank you for submitting your return request. Your request has been sent to the relevant department for processing.
    //
    //You will be notified via e-mail as to the status of your request.
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/p[2]")
    private WebElement textAfterReturn;
    public String getTextAfterReturn(){return textAfterReturn.getText();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div/a")
    private WebElement continueAfterMessage;
    public void clickOnContinueAfterReturn(){continueAfterMessage.click();}




}