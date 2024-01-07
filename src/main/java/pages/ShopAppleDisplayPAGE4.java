package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShopAppleDisplayPAGE4 extends BasePage {
    public ShopAppleDisplayPAGE4(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
//this page selects elements for shopping apple display,but testing if the page allows user to buy without a size.
    }
   @FindBy(css = "#mz-product-listing-image-39213264-0-1")
    private WebElement ShopAppleDisplay;

    public void clickOnShopAppleDisplay(){ShopAppleDisplay.click();}
    @FindBy(xpath = "//*[@id=\"entry_216852\"]/div/text()")
    private WebElement SizeRequired;
    public String getTextInSizeRequirement(){return SizeRequired.getText();
    }



}
