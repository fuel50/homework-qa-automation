package com.fuel50.test.bdd;

import io.cucumber.java.en.*;

public class AutomationExampleStepDefs {

    @Given("I'm a user called {string}")
    public void iMAUserCalled(String username) {
    }

    @And("I'm using {string} as a password")
    public void iMUsingAsAPassword(String password) {
    }

    @When("I open the login form and type my credentials")
    public void iOpenTheLoginFormAndTypeMyCredentials() {
    }

    @Then("I should be successfully logged in")
    public void iShouldBeSuccessfullyLoggedIn() {
    }

    @Then("the website shows me an error saying {string}")
    public void theWebsiteShowsMeAnErrorSaying(String errorMessage) {
    }
}
