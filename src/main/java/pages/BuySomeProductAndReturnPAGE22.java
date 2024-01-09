package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BuySomeProductAndReturnPAGE22 extends BasePage{
    public BuySomeProductAndReturnPAGE22(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }


}