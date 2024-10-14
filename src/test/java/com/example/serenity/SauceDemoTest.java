package com.example.serenity;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import java.util.*;

@DefaultUrl("https://www.saucedemo.com/")
public class SauceDemoTest extends PageObject {

    // Locating the web elements on the Sauce Demo login page
    @FindBy(id = "user-name")
    private WebElementFacade usernameField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(id = "login-button")
    private WebElementFacade loginButton;

    @FindBy(css = ".inventory_item .btn_inventory")
    private List<WebElementFacade> addToCartButtons;

    @FindBy(id = "shopping_cart_container")
    private WebElementFacade shoppingCartIcon;

    @FindBy(id = "checkout")
    private WebElementFacade checkoutButton;


    @FindBy(id = "first-name")
    private WebElementFacade firstNameField;

    @FindBy(id = "last-name")
    private WebElementFacade lastNameField;

    @FindBy(id = "postal-code")
    private WebElementFacade postalCodeField;


    @FindBy(id = "continue")
    private WebElementFacade continueButton;


    @FindBy(id = "finish")
    private WebElementFacade finishButton;


    public void enterUsername(String username) {
        usernameField.type(username);
    }

    public void enterPassword(String password) {
        passwordField.type(password);
    }

    public void clickLogin() {
        loginButton.click();
    }


    public void addTwoItemsToCart() {
        if (addToCartButtons.size() >= 2) {
            addToCartButtons.get(0).click();
            addToCartButtons.get(1).click();
        }
    }
    public void openCart() {
        shoppingCartIcon.click();
    }
    public void proceedToCheckout() {
        checkoutButton.click();
    }

    public void fillCheckoutForm(String firstName, String lastName, String postalCode) {
        firstNameField.type(firstName);
        lastNameField.type(lastName);
        postalCodeField.type(postalCode);
    }


    public void clickContinue() {
        continueButton.click();
    }


    public void clickFinish() {
        finishButton.click();
    }

}
