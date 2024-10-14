package com.example.serenity;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.JUnit5TestClassAnnotations;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.junit5.JUnit5TestMethodAnnotations;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)  // For Serenity JUnit integration

public class LoginTest {

    @Steps
    SauceDemoTest sauceDemoPage;

    @Test
    public void shouldLoginSuccessfullyWithValidCredentials() {

        sauceDemoPage.openUrl("https://www.saucedemo.com/");


        sauceDemoPage.enterUsername("standard_user");
        sauceDemoPage.enterPassword("secret_sauce");


        sauceDemoPage.clickLogin();

        assertThat(sauceDemoPage.containsElements(".inventory_list"))
                .as("Verify that we are on the inventory page after login")
                .isTrue();

        sauceDemoPage.addTwoItemsToCart();

        assertThat(sauceDemoPage.containsElements(".shopping_cart_badge"))
                .as("Verify that items have been added to the cart")
                .isTrue();

        sauceDemoPage.openCart();

        assertThat(sauceDemoPage.containsElements("#checkout"))
                .as("Verify that we are on the cart page")
                .isTrue();

        sauceDemoPage.proceedToCheckout();

        assertThat(sauceDemoPage.containsElements(".checkout_info"))
                .as("Verify that we are on the checkout page")
                .isTrue();


        sauceDemoPage.fillCheckoutForm("Richard", "Martinez", "12345");


        sauceDemoPage.clickContinue();


        assertThat(sauceDemoPage.containsElements("#finish"))
                .as("Verify that we are on the overview page")
                .isTrue();


        sauceDemoPage.clickFinish();


        assertThat(sauceDemoPage.containsElements(".complete-header"))
                .as("Verify that the order is complete")
                .isTrue();
    }

}
