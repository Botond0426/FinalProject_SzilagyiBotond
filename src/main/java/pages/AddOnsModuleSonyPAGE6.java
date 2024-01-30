package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddOnsModuleSonyPAGE6 extends BasePage{
    public AddOnsModuleSonyPAGE6(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    //click to Addons
   @FindBy(xpath = "//*[@id=\"widget-navbar-217834\"]/ul/li[5]")
    private WebElement AddOns1;
    public void hoverOverAddOns1() {
        Actions actions = new Actions(driver);
        actions.moveToElement(AddOns1).perform();
    }
   //click to Modules
    @FindBy(xpath = "//*[@id=\"widget-navbar-217834\"]/ul/li[5]/ul/li[1]/a/div/span")
    private WebElement Modules1;
    public void clickOnModules1(){Modules1.click();}
   //click to Sony and see if the correct text is written in title
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div[4]/div/div[2]/div/div[1]/div[8]/a/figure/figcaption")
    private WebElement Sony1;
    public void clickOnSony1(){Sony1.click();}
    @FindBy(xpath = "//*[@id=\"entry_212427\"]/h1")
    private WebElement SonyTitle;
    public String getTextOfSony(){ return SonyTitle.getText();}

}
