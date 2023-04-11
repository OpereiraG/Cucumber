Feature: Login Functionalities

  @smoke
  Scenario: Valid Admin login
    #Given open the browser and launch HMRS application
    When user enters valid email and valid password
    And click on login button
    Then user successfully logged into the application
    #And Close the browser

  @smoke2
  Scenario: Valid Admin login
    #Given open the browser and launch HMRS application
    When user enters valid "admin" and valid "Hum@nhrm123"
    And click on login button
    Then user successfully logged into the application
    #And Close the browser


    #Hooks: For defining and pre and post steps in any Cucumber framework
  #       :This is always created inside the StepDefinitions folder
  #       :This class cannot be inherited
