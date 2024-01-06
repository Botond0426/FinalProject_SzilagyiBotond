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
   @FindBy(xpath = "//*[@id=\"swiper-wrapper-f87441010f743d79e5\"]/div[2]/div/div[2]/h4/a")
    private WebElement ShopAppleDisplay;
    public void clickOnShopAppleDisplay(){ShopAppleDisplay.click();}
    @FindBy(xpath = "//*[@id=\"entry_216852\"]/div/text()")
    private WebElement sizeRequired;
    public String getTextInSizeRequirement(){ return sizeRequired.getText();
    }



}
