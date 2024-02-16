package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckMaximumQuantityPAGE extends BasePage{
    public CheckMaximumQuantityPAGE(WebDriver driver){
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
    @FindBy(css = "#mz-product-listing-image-37213259-0-3 > div > div.carousel-item.active > img")
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
    @FindBy(css = "#content > form > div > table > tbody > tr > td:nth-child(4) > div > div > button.btn.btn-primary")
    private WebElement reloadQuantity;
    public void reloadQuantityOfProduct(){
        WebElement reload = new WebDriverWait(driver, Duration.ofSeconds(17))
                .until(ExpectedConditions.elementToBeClickable(reloadQuantity));
        reloadQuantity.click();}
    @FindBy(css = "#checkout-cart > div.alert.alert-success.alert-dismissible")
    private WebElement textAfterReload;
    public String getTextAfterReload(){
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(35))
                .until(ExpectedConditions.visibilityOf(textAfterReload));
        return textAfterReload.getText();}

    @FindBy(css = "#widget-navbar-217834 > ul > li:nth-child(6) > a")
    private WebElement myAccountButton;
    public void clickOnMyAccountButton(){myAccountButton.click();}
    @FindBy(linkText = " Logout")
    private WebElement logoutButton1;
    public void clickOnLogout1(){logoutButton1.click();}






}