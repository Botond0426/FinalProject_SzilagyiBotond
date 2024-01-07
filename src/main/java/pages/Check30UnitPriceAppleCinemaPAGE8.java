package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check30UnitPriceAppleCinemaPAGE8 extends BasePage{
    public Check30UnitPriceAppleCinemaPAGE8(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div[7]/div/div[2]/div/div[2]/div/div[1]/div/div/div[2]/div/div[1]/div[1]/a/div/div[1]")
    private WebElement AppleIpad1;
    public void clickOnAppleIpad1(){AppleIpad1.click();}
    @FindBy(xpath = "//*[@id=\"mz-filter-panel-0-3\"]/div/div")
    private WebElement checkboxInStock1;
    public void clickOnCheckboxInstock1(){checkboxInStock1.click();}
    @FindBy(css = "#mz-filter-panel-0-4 > div > div:nth-child(5) > div > label")
    private WebElement xxlSize1;
    public void clickOnXXLSize1(){xxlSize1.click();}
    @FindBy(xpath = "//*[@id=\"mz-product-grid-image-42-212439\"]/div/div[1]")
    private WebElement appleCinema30;
    public void clickOnAppleCinema30(){appleCinema30.click();}
    @FindBy(xpath = "//*[@id=\"input-option231-216836\"]")
    private WebElement sizeOfAppleCinema30;
    public void clickOnSizeOfAppleCinema30(){sizeOfAppleCinema30.click();}
    @FindBy(xpath = "//*[@id=\"input-option231-216836\"]/option[5]")
    private WebElement largeSizeOfAppleCinema30;
    public void clickOnLargeSizeApple(){largeSizeOfAppleCinema30.click();}
    @FindBy(xpath = "//*[@id=\"entry_216841\"]/div/div[2]/button")
    private WebElement increaseValueOfApple;
    public void clickOnPlusApple(){increaseValueOfApple.click();}
    @FindBy(xpath = "//*[@id=\"entry_216843\"]/button")
    private WebElement BuyNowButtonApple;
    public void clickOnBuyNowButtonApple(){BuyNowButtonApple.click();}
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/table/tbody/tr/td[5]")
    private WebElement UnitPriceOf30Apple;
    public String getTextOfAppleUnitPrice(){ return UnitPriceOf30Apple.getText();}

}