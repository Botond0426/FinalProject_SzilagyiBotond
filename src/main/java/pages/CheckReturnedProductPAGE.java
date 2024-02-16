package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckReturnedProductPAGE extends BasePage {
    public CheckReturnedProductPAGE(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
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
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div[2]/div/div/div[4]/a/i")
    private WebElement returnRequests;
    public void clickOnReturnRequests(){returnRequests.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div[1]/table/tbody/tr/td[6]/a/i")
    private WebElement viewReturnedProduct;
    public void clickOnReturnedProduct(){viewReturnedProduct.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div[1]/table/tbody/tr/td[1]")
    private WebElement NikonD300;
    public String getTextOfReturnedProduct(){return NikonD300.getText();}
    @FindBy(css = "#widget-navbar-217834 > ul > li:nth-child(6) > a")
    private WebElement myAccountButton2;
    public void clickOnMyAccountButton2(){myAccountButton2.click();}
    @FindBy(css = "#column-right > div > a:nth-child(14)")
    private WebElement logoutButton1;
    public void clickOnLogout1(){logoutButton1.click();}




}
