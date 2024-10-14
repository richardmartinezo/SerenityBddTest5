package com.example.serenity.steps;

import com.example.serenity.SauceDemoTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginSteps extends ScenarioSteps {

    @Steps
    SauceDemoTest sauceDemoPage;

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        sauceDemoPage.openUrl("https://www.saucedemo.com/");
    }

    @When("the user enters valid credentials")
    public void theUserEntersValidCredentials() {
        sauceDemoPage.enterUsername("standard_user");
        sauceDemoPage.enterPassword("secret_sauce");
        sauceDemoPage.clickLogin();
    }

    @When("the user adds two items to the cart")
    public void theUserAddsTwoItemsToTheCart() {
        sauceDemoPage.addTwoItemsToCart();
    }

    @When("the user proceeds to checkout")
    public void theUserProceedsToCheckout() {
        sauceDemoPage.openCart();
        sauceDemoPage.proceedToCheckout();
    }

    @When("the user fills in the checkout form with valid details")
    public void theUserFillsInTheCheckoutFormWithValidDetails() {
        sauceDemoPage.fillCheckoutForm("John", "Doe", "12345");
        sauceDemoPage.clickContinue();
        sauceDemoPage.clickFinish();
    }

    @Then("the user should complete the purchase successfully")
    public void theUserShouldCompleteThePurchaseSuccessfully() {

        assertThat(sauceDemoPage.containsElements(".complete-header"))
                .as("Verify that the order is complete")
                .isTrue();
    }
}