package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckIfComparisonWorksPAGE16 extends BasePage{
    public CheckIfComparisonWorksPAGE16(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath ="/html/body/div[1]/div[5]/div[1]/div[7]/div/div[2]/div/div[2]/div/div[1]/div/div/div[2]/div/div[1]")
    private WebElement appleProduct;
    public void clickOnAppleProduct(){appleProduct.click();}
    @FindBy(xpath = "/html/body/div[1]/div[9]/div[1]/div[2]/div/div[2]/div[2]/div[10]/div/div[5]/button")
    private WebElement compareAppleProduct;
    public void clickOnAppleComparison(){compareAppleProduct.click();}
    @FindBy(xpath = "/html/body/div[1]/div[9]/header/div[2]/div[1]/div[1]")
    private WebElement homepageButton;
    public void clickOnHomePageButton(){homepageButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div[7]/div/div[2]/div/div[2]/div/div[1]/div/div/div[3]/div/div[1]")
    private WebElement fridgeProduct;
    public void clickOnFridge(){fridgeProduct.click();}
    @FindBy(xpath = "/html/body/div[1]/div[9]/div[1]/div[2]/div/div[2]/div[2]/div[10]/div/div[5]/button")
    private WebElement compareFridgeButton;
    public void clickOnCompareFridgeButton(){compareFridgeButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/header/div[2]/div[1]/div[3]")
    private WebElement compareButton;
    public void clickOnCompareButton(){compareButton.click();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/table/tbody[1]/tr[1]/td[2]/a/strong")
    private WebElement item1Title;
    public String getTextOf1stItem(){return item1Title.getText();}
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/table/tbody[1]/tr[1]/td[3]/a/strong")
    private WebElement item2Title;
    public String getTextOf2ndItem(){return item2Title.getText();}



}