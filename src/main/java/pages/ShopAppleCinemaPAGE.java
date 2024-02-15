package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShopAppleCinemaPAGE extends BasePage {
    public ShopAppleCinemaPAGE(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
//this page selects elements for shopping apple display,but testing if the page allows user to buy without a size.
    }
   @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div[7]/div/div[2]/div/div[2]/div/div[1]/div/div/div[2]/div/div[1]")
    private WebElement ShopAppleDisplay;

    public void clickOnShopAppleDisplay(){ShopAppleDisplay.click();}
    @FindBy(xpath = "/html/body/div[1]/div[9]/div[1]/div[2]/div/div[2]/div[2]/div[10]/div/div[4]/div/div[3]/button")
    private WebElement BuyNowDisplayButton;
    public void clickOnBuyNowButton(){BuyNowDisplayButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[9]/div[1]/div[2]/div/div[2]/div[2]/div[10]/div/div[1]/form/div/div")
    private WebElement SizeRequired;
    public String getTextInSizeRequirement(){return SizeRequired.getText();
    }



}
