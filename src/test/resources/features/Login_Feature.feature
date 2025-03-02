Feature: Docuport Login Logout Feature

  Background:
    Given user is on Docuport login page


  Scenario: Login as a client
   # Given user is on Docuport login page
    When user enters username for client
    And user enters password for client
    And user click login button
    And user click continue button
    Then user validates left navigate items



  Scenario: Login as an employee
    # Given user is on Docuport login page
    When user enters username for employee
    And user enters password for employee
    And user click login button
    Then user validates left navigate items



  Scenario: Login as an advisor
    When user enters username for advisor
    And user enters password for advisor
    And user click login button
    Then user validates left navigate items


  Scenario: Login as an supervisor
    When user enters username for supervisor
    And  user enters password for supervisor
    And  user click login button