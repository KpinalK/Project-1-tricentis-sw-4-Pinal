package com.tricentis.demo.pages;

import com.tricentis.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By welcomeMessage=By.xpath("//h2[normalize-space()='Welcome to our store']");

    /* This method will get welcome message
     * */
    public String getWelcomeMessage(){
        return getTextFromElement(welcomeMessage);
    }
    /**
     * This method will get current url
     */
    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

}
