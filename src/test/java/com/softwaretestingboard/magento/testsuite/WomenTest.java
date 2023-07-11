package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.ProductPage;
import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {

    WomenPage womenPage = new WomenPage();
    ProductPage productPage = new ProductPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        //* Mouse Hover on Women Menu
        //* Mouse Hover on Tops
        //* Click on Jackets
        womenPage.clickOnJacket();
        Thread.sleep(1000);

        //* Select Sort By filter “Product Name”
        productPage.selectProduct();
        Thread.sleep(1000);

        //* Verify the products name display in alphabetical order
        productPage.sortByProductName();
        Thread.sleep(1000);
    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        //* Mouse Hover on Women Menu
        //* Mouse Hover on Tops
        //* Click on Jackets
        womenPage.clickOnJacket();
        Thread.sleep(1000);

        //* Select Sort By filter “Price”
        productPage.selectPrice();
        Thread.sleep(1000);

        //* Verify the products price display in Low to High
        productPage.sortByPrice();
        Thread.sleep(1000);
    }
}
