package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwentyninthTestPage extends BasePage{
    public TwentyninthTestPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
}