Feature: Search an employee in HRMS

  Background:
  #Background for every feature will be sprite
    #Given user is navigated HRMS application
    When user enters valid admin credentials
    And user clicks on login button
    And user navigated to employee list page

  @regression @background @maha
  Scenario: Search an employee by id
    #* user is navigated HRMS application
    #* user enters valid admin credentials
    #* user clicks on login button
    #* user navigated to employee list page
    When user enters valid employee id
    And user click on search button
    Then user is able to see employee information
  @smoke @background
    Scenario: Search an employee by name
      #Given user is navigated HRMS application
      #When user enters valid admin credentials
      #And user clicks on login button
      #And user navigated to employee list page
      When user enters valid employee name
      And user click on search button
      Then user is able to see employee information


