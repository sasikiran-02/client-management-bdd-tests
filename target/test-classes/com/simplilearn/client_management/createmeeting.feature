#Author: sasikirandoradla6694@gmail.com
#Date: Aug.29th,2024
#Description: This feature is to validate the create meeting flow
#keywords: login,email,password

Feature: Create a Meeting Schedule

  Background:
    Given I am on the Create Meeting Schedule page

  Scenario: Successfully create a meeting schedule
    When I enter "Project Planning" in the "Meeting Topic" field of schedule form
    And I enter "10" in the "Number of people" field of schedule form
    And I enter "Discuss project timelines and deliverables" in the "Summary" field of schedule form
    And I enter "09/15/2024, 10:00 AM" in the "Due Date" field of schedule form
    And I click the Create button
    Then I should see a notification "Meeting scheduled successfully"

  Scenario: Attempt to create a meeting schedule with missing fields
    When I enter "" in the "Meeting Topic" field of schedule form
    And I enter "" in the "Number of people" field of schedule form
    And I enter "" in the "Summary" field of schedule form
    And I enter "" in the "Due Date" field of schedule form
    Then I should see a highlight "Meeting Topic is required"
    And I should see a highlight "Number of people is required"
    And I should see a highlight "Summary is required"
    And I should see a highlight "Due Date is required"
    And the Create button should be disabled