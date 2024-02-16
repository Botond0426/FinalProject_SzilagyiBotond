package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckWidgetTitlePAGE extends BasePage{
    public CheckWidgetTitlePAGE(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div[7]/div/div[3]")
    private WebElement ipadProWidget;
    public void clickOnAppleIpadProWidget(){ipadProWidget.click();}
    @FindBy(xpath = "/html/body/div[1]/div[9]/div[1]/div[2]/div/div[2]/div[2]/div[1]/h1")
    private WebElement titleOfAppleIpad;
    public String getTextOfAppleIpad(){return titleOfAppleIpad.getText();}






}