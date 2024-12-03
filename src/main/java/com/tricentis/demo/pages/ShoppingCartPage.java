package com.tricentis.demo.pages;

import com.tricentis.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By shoppingCartText = By.xpath("//h1[normalize-space()='Shopping cart']");
    By changeQty = By.xpath("//td[@class='qty nobr']/input");
    By updateCartButton = By.xpath("//input[@name='updatecart']");
    By totalPrice = By.xpath("//span[@class='product-subtotal']");
    By termsCheckBox = By.id("termsofservice");
    By checkoutButton = By.id("checkout");
    By registerTab=By.xpath("//input[@value='Register']");

    /**
     * This method will get the Shopping Cart Text
     */
    public String getShoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }

    /**
     * This method will get the price
     */
    public String getProductPrice() {
        return getTextFromElement(totalPrice);
    }

    /**
     * This method will Change Qty
     */
    public void changeProductQty(String qty) {
        sendTextToElement(changeQty, qty);
    }

    /**
     * This method will click on update Button
     */
    public void clickOnUpdateButton() {
        clickOnElement(updateCartButton);
    }

    /**
     * This method will click on terms and conditions checkbox
     */
    public void clickOnTermsAndConditionsCheckbox() {
        clickOnElement(termsCheckBox);
    }

    /**
     * This method will click on Checkout Button
     */
    public void clickOnCheckoutButton() {
        clickOnElement(checkoutButton);
    }
    /**
     * This method will click on register tab
     */
    public void clickOnRegisterTab(){
        clickOnElement(registerTab);
    }

}
