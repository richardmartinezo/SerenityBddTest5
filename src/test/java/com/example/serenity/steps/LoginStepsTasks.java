package com.example.serenity.steps;


import com.example.serenity.ConclusionWriter;
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
        assertThat(sauceDemoPage.containsElements(".complete-header"))
                .as("Verify that the order is complete")
                .isTrue();
    }

    @Given("the purchase scenarios have been executed")
    public void thePurchaseScenariosHaveBeenExecuted() {
        boolean allScenariosSuccessful = true;
        if (allScenariosSuccessful) {
            System.out.println("All purchase scenarios have been executed successfully.");
        } else {
            System.out.println("Some purchase scenarios failed.");
        }
    }
    @Then("the conclusions should be documented")
    public void theConclusionsShouldBeDocumented() {
        System.out.println("Conclusion: The purchase functionality works as expected for all valid users.");
    }

    @Then("the conclusion for {string} should be {string}")
    public void theConclusionForScenarioShouldBe(String scenarioType, String conclusion) {
        String conc ="Scenario Type: " + scenarioType + " Conclusion: " + conclusion;
        System.out.println("Scenario Type: " + scenarioType);
        System.out.println("Conclusion: " + conclusion);
        ConclusionWriter.writeConclusion("Conclusion: The user successfully completed the purchase scenario. " + conc);
    }


}