Feature: First Feature

  Scenario Outline: <scenario no.> - Verify that User is able to see the information icons on all the fields in the calculator

    Given I am on Google search engine
    When I search by "<keyword>"
    Then I should have atleast one link to "<website link>" in the search result

    Examples:
    | scenario no. | keyword | website link                  |
    | 1            | Maui    | https://www.maui-rentals.com  |
    | 2            | Britz   | https://www.britz.com         |
