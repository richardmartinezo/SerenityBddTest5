package com.example.serenity.tasks;

import com.example.serenity.Actor;
import net.thucydides.core.steps.ScenarioSteps;

public class CheckoutTask extends ScenarioSteps {

    private final Actor actor;

    public CheckoutTask(Actor actor) {
        this.actor = actor;
    }

    public void execute(String firstName, String lastName, String zipCode) {
        actor.proceedToCheckout(firstName, lastName, zipCode);
    }
}