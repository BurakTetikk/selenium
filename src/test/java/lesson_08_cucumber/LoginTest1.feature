Feature: Login Test
  Scenario Outline:
    Given Go to website
    And Click on login button
    And Type name "<name>"
    And Type email "<email>"
    Examples:
    | name | email |
    | Burak | brk@gmail.com |
    | Burcu | brc@gmail.com |
    | Ayfer | ayfr@gmail.com |
    | Mehmet | mhmt@gmail.com |

