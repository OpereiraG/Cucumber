Feature: Login Functionalities

  @testCase1
  Scenario: Valid Admin login
    Given open the browser and launch HMRS application
    When user enters valid email and valid password
    And click on login button
    Then user successfully logged into the application
    And Close the browser