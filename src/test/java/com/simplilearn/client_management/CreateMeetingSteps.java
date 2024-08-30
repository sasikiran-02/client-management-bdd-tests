package com.simplilearn.client_management;

import io.cucumber.java.en.*;

public class CreateMeetingSteps {

    @Given("I am on the Create Meeting Schedule page")
    public void i_am_on_the_create_meeting_schedule_page() {
        System.out.println("Navigating to the Create Meeting Schedule page.");
    }

    @When("I enter {string} in the {string} field of schedule form")
    public void i_enter_in_the_field(String value, String fieldName) {
        System.out.println("Entering \"" + value + "\" in the " + fieldName + " field.");
    }

    @When("I click the Create button")
    public void i_click_the_create_button() {
        System.out.println("Clicking the Create button.");
    }

    @Then("I should see a notification {string}")
    public void i_should_see_a_notification(String notification) {
        System.out.println(notification + " displayed.");
    }

    @Then("I should see a highlight {string}")
    public void i_should_see_a_highlight(String highlight) {
        System.out.println(highlight + " highlighted.");
    }

    @Then("the Create button should be disabled")
    public void the_create_button_should_be_disabled() {
        System.out.println("The Create button is disabled.");
    }
}