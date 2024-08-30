#Author: sasikirandoradla6694@gmail.com
#Date: Aug.29th,2024
#Description: This feature is to validate the registering a user flow
#keywords: email,password,repeat password, register

Feature: Client Registration

  Background:
    Given I am on the Create Client page

  Scenario: Register a new client successfully
    When I enter "John Doe" in the "Full Name" field
    And I enter "john.doe@example.com" in the "Email" field
    And I enter "123 Elm Street" in the "Address" field
    And I enter "securepassword123" in the "Password" field
    And I enter "securepassword123" in the "Repeat Password" field
    And I click the Register button is enabled
    Then I should see a message "Client created successfully"
    
  Scenario: Register a client with missing fields
    When I enter "" in the "Full Name" field
    And I enter "john.doe@example.com" in the "Email" field
    And I enter "" in the "Address" field
    And I enter "" in the "Password" field
    And I enter "" in the "Repeat Password" field
    And I should see a message "Full Name is required"
    And I should see a message "Address is required"
    And I should see a message "Password is required"
    And I should see a message "Repeat Password is required and mismatched"
    Then the Register button should be disabled
    
 
