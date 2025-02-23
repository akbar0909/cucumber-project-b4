Feature: Scenario Outline practice

  @google_search_outline
  Scenario Outline:
    Given user in on Google search page
    When user search for "<country>"
    Then user should see the "<capital>" in the results
    And we love Loop Academy

    Examples:
      | country    | capital          |
      | Azerbaijan | Baku             |
      | Ukraine    | Kyiv             |
      | Afganistan | Kabul            |
      | USA        | Washington, D.C. |
      | Turkiye    | Ankara           |
      | Uzbekistan | Tashkent         |
      | Georgia    | Tblisi           |
