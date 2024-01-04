package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SixthTestPage extends BasePage{
    public SixthTestPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    //click to Addons
   @FindBy(xpath = "//*[@id=\"widget-navbar-217834\"]/ul/li[5]/a/div/span")
    private WebElement AddOns1;
    public void clickOnAddOns1(){AddOns1.click();}
   //click to Modules
    @FindBy(xpath = "//*[@id=\"widget-navbar-217834\"]/ul/li[5]/ul/li[1]/a/div/span")
    private WebElement Modules1;
    public void clickOnModules1(){Modules1.click();}
   //click to Sony and see if the correct text is written in title
    @FindBy(xpath = "//*[@id=\"swiper-wrapper-be9ad95eaa5a0b29\"]/div[8]/a/figure/figcaption")
    private WebElement Sony1;
    public void clickOnSony1(){Sony1.click();}
    @FindBy(xpath = "//*[@id=\"entry_212427\"]/h1")
    private WebElement SonyTitle;
    public String getTextOfSony(){ return SonyTitle.getText();}

}
