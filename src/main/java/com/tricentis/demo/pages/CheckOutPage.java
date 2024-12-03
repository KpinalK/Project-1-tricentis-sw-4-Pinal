package com.tricentis.demo.pages;

import com.tricentis.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {

    By welcomeText = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By guest = By.xpath("//input[@value='Checkout as Guest']");
    By fName = By.id("BillingNewAddress_FirstName");
    By lName = By.id("BillingNewAddress_LastName");
    By email = By.id("BillingNewAddress_Email");
    By country = By.id("BillingNewAddress_CountryId");
    By city = By.id("BillingNewAddress_City");
    By address = By.id("BillingNewAddress_Address1");
    By postcode = By.id("BillingNewAddress_ZipPostalCode");
    By number = By.id("BillingNewAddress_PhoneNumber");
    By continueDetailButton = By.xpath("//input[@onclick='Billing.save()']");
    By continueButton=By.xpath("//input[@onclick='Shipping.save()']");
    By nextDayRadioButton=By.xpath("//li[@id='opc-shipping_method']//li[2]//div[1]/input");
    By continueButtonAfter=By.xpath("//div[@id='shipping-method-buttons-container']/input");
    By creditCardButton=By.xpath("//body[1]/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/form[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/div[2]/input");
    By continueButtonAfterCreditCard=By.xpath("//div[@id='payment-method-buttons-container']/input");
    By selectCardType=By.xpath("//select[@id='CreditCardType']");
    By cardholderName=By.xpath("//input[@id='CardholderName']");
    By cardNumber=By.xpath("//input[@id='CardNumber']");
    By selectMonth=By.xpath("//select[@id='ExpireMonth']");
    By selectYear=By.xpath("//select[@id='ExpireYear']");
    By cardCode=By.xpath("//input[@id='CardCode']");
    By continueAfterPayment=By.xpath("//div[@id='payment-info-buttons-container']/input");
    By paymentMethodText=By.xpath("//li[@class='payment-method']");
    By shippingMethodText=By.xpath("//li[@class='shipping-method']");
    By totalText=By.xpath("//span[@class='product-subtotal']");
    By confirmButton=By.xpath("//input[@value='Confirm']");
    By thankMessage=By.xpath("//h1[normalize-space()='Thank you']");
    By orderProcessed=By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By continueButtonAfterPayment=By.xpath("//input[@value='Continue']");
    By dayAirRadioButton=By.xpath("//li[@id='opc-shipping_method']//li[3]//div[1]/input");



    /**
     * This method will get welcome text
     */
    public String getCheckoutWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    /**
     * This method will click on guest tab
     */
    public void clickONGuestTab() {
        clickOnElement(guest);
    }

    /**
     * This method will enter first name
     */
    public void enterFirstName(String fname) {
        sendTextToElement(fName, fname);
    }

    /**
     * This method will enter last name
     */
    public void enterLastName(String lname) {
        sendTextToElement(lName, lname);
    }

    /**
     * This method will enter email
     */
    public void enterEmail(String emailAdd) {
        sendTextToElement(email, emailAdd);
    }

    /**
     * This method will select country name
     */
    public void selectCountryName(String option) {
        selectByVisibleTextFromDropDown(country, option);
    }

    /**
     * This method will enter city name
     */
    public void enterCityName(String cityName) {
        sendTextToElement(city, cityName);
    }

    /**
     * This method will enter Address
     */
    public void enterAddress(String add) {
        sendTextToElement(address, add);
    }

    /**
     * This method will enter postcode
     */
    public void enterPostcode(String code) {
        sendTextToElement(postcode, code);
    }

    /**
     * This method will enter phone number
     */
    public void enterPhoneNumber(String phoneNo) {
        sendTextToElement(number, phoneNo);
    }

    /**
     * This method will click on continue button
     */
    public void clickOnContinueDetailButton() {
        clickOnElement(continueDetailButton);
    }
    /**
     * This method will click on Shipping Address continue button
     */
    public void clickOnShippingAddressContinueButton() {
        clickOnElement(continueButton);
    }
    /**
     * This method will click on NextDay Radio Bitton
     */
    public void clickOnNextDayRadioButton() {
        clickOnElement(nextDayRadioButton);
    }
    /**
     * This method will click on continue button
     */
    public void clickOnShippingMethodContinueButton() {
        clickOnElement(continueButtonAfter);
    }
    /**
     * This method will select Radio button credit card
     */
    public void selectCreditCardRadioButton() {
        clickOnElement(creditCardButton);
    }
    /**
     * This method will click on credit card continue button
     */
    public void clickOnCreditCardContinueButton() {
        clickOnElement(continueButtonAfterCreditCard);
    }
    /**
     * This method will select master card
     */
    public void selectMasterCardOption(String option) {
        selectByVisibleTextFromDropDown(selectCardType,option);
    }
    /**
     * This method will enter card holder name
     */
    public void enterCardHolderName(String name) {
        sendTextToElement(cardholderName,name);
    }
    /**
     * This method will enter card number
     */
    public void enterCreditCardNumber(String number) {
        sendTextToElement(cardNumber,number);
    }
    /**
     * This method will select Expiring month
     */
    public void selectExpireMonth(String option ) {
        selectByVisibleTextFromDropDown(selectMonth,option);
    }
    /**
     * This method will select Expiring year
     */
    public void selectExpireYear(String option ) {
        selectByVisibleTextFromDropDown(selectYear,option);
    }
    /**
     * This method will enter credit card code
     */
    public void enterCreditCardCode(String code) {
        sendTextToElement(cardCode,code);
    }
    /**
     * This method will click on continue after payment continue button
     */
    public void clickOnContinueButtonAfterPaymentDetails() {
        clickOnElement(continueAfterPayment);
    }
    /**
     * This method will get Payment method text
     */
    public String getPaymentMethodText() {
        return getTextFromElement(paymentMethodText);
    }
    /**
     * This method will get shipping method text
     */
    public String getShippingMethodText() {
        return getTextFromElement(shippingMethodText);
    }
    /**
     * This method will get total price
     */
    public String getTotalPrice() {
        return getTextFromElement(totalText);
    }
    /**
     * This method will click on confirm button
     */
    public void clickOnConfirmButton() {
        clickOnElement(confirmButton);
    }

    /**
     * This method will get thank you text
     */
    public String getThankYouText() {
        return getTextFromElement(thankMessage);
    }
    /**
     * This method will get order successfully message
     */
    public String getOrderSuccessfulMessage() {
        return getTextFromElement(orderProcessed);
    }
    /**
     * This method will click on order continue button
     */
    public void clickOnOrderContinueButton() {
        clickOnElement(continueButtonAfterPayment);
    }
    /**
     * This method will click on 2nd Day Air ($0.00) radio button
     */
    public void clickOnSecondDayAirRadioButton() {
        clickOnElement(dayAirRadioButton);
    }
}
