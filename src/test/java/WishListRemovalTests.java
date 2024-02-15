import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.WishListRemovalPAGE;

public class WishListRemovalTests extends BasePage {
    private WishListRemovalPAGE wishListRemovalPAGE;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        wishListRemovalPAGE = new WishListRemovalPAGE(driver);
    }
    @Test
    public void clickOnLoginUser1(){
        wishListRemovalPAGE.clickOnLoginUser1();
        wishListRemovalPAGE.loginUserEmail("wishlist@wishlist.com");
        wishListRemovalPAGE.loginUserPassword("testcase123");
        wishListRemovalPAGE.clickOnLoginButton();

        wishListRemovalPAGE.clickOnModifyYourWishlist();
        wishListRemovalPAGE.clickOnRemoveFromWishlist();
        wishListRemovalPAGE.clickOnContinueWishlist();
        wishListRemovalPAGE.clickOnLogout1();


    }
}
