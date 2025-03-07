
@google_search_data_table
Feature: Passing multiple parameters to the same step


  Scenario: Searching multiple items
    Given user in on Google search page
    Then user searches the following items
    |loop academy|
    |java        |
    |selenium    |
    |cucumber bdd|
    |sql         |
    |Pavlo       |
    |Kate        |
    And we love Loop Academy
