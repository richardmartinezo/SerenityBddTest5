package com.example.serenity;


import net.thucydides.core.steps.ScenarioSteps;

public class Actor extends ScenarioSteps {
    public void login(String username, String password) {
        // Perform login actions using the SauceDemoTest page object
        SauceDemoTest sauceDemoTest = new SauceDemoTest();
        sauceDemoTest.openUrl("https://www.saucedemo.com/");
        sauceDemoTest.enterUsername(username);
        sauceDemoTest.enterPassword(password);
        sauceDemoTest.clickLogin();
    }

    public void addItemToCart(int numberOfItems) {
        SauceDemoTest sauceDemoTest = new SauceDemoTest();
        for (int i = 0; i < numberOfItems; i++) {
            sauceDemoTest.addItemToCart(i); // Assuming you have a method for this
        }
    }

    public void proceedToCheckout(String firstName, String lastName, String zipCode) {
        SauceDemoTest sauceDemoTest = new SauceDemoTest();
        sauceDemoTest.openCart();
        sauceDemoTest.proceedToCheckout();
        sauceDemoTest.fillCheckoutForm(firstName, lastName, zipCode);
        sauceDemoTest.clickContinue();
        sauceDemoTest.clickFinish();
    }
}