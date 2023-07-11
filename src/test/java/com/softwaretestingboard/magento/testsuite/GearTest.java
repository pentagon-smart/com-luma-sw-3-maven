package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.ProductPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

    GearPage gearPage = new GearPage();
    ProductPage productPage = new ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {
        //* Mouse Hover on Gear Menu
        //* Click on Bags
        gearPage.mouseHoverAndClickOnBags();
        Thread.sleep(1000);

        //* Click on Product Name ‘Overnight Duffle’
        productPage.clickOnProduct();
        Thread.sleep(1000);

        //* Verify the text ‘Overnight Duffle’
        productPage.getProductText();
        Thread.sleep(1000);

        //* Change Qty 3
        productPage.changeQty();
        Thread.sleep(1000);

        //* Click on ‘Add to Cart’ Button.
        productPage.clickOnaddToCart();
        Thread.sleep(1000);

        //* Verify the text ‘You added Overnight Duffle to your shopping cart.’
        shoppingCartPage.getMessageText();
        Thread.sleep(1000);

        //* Click on ‘shopping cart’ Link into message
        shoppingCartPage.clickOnShoppingCart1();
        Thread.sleep(1000);

        //* Verify the product name ‘Overnight Duffle’
        shoppingCartPage.getProductOvernightDuffel();
        Thread.sleep(1000);

        //* Verify the Qty is ‘3’
        //* Verify the product price ‘$135.00’
        shoppingCartPage.getProductPrice();
        Thread.sleep(1000);

        //* Change Qty to ‘5’
        shoppingCartPage.enterQty();
        Thread.sleep(1000);

        //* Click on ‘Update Shopping Cart’ button
        shoppingCartPage.clickOnUpdateShoppingCart();
        Thread.sleep(1000);

        //* Verify the product price ‘$225.00’
        shoppingCartPage.getProductPrice1();
        Thread.sleep(1000);
    }
}
