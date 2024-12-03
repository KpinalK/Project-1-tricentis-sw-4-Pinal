package com.tricentis.demo.pages;

import com.tricentis.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ProductDescriptionPage extends Utility {

    By computerName = By.cssSelector("h1[itemprop='name']");
    By processorSelector = RelativeLocator.with(By.tagName("select")).above(By.xpath("//label[normalize-space()='RAM']"));
    By selectRAM = RelativeLocator.with(By.tagName("select")).below(By.xpath("//label[normalize-space()='RAM']"));
    By hddradioButton = RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath("//label[contains(text(),'400 GB')]"));
    By osRadioButton = RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath("//label[contains(text(),'Windows 10')]"));
    By totalCommander = RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath("//label[contains(text(),'Total Commander')]"));
    By productPrice = By.xpath("//div[@class='product-price']/span");
    By addToCart = By.xpath("//div[@class='add-to-cart-panel']/input[2]");
    By shoppingCartMessage = By.xpath("//p[@class='content']");
    By closeButton = By.xpath("//span[@title='Close']");
    By goToCart = By.xpath("//span[normalize-space()='Shopping cart']");
    By productQty = RelativeLocator.with(By.tagName("input")).toRightOf(By.xpath("//label[normalize-space()='Qty:']"));

    /**
     * This method will get product name
     */

    public String getProductName() {
        return getTextFromElement(computerName);
    }

    /**
     * This method will get price
     */
    public String getProductPrice() {
        return getTextFromElement(productPrice);
    }

    /**
     * This method will select processor
     */
    public void selectProcessorType(String option) {
        selectByVisibleTextFromDropDown(processorSelector, option);
    }

    /**
     * This method will select RAM
     */
    public void selectRAMType(String option) {
        selectByVisibleTextFromDropDown(selectRAM, option);
    }

    /**
     * This method will click on HDD Radio Button
     */
    public void clickOnHDDRadioButton() {
        clickOnElement(hddradioButton);
    }

    /**
     * This method will Click on OS Radio Button
     */
    public void clickOnOsRadioButton() {
        clickOnElement(osRadioButton);
    }

    /**
     * This method will Click Commander Checkbox
     */
    public void clickOnCommanderCheckBox() {
        clickOnElement(totalCommander);
    }

    /**
     * This method will Click on Add To Cart Button
     */
    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);
    }

    /**
     * This method will Click Close Button
     */
    public void clickOnCloseShoppingCartMessage() {
        clickOnElement(closeButton);
    }

    /**
     * This method will MouseHover and Click on "Shopping cart" and click on the "Go to cart" button.
     */
    public void mouseHoverAndClickOnShoppingCart() {
        mouseHoverToElementAndClick(goToCart);
    }

    /**
     * This method will get the Shopping Cart Message
     */
    public String getShoppingCartMessage() {
        return getTextFromElement(shoppingCartMessage);
    }

    /**
     * This method will change the product qty
     */
    public void updateProductQty(String qty) {
        sendTextToElement(productQty, qty);
    }

}
