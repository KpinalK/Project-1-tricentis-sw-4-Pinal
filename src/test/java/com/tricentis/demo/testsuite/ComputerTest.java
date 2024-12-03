package com.tricentis.demo.testsuite;

import com.tricentis.demo.pages.*;
import com.tricentis.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class ComputerTest extends BaseTest {

    //Create object for various classes
    MenuPage menuPage = new MenuPage();
    ComputerPage computerPage = new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    ProductDescriptionPage productDescriptionPage = new ProductDescriptionPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkoutPage = new CheckOutPage();
    HomePage homePage = new HomePage();

    /*===============================================================*/
    public void verifyText(String actualText, String expectedText, String message) {
        Assert.assertEquals(actualText, expectedText, message);
    }

    public void verifyText(List<String> actualText, List<String> expectedText, String message) {
        Assert.assertEquals(actualText, expectedText, message);
    }
    /*===============================================================*/


    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {

        //1.1 Click on the COMPUTERS Menu.
        menuPage.clickOnComputerMenu();

        //1.2 Click on Desktop
        computerPage.clickOnDesktop();

        //Get products names before sorting
        List<String> productNameBefore = desktopPage.getListOfProductNames();
        Collections.sort(productNameBefore, Collections.reverseOrder());

        //1.3 Select Sort By position "Name: Z to A"
        desktopPage.sortByOption("Name: Z to A");

        //1.4 Verify the Product will be arranged in Descending order.
        List<String> productNameAfter = desktopPage.getListOfProductNames();
        verifyText(productNameAfter, productNameBefore, "Products are not arranged in descending order");

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessfully() {
        //2.1 Click on the COMPUTERS Menu.
        menuPage.clickOnComputerMenu();

        //2.2 Click on the Desktop
        computerPage.clickOnDesktop();

        //2.3 Select Sort By option "Name: A to Z"
        desktopPage.sortByOption("Name: A to Z");

        //2.4 Click on the "Add To Cart" button of the product name ‘Build your own computer’
        desktopPage.clickOnAddToCard();


        //2.5 Verify the Text "Build your own computer"
        String expectedComputerName = "Build your own computer";
        String actualComputerName = productDescriptionPage.getProductName();
        verifyText(actualComputerName, expectedComputerName, "Build your own computer not displayed");

        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using the Select class
        productDescriptionPage.selectProcessorType("2.2 GHz Intel Pentium Dual-Core E2200");

        //2.7.Select "8GB [+$60.00]" using the Select class.
        productDescriptionPage.selectRAMType("8GB [+60.00]");

        //2.8 Select HDD radio button "400 GB [+$100.00]"
        productDescriptionPage.clickOnHDDRadioButton();

        //2.9 Select the OS radio button "Windows 10 [+$60.00]"
        productDescriptionPage.clickOnOsRadioButton();

        //2.10 Check Two Checkboxes "Microsoft Office [+$50.00]" and "Total Commander  //[+$5.00]"
        productDescriptionPage.clickOnCommanderCheckBox();

        //2.11 Verify the price "1200.00"
        String actualProductPrice = productDescriptionPage.getProductPrice();
        String expectedProductPrice = "1200.00";
        verifyText(actualProductPrice, expectedProductPrice, "The price 1200 is not displayed");

        //2.12 Click on the "Add to card" Button.
        productDescriptionPage.clickOnAddToCartButton();

        //2.13 Verify the Message "The product has been added to your shopping cart" on the Top green Bar
        String actualShoppingCartMessage = productDescriptionPage.getShoppingCartMessage();
        String expectedShoppingCartMessage = "The product has been added to your shopping cart";
        verifyText(actualShoppingCartMessage, expectedShoppingCartMessage, "The Message The product has been added to your shopping cart is not displayed");

        //2.14 After that close the bar by clicking on the cross button.
        productDescriptionPage.clickOnCloseShoppingCartMessage();

        //2.15 Then MouseHover on "Shopping cart" and click on the "Go to cart" button.
        productDescriptionPage.mouseHoverAndClickOnShoppingCart();

        //2.16 Verify the message "Shopping cart"
        String actualShoppingCartText = shoppingCartPage.getShoppingCartText();
        String expectedShoppingCartText = "Shopping cart";
        verifyText(actualShoppingCartText, expectedShoppingCartText, "The message shopping cart is not displayed");


        //2.17 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCartPage.changeProductQty("2");
        shoppingCartPage.clickOnUpdateButton();

        //2.18 Verify the Total "2,950.00"
        String actualTotal = shoppingCartPage.getProductPrice();
        String expectedTotal = "2950.00";
        verifyText(actualTotal, expectedTotal, "The Total 2950.00 is not displayed");

        //2.19 click on the checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTermsAndConditionsCheckbox();

        //2.20 Click on “Checkout”
        shoppingCartPage.clickOnCheckoutButton();

        //2.21 Verify the Text “Welcome, Please Sign In!”
        String actualWelcomeText = checkoutPage.getCheckoutWelcomeText();
        String expectedWelcomeText = "Welcome, Please Sign In!";
        verifyText(actualWelcomeText, expectedWelcomeText, "The text Welcome Please sign In is not displayed");

        //2.22 Click on the “Checkout as Guest” Tab
        checkoutPage.clickONGuestTab();

        //2.23 Enter the First name
        checkoutPage.enterFirstName("Pinal");

        //2.24 Enter the Last name
        checkoutPage.enterLastName("Kamani");

        //2.25 Enter the email
        checkoutPage.enterEmail("Pinal2525@gmail.xcom");

        //2.26 Select the Country “United Kingdom” using the select class
        checkoutPage.selectCountryName("United Kingdom");

        //2.27 Enter the city
        checkoutPage.enterCityName("Derby");

        //2.28 Enter the Address1
        checkoutPage.enterAddress("vellyStreet");

        //2.29 Enter the Zip/Postal code
        checkoutPage.enterPostcode("D233SH");

        //2.30 Enter the Phone number
        checkoutPage.enterPhoneNumber("2528956432");

        //2.31 Click on the “Continue” button
        checkoutPage.clickOnContinueDetailButton();

        //2.32 Click on the “Continue” button
        checkoutPage.clickOnShippingAddressContinueButton();

        //2.33 Click on the Radio Button “Next Day Air($0.00)”
        checkoutPage.clickOnNextDayRadioButton();

        //2.34 Click on the “Continue” button
        checkoutPage.clickOnShippingMethodContinueButton();

        //2.35 Select the Radio Button “Credit Card”
        checkoutPage.selectCreditCardRadioButton();

        //2.36 Click on the “Continue” button
        checkoutPage.clickOnCreditCardContinueButton();

        //2.37 Select “Master card” From the Select credit card dropdown using the Select class
        checkoutPage.selectMasterCardOption("Master card");

        //2.38 Enter the Cardholder's name
        checkoutPage.enterCardHolderName("Pinal");

        //2.39 Enter the Card number
        checkoutPage.enterCreditCardNumber("5420623654376573");

        //2.40 Select the Expiration date using the select class
        checkoutPage.selectExpireMonth("06");
        checkoutPage.selectExpireYear("2026");

        //2.41 Enter the Card code
        checkoutPage.enterCreditCardCode("568");

        //2.42 Click on the “Continue” button
        checkoutPage.clickOnContinueButtonAfterPaymentDetails();

        //2.43 Verify “Payment Method” is “Credit Card”
        String actualPaymentMethod = checkoutPage.getPaymentMethodText();
        String expectedPaymentMethod = "Credit Card";
        verifyText(actualPaymentMethod, expectedPaymentMethod, "The Payment Method is not credit card");

        //2.44 Verify “Shipping Method” is “Next Day Air”
        String actualShippingMethod = checkoutPage.getShippingMethodText();
        String expectedShippingMethod = "Next Day Air";
        verifyText(actualShippingMethod, expectedShippingMethod, "The Shipping Method is next day air is not displayed");

        //2.45 Verify Total is “2,950.00”
        String actualTotalPrice = checkoutPage.getTotalPrice();
        String expectedTotalPrice = "2950.00";
        verifyText(actualTotalPrice, expectedTotalPrice, "The Price is not displayed");

        //2.46 Click on the “Confirm” button
        checkoutPage.clickOnConfirmButton();

        //2.47 Verify the Text “Thank You”
        String actualThankYou = checkoutPage.getThankYouText();
        String expectedThankYou = "Thank you";
        verifyText(actualThankYou, expectedThankYou, "The text thank you is not displayed ");

        //2.48 Verify the message “Your order has been successfully processed!”
        String actualSuccess = checkoutPage.getOrderSuccessfulMessage();
        String expectedSuccess = "Your order has been successfully processed!";
        verifyText(actualSuccess, expectedSuccess, "The successful  message is not displayed ");

        //2.49 Click on the “Continue” button
        checkoutPage.clickOnOrderContinueButton();

        //2.50 Verify the text “Welcome to our store”
        String actualWelcomeMessage = homePage.getWelcomeMessage();
        String expectedWelcomeMessage = "Welcome to our store";
        verifyText(actualWelcomeMessage, expectedWelcomeMessage, "The Welcome message is not displayed ");
    }



}
