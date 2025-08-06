Feature: Verify the Login module

  @Login1
  Scenario Outline: Verify the login with valid credentials
    Given User is on the Home page
    When User enter username "<username>" and password "<password>"
    And User click login button
    Then User verify the success message after login "Hello Srinivasanomr!"

    Examples: 
      | username      | password  |
      | Srinivasanomr | Srini@123 |

  @Login2
  Scenario: Verify the login with invalid credentials
    Given User is on the Home page
    When User enter username "Srinivasano" and password "Srini"
    And User click login button
    Then User verify the error after clicking login "Invalid Login details or Your Password might have expired."
