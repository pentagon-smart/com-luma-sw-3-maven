package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductPage extends Utility {

    By productFilter = By.xpath("(//select[@id='sorter'])[1]");

    By priceFilter = By.xpath("(//select[@id='sorter'])[1]");
    By productName = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By productSize= By.xpath("(//div[@class='swatch-option text'])[1]");
    By colour = By.xpath("(//div[@class='swatch-option color'])[1]");
    By product = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By verifyTextProduct = By.xpath("//span[@class='base']");
    By qty = By.xpath("//input[@id='qty']");
    By addToCart = By.xpath("//button[@id='product-addtocart-button']");

    public void selectProduct(){
        selectByVisibleTextFromDropDown(productFilter,"Product Name");
    }

    public void selectPrice(){
        selectByVisibleTextFromDropDown(priceFilter,"Price");
    }


    public void sortByProductName(){
        // Storing jackets names in list
        List<WebElement> jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListBefore.add(value.getText());
        }
        // Select Sort By filter “Product Name”
        selectByVisibleTextFromDropDown(By.xpath("(//select[@id='sorter'])[1]"), "Product Name");
        // After Sorting value
        jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketsNameListAfter = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListAfter.add(value.getText());
        }
        // Sort the before name list into Ascending Order
        jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order
        // Verify the products name display in alphabetical order
        Assert.assertEquals(jacketsNameListBefore, jacketsNameListAfter);
    }

    public void sortByPrice(){
        // Storing jackets price in list
        List<WebElement> jacketsPriceElementList = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketsPriceListBefore = new ArrayList<>();
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));
        }
        // Select Sort By filter “Price”
        selectByVisibleTextFromDropDown(By.xpath("(//select[@id='sorter'])[1]"), "Price");
        // After Sorting Products by Price
        jacketsPriceElementList = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketsPriceListAfter = new ArrayList<>();
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
        }
        // Sort the jacketPriceListBefore to Ascending Order
        Collections.sort(jacketsPriceListBefore);
        // Verify the products price display in Low to High
        Assert.assertEquals(jacketsPriceListBefore, jacketsPriceListAfter);
    }
    public void mouseHoverOnProduct(){
        mouseHoverToElement(productName);
    }

    public void mouseHoverAndClickOnSize(){
        mouseHoverToElementAndClick(productSize);
    }
    public void mouseHoverAndClickOnColour(){
        mouseHoverToElementAndClick(colour);
    }
    public void clickOnProduct(){
        clickOnElement(product);
    }
    public void getProductText(){
        verifyText(verifyTextProduct,"Overnight Duffle","Overnight Duffle is not displayed");
    }
    public void changeQty(){
        driver.findElement(By.xpath("//input[@id='qty']")).clear();
        sendTextToElement(qty,"3");
    }
    public void clickOnaddToCart(){
        clickOnElement(addToCart);
    }

}

