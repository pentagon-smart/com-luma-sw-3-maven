package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.pages.ProductPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

    MenPage menPage = new MenPage();
    ProductPage productPage = new ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {
        //* Mouse Hover on Men Menu
        //* Mouse Hover on Bottoms
        //* Click on Pants
        menPage.mouseHoverAndClickOnPants();
        Thread.sleep(1000);

        //* Mouse Hover on product name
        productPage.mouseHoverOnProduct();
        Thread.sleep(1000);

        //‘Cronus Yoga Pant’ and click on size 32.
        productPage.mouseHoverAndClickOnSize();
        Thread.sleep(1000);

        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        productPage.mouseHoverAndClickOnColour();
        Thread.sleep(1000);

        //* Mouse Hover on product name Cronus Yoga Pant’ and click on Add To Cart’ Button.
        productPage.mouseHoverOnProduct();
        shoppingCartPage.mouseHoverAndClickOnCart();
        Thread.sleep(1000);

        //* Verify the text You added Cronus Yoga Pant to your shopping cart.
        shoppingCartPage.getShoppingCart();
        Thread.sleep(1000);

        //* Click on ‘shopping cart’ Link into message
        shoppingCartPage.clickOnShoppingCart();
        Thread.sleep(1000);

        //* Verify the text ‘Shopping Cart.’
        shoppingCartPage.getShoppingCartText();
        Thread.sleep(1000);

        //* Verify the product name ‘Cronus Yoga Pant’
       // shoppingCartPage.getProductName();

        //* Verify the product size ‘32’
        shoppingCartPage.getProductSize();
        Thread.sleep(1000);

        //* Verify the product colour ‘Black’
        shoppingCartPage.getProductColour();
        Thread.sleep(1000);
    }
}
