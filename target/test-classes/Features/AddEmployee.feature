Feature: Employee

  @smoke
  Scenario: Adding new employee
    #Given open the browser and launch HMRS application
    When user enters valid email and valid password
    And click on login button
    When user clicks on PIM option
    And user clicks on add employee button
    And user enters firstname,middle name and lastname
    And user clicks on save button
    #And Close the browser


