package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOrderStatusPAGE extends BasePage{
    public CheckOrderStatusPAGE(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[6]/a")
    private WebElement myAccountButton;
    public void clickOnMyAccountButton(){myAccountButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div/div[2]/div/div/form/div[1]/input")
    private WebElement emailField;
    public void typeInEmailField(String text){emailField.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div/div[2]/div/div/form/div[2]/input")
    private WebElement passwordField;
    public void typeInPasswordField(String text){passwordField.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div/div[2]/div/div/form/input[1]")
    private WebElement loginButton;
    public void clickOnLoginButton(){loginButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/aside/div/a[7]")
    private WebElement orderHistory;
    public void clickOnOrderHistory(){orderHistory.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div[1]/table/tbody/tr/td[7]/a/i")
    private WebElement viewOrders;
    public void clickOnViewOrders(){viewOrders.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/table[3]/tbody/tr/td[2]")
    private WebElement orderStatus;
    public String getStatusOfOrder(){return orderStatus.getText();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div[2]/div/a")
    private WebElement continueAfterHistory;
    public void clickOnContinueButton(){continueAfterHistory.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div[3]/div/a")
    private WebElement continueToDashboard;
    public void clickOnContinueButton2(){continueToDashboard.click();}
    @FindBy(css = "#widget-navbar-217834 > ul > li:nth-child(6) > a")
    private WebElement myAccountButton2;
    public void clickOnMyAccountButton2(){myAccountButton.click();}
    @FindBy(css = "#column-right > div > a:nth-child(14)")
    private WebElement logoutButton1;
    public void clickOnLogout1(){logoutButton1.click();}



}