Feature: Login Test

  Scenario: Go to amazon website and test login page

    Given Go to Amazon website
    And Login
    And Enter name
    And Enter password
    When Click submit
    Then Verify success message