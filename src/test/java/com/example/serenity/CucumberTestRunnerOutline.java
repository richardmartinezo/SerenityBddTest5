package com.example.serenity;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.platform.engine.Cucumber;

@Cucumber
@CucumberOptions(features = "src/test/resources/features/purchase.feature")
public class CucumberTestRunnerOutline {
}
