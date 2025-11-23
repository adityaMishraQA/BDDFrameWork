Feature: Checking search feature on GreenKart
  Scenario: user should see same search results in home page and deal page
    Given user is on Greencart page
    When user search with short name "Tom" in home page
    Then user should search same "Tom" in deals page
