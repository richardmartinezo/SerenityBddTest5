package com.example.serenity.steps;


import com.example.serenity.SauceDemoTest;
import com.example.serenity.tasks.LoginTask;
import com.example.serenity.tasks.AddItemToCartTask;
import com.example.serenity.tasks.CheckoutTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginStepsTasks extends ScenarioSteps {

    @Steps
    LoginTask loginTask;

    @Steps
    AddItemToCartTask addItemToCartTask;

    @Steps
    CheckoutTask checkoutTask;

    private SauceDemoTest sauceDemoPage;

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        // No longer needed, as it's now in the login task
    }

    @When("the user enters credentials {string} and {string}")
    public void theUserEntersCredentials(String username, String password) {
        loginTask.execute(username, password);
    }

    @When("the user adds two items to the cart")
    public void theUserAddsTwoItemsToTheCart() {
        addItemToCartTask.execute(2);
    }

    @When("the user proceeds to checkout")
    public void theUserProceedsToCheckout() {
        checkoutTask.execute("John", "Doe", "12345");
    }

    @Then("the user should complete the purchase successfully")
    public void theUserShouldCompleteThePurchaseSuccessfully() {
        // Optionally verify that the order is complete
        assertThat(sauceDemoPage.containsElements(".complete-header"))
                .as("Verify that the order is complete")
                .isTrue();
    }
}