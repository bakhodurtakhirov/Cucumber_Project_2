Feature: Saving Account

  Background:
    Given Navigate To Website
    And Enter Data in Text Box
      | username | melikk  |
      | password | 123456 |
    And Click On The Element
      | SubmitLogin |

  Scenario: US_402
    Given Click On The Element
      | openNewAccount |
    And Enter Data in Select Menu
      |openAccDropDownMenu|SAVINGS|
    When Click On The Element
      |openNewAccount12|
    Then Verification Is In Progress
      |newAccountSuccess|