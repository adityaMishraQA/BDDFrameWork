Feature: Checking checkout feature is adding right item
  Scenario: Checkout feature should show number of item added in that
    Given user is on GreenKart website
    When user searches for "Tom" in search field
    And user adds three item of searched item
    And user clicks on add to cart
    Then user should see searched in checkout feature

