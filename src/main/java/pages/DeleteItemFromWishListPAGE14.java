package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteItemFromWishListPAGE14 extends BasePage{
    public DeleteItemFromWishListPAGE14(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[6]/a/div")
    private WebElement loginUser1;

    public void clickOnLoginUser1() {loginUser1.click();}

    @FindBy(xpath = "//*[@id=\"input-email\"]")
    private WebElement typeInUserEmail;
    public void loginUserEmail(String text){typeInUserEmail.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"input-password\"]")
    private WebElement typeInUserPassword;
    public void loginUserPassword(String text){typeInUserPassword.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div/form/input")
    private WebElement loginButton;
    public void clickOnLoginButton(){loginButton.click();}
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/div[4]/a/i")
    private WebElement modifyYourWishlist;
    public void clickOnModifyYourWishlist(){modifyYourWishlist.click();}
    //the locator of removeFromWishlist should be change at every test run,because it will delete that item and the item cannot be found.
    //the tr[nr] is changing.
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/div[1]/table/tbody/tr[6]/td[6]/a")
    private WebElement removeFromWishlist;
    public void clickOnRemoveFromWishlist(){removeFromWishlist.click();}
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/a")
    private WebElement continueWishlist;
    public void clickOnContinueWishlist(){continueWishlist.click();}

}