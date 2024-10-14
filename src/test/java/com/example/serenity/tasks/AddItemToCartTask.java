package com.example.serenity.tasks;

import com.example.serenity.SauceDemoTest;
import net.thucydides.core.steps.ScenarioSteps;

public class AddItemToCartTask extends ScenarioSteps {

    private final SauceDemoTest sauceDemoTest;

    public AddItemToCartTask(SauceDemoTest sauceDemoTest) {
        this.sauceDemoTest = sauceDemoTest;
    }

    public void execute(int numberOfItems) {
        for (int i = 0; i < numberOfItems; i++) {
            sauceDemoTest.addItemToCart(i); // This now works with the newly added method
        }
    }
}