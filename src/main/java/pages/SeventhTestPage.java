package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeventhTestPage extends BasePage{
    public SeventhTestPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"widget-navbar-217834\"]/ul/li[4]/a/div/span")
    private WebElement MegaMenu;
    public void clickOnMegaMenu1(){MegaMenu.click();}
    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    private WebElement AboutUsTitle1;
    public String getTextOfAboutUs(){ return AboutUsTitle1.getText();}
}