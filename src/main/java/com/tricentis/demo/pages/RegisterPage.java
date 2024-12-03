package com.tricentis.demo.pages;

import com.tricentis.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By registerText=By.xpath("//h1[normalize-space()='Register']");
    By maleRadioButton=By.xpath("//input[@id='gender-male']");
    By firstName=By.xpath("//input[@id='FirstName']");
    By lastName=By.xpath("//input[@id='LastName']");
    By emailAddress=By.xpath("//input[@id='Email']");
    By password=By.xpath("//input[@id='Password']");
    By confirmPassword=By.xpath("//input[@id='ConfirmPassword']");
    By registerButton=By.xpath("//input[@id='register-button']");
    By registerContinueButton=By.xpath("//input[@value='Continue']");

    /**
     * This method will get register text
     */
    public String getRegisterText(){
        return getTextFromElement(registerText);
    }
    /**
     * This method will click on male radio button
     */
    public void clickOnMaleRadioButton(){
        clickOnElement(maleRadioButton);
    }
    /**
     * This method will click on register button
     */
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    /**
     * This method will click continue button
     */
    public void clickOnContinueButton(){
        clickOnElement(registerContinueButton);
    }
    /**
     * This method will enter first name
     */
    public void enterFirstName(String fName){
        sendTextToElement(firstName,fName);
    }
    /**
     * This method will enter last name
     */
    public void enterLastName(String lName){
        sendTextToElement(lastName,lName);
    }
    /**
     * This method will enter first name
     */
    public void enterEmailAddress(String email){
        sendTextToElement(emailAddress,email);
    }
    /**
     * This method will enter password
     */
    public void enterPassword(String pass){
        sendTextToElement(password,pass);
    }
    /**
     * This method will enter confirm password
     */
    public void enterConfirmPassword(String cPass){
        sendTextToElement(confirmPassword,cPass);
    }

}
