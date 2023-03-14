package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogIn {

    @Given("figs")
    public void figs() {
        System.out.println("it is from given");
    }

    @When("fsdgg")
    public void fsdgg() {
        System.out.println("it is from when");
    }

    @Then("freqheth")
    public void freqheth() {
        System.out.println("it is from then");
    }
}
