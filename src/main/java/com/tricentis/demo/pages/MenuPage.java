package com.tricentis.demo.pages;

import com.tricentis.demo.utilities.Utility;
import org.openqa.selenium.By;

public class MenuPage extends Utility {

    //Find locators for menu page
    By computerMenu=By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a");
    By electronicMenu=By.xpath("//ul[@class='top-menu']//a[normalize-space()='Electronics']");
    By cellPhone= By.xpath("//ul[@class='top-menu']//a[normalize-space()='Cell phones']");

    /**
     * This method will click on computer menu
     * */
    public void clickOnComputerMenu(){
        clickOnElement(computerMenu);

    }
    /**
     * This method will mouse hover on electronics menu
     * */
    public void mouseHoverOnElectronicsTab(){
        mouseHoverToElement(electronicMenu);

    }
    /**
     * This method will mouse hover and click on cell phone
     * */
    public void mouseHoverAndClickOnCellPhoneTab(){
        mouseHoverToElementAndClick(cellPhone);

    }


    /**
     * This method will select menu in the TopMenu
     * */
    public void selectMenu(String menu){
        clickOnElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='"+ menu +"']"));
    }


}
