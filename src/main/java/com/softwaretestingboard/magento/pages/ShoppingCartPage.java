package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By addToCart = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    By verifyCart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");
    By shoppingCart = By.xpath("//h1[@class='page-title']");
    By verifyproductName = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By verifyproductSize = By.xpath("//dd[contains(text(),'32')]");
    By verifyProductColour = By.xpath("//dd[contains(text(),'Black')]");

    By verifyText = By.xpath("//div[@class='message-success success message']");
    By shoppingCart1 = By.xpath("//a[contains(text(),'shopping cart')]");
    By productOvernightDuffel = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By verifyPrice = By.xpath("//td[@class='col subtotal']//span[text()='$135.00']");
    By verifyPrice1 = By.xpath("//td[@class='col subtotal']//span[text()='$225.00']");
    By qtyChage = By.xpath("(//input[@class='input-text qty'])[1]");
    By updateShoppigCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    public void mouseHoverAndClickOnCart(){
        mouseHoverToElementAndClick(addToCart);
    }
    public void getShoppingCart(){
        verifyText(verifyCart,"You added Cronus Yoga Pant to your shopping cart.","Message is not displayed");
    }
    public void clickOnShoppingCart(){
        clickOnElement(shoppingCartLink);
    }
    public void getShoppingCartText(){
        verifyText(shoppingCart,"Shopping Cart","Text is not displayed");
    }
    public void getProductName(){
        verifyText(verifyproductName,"Cronus Yoga PantCronus Yoga Pant","Cronus Yoga Pant is not displayed");
    }
    public void getProductSize(){
        verifyText(verifyproductSize,"32","32 is not displayed");
    }
    public void getProductColour(){
        verifyText(verifyProductColour,"Black","Black is not displayed");
    }
    public void getMessageText(){
        verifyText(verifyText,"You added Overnight Duffle to your shopping cart.","Message is not displayed");
    }
    public void clickOnShoppingCart1(){
        clickOnElement(shoppingCart1);
    }
    public void getProductOvernightDuffel(){
        verifyText(productOvernightDuffel,"Overnight Duffle","Overnight Duffle is not displayed");
    }
    public void getProductPrice(){
        verifyText(verifyPrice,"$135.00","$135.00 is not displayed");
    }
    public void enterQty(){
        driver.findElement(By.xpath("//input[@class='input-text qty']")).clear();
        sendTextToElement(qtyChage,"5");
    }
    public void clickOnUpdateShoppingCart(){
        clickOnElement(updateShoppigCart);
    }
    public void getProductPrice1(){
        verifyText(verifyPrice1,"$225.00","$225.00 is not displayed");
    }
}
