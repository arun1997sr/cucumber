#Author: Arun.arunsr@your.domain.com
Feature: Add customer flow validation
  

  @tag1
  Scenario: Add customer
    Given user launchs demo telecome application
    And click on add customer option
    When user enter all the requirements 
    And click submit button
    Then verify the customer ID generated
   
