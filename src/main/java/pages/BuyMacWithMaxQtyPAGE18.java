package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BuyMacWithMaxQtyPAGE18 extends BasePage{
    public BuyMacWithMaxQtyPAGE18(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#mz-product-listing-image-37213259-0-1 > div:nth-child(1) > div:nth-child(1)")
    private WebElement iMacProduct;
    public void clickOnAppleiMac(){iMacProduct.click();}
    @FindBy(css = "#entry_216842 > button:nth-child(1)")
    private WebElement addToCart;
    public void clickOnAddToCart(){addToCart.click();}
    @FindBy(css = "div.align-items-start:nth-child(1) > p:nth-child(2) > a:nth-child(2)")
    private WebElement viewCart;
    public void clickOnViewCart(){
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(7))
                .until(ExpectedConditions.elementToBeClickable(viewCart));
        viewCart.click();}
    @FindBy(css = ".flex-nowrap > input:nth-child(1)")
    private WebElement quantityField;
    public void insertQuantityOfProduct(String text){

        quantityField.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div/table/tbody/tr/td[4]/div/div/button[1]")
    private WebElement reloadQuantity;
    public void reloadQuantityOfProduct(){reloadQuantity.click();}
    //714 is the quantity,but not the max,
    // somehow increasing the quantity and reloading quantity i was able to get 863 units and i was able to checkout
    //this is not 100% reproducible
    @FindBy(css = "a.btn:nth-child(2)")
    private WebElement checkOut;
    public void clickOnCheckOut(){
        WebElement elementButton = new WebDriverWait(driver, Duration.ofSeconds(7))
                .until(ExpectedConditions.elementToBeClickable(checkOut));
        checkOut.click();}
    @FindBy(css = "div.custom-control-inline:nth-child(1) > label:nth-child(2)")
    private WebElement loginCheckBox;
    public void clickOnLoginCheckbox(){loginCheckBox.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div/div[1]/div/div[2]/div[1]/div/input")
    private WebElement emailForLogin;
    public void loginEmailForPurchase(String text){emailForLogin.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div/div[1]/div/div[2]/div[2]/div/input")
    private WebElement passwordForLogin;
    public void loginPasswordForPurchase(String text){passwordForLogin.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div/div[1]/div/div[2]/div[1]/div[1]/label")
    private WebElement savedAddress;
    public void clickOnSavedAddress(){savedAddress.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div/div[2]/div/div[5]/label/text()")
    private WebElement termsCheckbox;
    public void clickOnTnCcheckBox(){termsCheckbox.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div/div[2]/div/button")
    private WebElement continueButton;
    public void clickOnContinueButton(){continueButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div[4]/button")
    private WebElement confirmOrderButton;
    public void clickOnConfirmOrderButton(){confirmOrderButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/h1/text()")
    private WebElement orderConfirmedTitle;
    public String getTextAfterPurchase(){return orderConfirmedTitle.getText();}

// Your order has been placed!
    //copy the title as its pasted








}