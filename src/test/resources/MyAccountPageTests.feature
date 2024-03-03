Feature: My Account Page Tests

  Scenario: Login without password
    Given Browser is open
    When Click account button
    When Fill login with "Login"
    When Click Login button
    Then Check if information "Error: The password field is empty." is displayed

  Scenario Outline: Login without password with Scenario Outline
    Given Browser is open
    When Click account button
    When Fill login with "<Login>"
    When Click Login button
    Then Check if information "<Message>" is displayed

    Examples:
      | Login          | Message                             |
      | 23             | Error: The password field is empty. |
      | Cos dluzszego  | Error: The password field is empty. |
      | a6256asd5+6asd | Error: The password field is empty. |


