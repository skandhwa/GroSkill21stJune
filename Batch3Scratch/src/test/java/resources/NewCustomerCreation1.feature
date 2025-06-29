@regression

Feature: Create New Customer

  Background: Login into Application
    Given User logins into the application
    And User will enter the "mngr538723"
    And User then enters the "EdYhYjy"
    When User Will click on Login Button
    Then User Will be navigated to homepage

  Scenario Outline: Creating a New Customer
    Given User is Landed on the Home Page of the Application
    And User will click on the New Customer link
    And User will enter the  Cutomer name as "<Customer_Name>"
    And user will select Gender
    And User will enter the Date of Birth as "<date_of_birth>"

    Examples: 
      | Customer_Name | date_of_birth |
      | Manish        | 08-08-1986    |