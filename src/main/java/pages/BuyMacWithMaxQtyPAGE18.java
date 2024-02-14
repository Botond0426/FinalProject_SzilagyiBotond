package pages;

import org.openqa.selenium.*;
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
    @FindBy(css = "ul.horizontal > li:nth-child(1) > a:nth-child(1)")
    private WebElement homePage;
    public void clickOnHomePage(){homePage.click();}
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
        quantityField.clear();
        quantityField.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div/table/tbody/tr/td[4]/div/div/button[1]")
    private WebElement reloadQuantity;
    public void reloadQuantityOfProduct(){reloadQuantity.click();}
    //714 is the quantity,but not the max,
    // somehow increasing the quantity and reloading quantity i was able to get 863 units and i was able to checkout
    //this is not 100% reproducible
    @FindBy(linkText = "Checkout")
    private WebElement checkOut;
    public void clickOnCheckOut(){

        WebElement checkout = new WebDriverWait(driver, Duration.ofSeconds(40))
                .until(ExpectedConditions.elementToBeClickable(checkOut));

        checkOut.click();}

    @FindBy(css = "#payment-address > div:nth-child(2) > div:nth-child(1)")
    private WebElement savedAddress;
    public void clickOnSavedAddress(){
        WebElement savedAddressButton = new WebDriverWait(driver, Duration.ofSeconds(7))
                .until(ExpectedConditions.elementToBeClickable(savedAddress));
        savedAddress.click();}
    @FindBy(css = "div.custom-control:nth-child(6) > label:nth-child(2)")
    private WebElement termsCheckbox;
    public void clickOnTnCcheckBox(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", termsCheckbox);
        termsCheckbox.click();}
    @FindBy(css = "#button-save")
    private WebElement continueButton;
    public void clickOnContinueButton(){continueButton.click();}
    @FindBy(css = "#button-confirm")
    private WebElement confirmOrderButton;
    public void clickOnConfirmOrderButton(){
        WebElement confirmOrderWait = new WebDriverWait(driver, Duration.ofSeconds(7))
                .until(ExpectedConditions.elementToBeClickable(confirmOrderButton));
        confirmOrderButton.click();}
    @FindBy(css = "#content > p:nth-child(3)")
    private WebElement orderConfirmedTitle;
    public String getTextAfterPurchase(){return orderConfirmedTitle.getText();}

// Your order has been placed!
    //copy the title as its pasted
    private void dismissAlert(WebElement element) {
        try {
            // Attempt to find and dismiss the alert
            Alert alert = driver.switchTo().alert();
            alert.dismiss();
        } catch (Exception e) {
            // Handle exceptions or log the error
            e.printStackTrace();
        }

    }






}