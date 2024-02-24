Feature:New Account

  Background:
    Given Navigate To Website
    And Enter Data in Text Box
      | username | melikk  |
      | password | 123456 |
    And Click On The Element
      | SubmitLogin |

  Scenario: US_401
    Given Click On The Element
    |openNewAccount|
    And Enter Data in Select Menu
    |openAccDropDownMenu|CHECKING|
    When Click On The Element
    |openNewAccount1|
    Then Verification Is In Progress
    |newAccountSuccess|
