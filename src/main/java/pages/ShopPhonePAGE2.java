package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPhonePAGE2 extends BasePage {
    public ShopPhonePAGE2(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    //This page selects for testing to shop the htc phone and register a new user at the checkout.
@FindBy(xpath ="//*[@id=\"mz-product-listing-image-39213264-0-0\"]/div/div[1]/img")
    private WebElement ShopThePhone;
    public void clickOnPhone(){
        ShopThePhone.click();
    }

    @FindBy(xpath ="//*[@id=\"entry_216843\"]/button")
    private WebElement BuyNowButton1;
    public void clickOnBuyNow(){
        BuyNowButton1.click();
    }
    @FindBy(xpath = "//*[@id=\"input-payment-firstname\"]")
    private WebElement FirstNameField;
    public void enterTextInFirstNameField(String text){FirstNameField.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"input-payment-lastname\"]")
    private WebElement SecondNameField;
    public void enterTextInSecondNameField(String text){SecondNameField.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"input-payment-email\"]")
    private WebElement EmailField;
    public void enterTextInEmailField(String text){EmailField.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"input-payment-telephone\"]")
    private WebElement PhoneNumber;
    public void enterPhoneNumber(String text){PhoneNumber.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"input-payment-password\"]")
    private WebElement Password1;
    public void enterPassword1(String text){Password1.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"input-payment-confirm\"]")
    private WebElement Password2;
    public void enterPassword2(String text){Password2.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"input-payment-address-1\"]")
    private WebElement Address1;
    public void enterAddress1(String text){Address1.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"input-payment-city\"]")
    private WebElement City1;
    public void enterCity1(String text){City1.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"input-payment-postcode\"]")
    private WebElement PostCode1;
    public void enterPostCode1(String text){PostCode1.sendKeys(text);}
    @FindBy(xpath = "//*[@id=\"input-payment-country\"]")
    private WebElement InputCountry;
    public void clickOnDropDownMenu(){InputCountry.click();}
    @FindBy(xpath = "//*[@id=\"input-payment-country\"]/option[186]")
    private WebElement SelectCountryRomania;
    public void clickOnSelectCountryRomania(){
        SelectCountryRomania.click();
    }
    @FindBy(xpath = "//*[@id=\"input-payment-zone\"]")
    private WebElement InputZone;
    public void clickOnDropDownMenu2(){InputZone.click();}
    @FindBy(xpath = "//*[@id=\"input-payment-zone\"]/option[15]")
    private WebElement SelectRegionCluj;
    public void clickOnSelectRegionCluj(){
        SelectRegionCluj.click();
    }
    @FindBy(css = "#form-checkout > div > div.col-lg-7.mb-5.mb-lg-0 > div > div:nth-child(4) > label")
    private WebElement ClickOnPrivacyPolicy;
    public void clickOnPrivacyPolicy(){
        ClickOnPrivacyPolicy.click();
    }
    @FindBy(css = "#form-checkout > div > div.col-lg-7.mb-5.mb-lg-0 > div > div:nth-child(6) > label")
    private WebElement ClickOnTnC;
    public void clickOnTnC(){
        ClickOnTnC.click();
    }
    @FindBy(xpath = "//*[@id=\"button-save\"]")
    private WebElement ClickOnContinue;
    public void clickOnContinue(){
        ClickOnContinue.click();
    }
    @FindBy(xpath = "//*[@id=\"button-confirm\"]")
    private WebElement ConfirmOrder1;
    public void clickOnConfirmOrder1(){
        ConfirmOrder1.click();
    }
    @FindBy(xpath ="//*[@id=\"content\"]/div/a")
    private WebElement ContinueAfterOrder;
    public void clickOnContinueAfterOrder(){
        ContinueAfterOrder.click();
    }
}