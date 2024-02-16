package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckComparisonPAGE extends BasePage{
    public CheckComparisonPAGE(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath ="/html/body/div[1]/div[5]/div[1]/div[7]/div/div[2]/div/div[2]/div/div[1]/div/div/div[2]/div/div[1]")
    private WebElement appleProduct;
    public void clickOnAppleProduct(){appleProduct.click();}
    @FindBy(xpath = "/html/body/div[1]/div[9]/div[1]/div[2]/div/div[2]/div[2]/div[10]/div/div[5]/button")
    private WebElement compareAppleProduct;
    public void clickOnAppleComparison(){compareAppleProduct.click();}
    @FindBy(xpath = "/html/body/div[1]/div[9]/header/div[2]/div[1]/div[1]")
    private WebElement homepageButton;
    public void clickOnHomePageButton(){homepageButton.click();}
    @FindBy(css = "#mz-product-listing-image-39213264-0-2")
    private WebElement fridgeProduct;
    public void clickOnFridge(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mz-product-listing-image-39213264-0-2")));
        fridgeProduct.click();}
    @FindBy(css = "button.both")
    private WebElement compareFridgeButton;
    public void clickOnCompareFridgeButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.both")));


        compareFridgeButton.click();}
    @FindBy(css = "a.btn:nth-child(2)")
    private WebElement compareButton;
    public void clickOnCompareButton(){compareButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/table/tbody[1]/tr[1]/td[2]/a/strong")
    private WebElement item1Title;
    public String getTextOf1stItem(){return item1Title.getText();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/table/tbody[1]/tr[1]/td[3]/a/strong")
    private WebElement item2Title;
    public String getTextOf2ndItem(){return item2Title.getText();}



}