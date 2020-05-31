@Search-Cars
Feature: Acceptance testing to validate search car page
  In order to validate that
  Search-car page is working fine
  we will do the acceptance testing

   @Search-Cars-Positive
  Scenario: Validate Search Cars Page
    Given I am on the Home Page "https://www.carsguide.com.au" of CarsGuide Website
    When I move to Car For Sale Menu
      | Menu          |
      | Cars For Sale |
    And click on "Search Cars" link
    And select carbrand as "BMW" from AnyMake dropdown
    And select "1 Series" as car model
    And select location as "NSW - New England" from SelectLocation dropdown
    And select "$1,000" as price
    And click on Find_My_Next_Car button
    Then I should see list of searched cars
    And the page title should be "Bmw 1 Series Under 1000 for Sale New England NSW | carsguide"
