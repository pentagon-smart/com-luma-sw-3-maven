package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GearPage extends Utility {

    By gearMenu = By.xpath("//span[contains(text(),'Gear')]");
    By bags = By.xpath("//a[@id='ui-id-25']");



    public void mouseHoverAndClickOnBags(){
        WebElement text1 = driver.findElement(gearMenu);
        WebElement text2 = driver.findElement(bags);
        Actions actions= new Actions(driver);
        actions.moveToElement(text1).moveToElement(text2).click().build().perform();
    }



}
