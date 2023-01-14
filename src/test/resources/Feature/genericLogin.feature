Feature: To test login functionality in given page

  Scenario Outline: To test successful login with correct credentials
    Given Browser is open
    And user has provided the url of login page
    When User inputs "<email>" and "<password>" # Email can be replaced with username too.
    And Press the login button
    Then User should navigate to next page

    Examples: 
      | email                 | password |
      | testlogin@yopmail.com | 12345678 |
