Feature: First Feature

  Scenario Outline: <scenario no.> - Verify that a link to <website link> is displayed when User searches for "<keyword>" on Google

    Given I am on Google search engine
    When I search by "<keyword>"
    Then I should have atleast one link to "<website link>" in the search result

    Examples:
    | scenario no. | keyword | website link                  |
    | 1            | Maui    | https://www.maui-rentals.com  |
    | 2            | Britz   | https://www.britz.com         |
