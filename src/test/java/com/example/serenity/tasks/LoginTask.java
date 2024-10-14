package com.example.serenity.tasks;

import com.example.serenity.Actor;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginTask extends ScenarioSteps {

    private final Actor actor;

    public LoginTask(Actor actor) {
        this.actor = actor;
    }

    public void execute(String username, String password) {
        actor.login(username, password);
    }
}