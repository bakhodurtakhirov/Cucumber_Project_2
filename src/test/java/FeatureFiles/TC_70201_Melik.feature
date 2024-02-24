Feature: Login
  Scenario: US_01
    Given Navigate To Website
    And Enter Data in Text Box
      | username | melikk  |
      | password | 123456 |
    And Click On The Element
    |SubmitLogin|
    When Verification Is In Progress
    |myAccountSuccess|
    Then Click On The Element
    |logOut|