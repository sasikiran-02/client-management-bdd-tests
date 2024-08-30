package com.simplilearn.client_management;

import io.cucumber.java.en.*;

public class ClientCreationSteps {

    @Given("I am on the Create Client page")
    public void i_am_on_the_create_client_page() {
        System.out.println("Navigating to the Create Client page.");
    }

    @When("I enter {string} in the {string} field")
    public void i_enter_in_the_field(String value, String fieldName) {
        System.out.println("Entering \"" + value + "\" in the " + fieldName + " field.");
    }

    @When("I click the Register button is enabled")
    public void i_click_the_register_button_is_enabled() {
        System.out.println("Clicking the Register button.");
    }
    
    @Then("I should see a message {string}")
    public void i_should_see_a_error(String message) {
        System.out.println(message+" displayed");
    }
    

    @Then("the Register button should be disabled")
    public void the_register_button_should_be_disabled() {
        System.out.println("the Register button is disabled.");
    }
}
