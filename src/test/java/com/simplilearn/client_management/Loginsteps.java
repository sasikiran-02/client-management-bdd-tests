package com.simplilearn.client_management;

import io.cucumber.java.en.*;

public class Loginsteps {

    @Given("I am on the Login page")
    public void i_am_on_the_login_page() {
        System.out.println("Navigating to the Login page.");
    }

    @When("I enter {string} in the Login {string} field")
    public void i_enter_in_the_field(String value, String fieldName) {
        System.out.println("Entering \"" + value + "\" in the " + fieldName + " field.");
    }

    @When("I click the Login button is enabled")
    public void i_click_the_login_button_is_enabled() {
        System.out.println("Clicking the Login button.");
    }

    @Then("I should be navigated to Dashboard")
    public void naviagte_to_dashboard() {
        System.out.println("Navigating to Dashboard");
    }
    
    @Then("I should see a error {string}")
    public void i_should_see_a_error(String message) {
        System.out.println(message+" displayed");
    }
    
    

    @Then("the Login button should be disabled")
    public void the_login_button_should_be_disabled() {
        System.out.println("The Login button is disabled.");
    }
}
