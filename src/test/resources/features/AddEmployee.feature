Feature: Adding the employee in HRMS application
  Background:
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user successfully logged in
    When user clicks on PIM option
    And user clicks on add employee option

  @regression @heya
  Scenario: Adding one employee from feature file
    #Given user is navigated HRMS application

    And user enters first name middlename and last name
    And user clicks on save button
    Then employee added successfully


  Scenario: adding one employee using cucumber feature file

    And user enters "Zuhoor" "Mujeeb" and "Khan"
    And user clicks on save button
      Then employee added successfully
    @test
    Scenario Outline: Adding multiple employee

      And user provides "<firstName>" "<middleName>" "<lastName>"
      And user clicks on save button
      Then employee added successfully
      Examples:
      |firstName|middleName|lastName|
      |Asel     |Ms        |Tolga   |
      |Tariq    |Ahmad     |khan    |
      |Akram    |Ali       |Ali     |

  @test @datatable
  Scenario: Add employee using data table
    When user provides multiple employee data and verify they are added
    |firstName|middleName|lastName|
    |Asel     |Ms        |Tolga   |
    |Tariq    |Ahmad     |khan    |
    |Akram    |Ali       |Ali     |



