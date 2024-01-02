package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FourthTestPage extends BasePage {
    public FourthTestPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
//this page selects elements for shopping apple display,but testing if the page allows user to buy without a size.
    }
   @FindBy(xpath = "//*[@id=\"swiper-wrapper-dd8d10b9920a42fe6\"]/div[2]/div/div[1]/div[2]/button[1]/i")
    private WebElement ShopAppleDisplay;
    public void clickOnShopAppleDisplay(){ShopAppleDisplay.click();}
   @FindBy(xpath = "//*[@id=\"entry_212943\"]/div")
    private WebElement minimumQtyRequirement;
    public void getTextInRequirements(String text){
        minimumQtyRequirement.getText();
    }
    @FindBy(xpath = "//*[@id=\"entry_212964\"]/button")
    private WebElement addToCartApple;
    public void clickOnAddToCartApple(){addToCartApple.click();}
    @FindBy(xpath = "//*[@id=\"entry_212958\"]/form/div/div")
    private WebElement sizeRequired;
    public void getTextInSizeRequirement(String text){
        sizeRequired.getText();
    }



}
