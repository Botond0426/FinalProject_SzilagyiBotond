package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.DeleteItemFromWishListPAGE14;

public class DeleteItemFromWL14 extends BasePage {
    private DeleteItemFromWishListPAGE14 deleteItemFromWishListPAGE14;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        deleteItemFromWishListPAGE14 = new DeleteItemFromWishListPAGE14(driver);
    }
    @Test
    public void clickOnLoginUser1(){
        deleteItemFromWishListPAGE14.clickOnLoginUser1();
        deleteItemFromWishListPAGE14.loginUserEmail("tester@tester.com");
        deleteItemFromWishListPAGE14.loginUserPassword("tester123");
        deleteItemFromWishListPAGE14.clickOnLoginButton();
    }
    public void clickOnModifyYourWishlist(){
        deleteItemFromWishListPAGE14.clickOnModifyYourWishlist();
        deleteItemFromWishListPAGE14.clickOnRemoveFromWishlist();
        deleteItemFromWishListPAGE14.clickOnContinueWishlist();


    }
}
