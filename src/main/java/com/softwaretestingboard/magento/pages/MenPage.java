package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MenPage extends Utility {

    By menMenu = By.xpath("//span[normalize-space()='Men']");
    By bottoms = By.xpath("//a[@id='ui-id-18']");
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

    public void mouseHoverOnMen(){
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottoms(){
        mouseHoverToElement(bottoms);
    }
    public void mouseHoverAndClickOnPants(){

        WebElement text1 = driver.findElement(menMenu);
        WebElement text2 = driver.findElement(bottoms);
        WebElement text3 = driver.findElement(pants);
        Actions actions= new Actions(driver);
        actions.moveToElement(text1).moveToElement(text2).moveToElement(text3).click().build().perform();
    }


}
