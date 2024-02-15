package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckComponentsTitlePAGE extends BasePage {
//this page selects for testing Components title after clicking-categories-components.
    public CheckComponentsTitlePAGE(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#entry_217832 > a")
    private WebElement Categories;

    public void clickOnCategories() {
        Categories.click();
    }

    @FindBy(css = "#widget-navbar-217841 > ul > li:nth-child(1) > a > div.info > span")
    private WebElement Components;

    public void clickOnComponents() {
        Components.click();
    }

    @FindBy(css = "#entry_212392 > h1")
    private WebElement ComponentsTitle;
//PLEASE CORRECT ALL OF THE PAGES WITH THIS GETTEXT METHOD
    public String getTextInTitle(){return ComponentsTitle.getText();
    }
}
