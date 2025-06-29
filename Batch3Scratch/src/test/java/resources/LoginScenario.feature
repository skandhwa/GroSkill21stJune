@sanity

Feature: Validate login into Application

  Scenario Outline: checking the login part
    Given User logins into the application
    And User will enter the "<Username>"
    And User then enters the "<Password>"
    When User Will click on Login Button
    Then User Will be navigated to homepage
    
 

    Examples: 
      | Username   | Password | 
      | mngr626399 | UvurAqY  | 
