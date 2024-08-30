#Author: sasikirandoradla6694@gmail.com
#Date: Aug.29th,2024
#Description: This feature is to validate the login flow
#keywords: login,email,password



Feature: User Login

  Background:
    Given I am on the Login page

  Scenario: Login with valid credentials
    When I enter "john.doe@example.com" in the Login "Email" field
    And I enter "securepassword123" in the Login "Password" field
    And I click the Login button is enabled
    Then I should be navigated to Dashboard

  Scenario: Login with missing fields
    When I enter "" in the Login "Email" field
    And I enter "" in the Login "Password" field
    And I should see a error "Email is required"
    And I should see a error "Password is required"
    Then the Login button should be disabled


