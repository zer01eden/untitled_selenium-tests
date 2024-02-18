Feature: Home Page Tests

Background:  Browser is open

  Scenario:  Main Page check
    Then I am on the main site

  Scenario: Subscribe Newsletter
    When Fill newsletter name with "Imie"
    When Fill newsletter email with "email"
    When Click Subscribe button
