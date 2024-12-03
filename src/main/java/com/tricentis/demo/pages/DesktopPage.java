package com.tricentis.demo.pages;

import com.tricentis.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DesktopPage extends Utility {

    By selectOption = By.xpath("//select[@id='products-orderby']");
    By product=By.xpath("//h2[@class='product-title']/a");
    By addToCart= By.xpath("//div[@class='page-body']//div[2]//div[1]//div[2]//div[3]//div[2]//input[1]");
    /**
     * This method will sort option Z to A
     */
    public void sortByOption(String option){
        selectByVisibleTextFromDropDown(selectOption,option);
    }

    /**
     * This method will get list of product name
     */
    public List<String> getListOfProductNames(){
        List<WebElement> productNames =findElements(product);
        List<String> names = new ArrayList<>();
        for (WebElement element:productNames){
            names.add(element.getText());
        }

        return names;
    }

    /**
     * This method will click on Add To Cart Button
     */
    public void clickOnAddToCard(){
        clickOnElement(addToCart);
    }

}
