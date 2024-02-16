package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterAffiliatePAGE extends BasePage{
    public RegisterAffiliatePAGE(WebDriver driver){
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
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div[3]/div/a")
    private WebElement affiliateMenu;
    public void clickOnAffiliate(){affiliateMenu.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[1]/div[1]/div/input")
    private WebElement companyName;
    public void typeInCompanyField(String text){
        WebElement textBoxForCompany = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[1]/div[1]/div/input"));

        // Clear the existing text in the text box
        textBoxForCompany.clear();
        companyName.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[1]/div[2]/div/input")
    private WebElement webSiteField;
    public void typeInWebsiteField(String text){
        WebElement textBoxForWebsite = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[1]/div[2]/div/input"));

        // Clear the existing text in the text box
        textBoxForWebsite.clear();
        webSiteField.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[2]/div[1]/div/input")
    private WebElement taxId;
    public void typeInTaxIDField(String text){
        WebElement textBoxForTaxID = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[2]/div[1]/div/input"));

        // Clear the existing text in the text box
        textBoxForTaxID.clear();
        taxId.sendKeys(text);}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[2]/div[2]/div/div[2]/label/input")
    private WebElement paypalCheckbox;
    public void checkPaypal(){paypalCheckbox.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[2]/div[4]/div/input")
    private WebElement emailForPaypal;
    public void typeInEmailForPayPal(String text){
        WebElement textBoxForPaypal = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[2]/div[4]/div/input"));

        // Clear the existing text in the text box
        textBoxForPaypal.clear();

        emailForPaypal.sendKeys(text);}

    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div/div/input")
    private WebElement signUpButton;
    public void clickOnSignButton(){

        signUpButton.click();}
    @FindBy(css = "#widget-navbar-217834 > ul > li:nth-child(6) > a")
    private WebElement myAccountButton;
    public void clickOnMyAccountButton(){myAccountButton.click();}
    @FindBy(css = "#column-right > div > a:nth-child(14)")
    private WebElement logoutButton1;
    public void clickOnLogout1(){logoutButton1.click();}
}