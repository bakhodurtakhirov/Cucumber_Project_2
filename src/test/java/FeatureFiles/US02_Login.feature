Feature: User Login Feature

  Scenario Outline: US02_Login
    Given Navigate To Presta Shop 4
    When Click On The Element
      | singInClick |
    Then Enter Data in Text Box
      | email    | <UserEmail> |
      | password | <Password>  |
    And Click On The Element
      | SubmitLogin |
    And Verification Is In Progress
      | <Success> | <Messages> |

    Examples:
      | UserEmail         | Password | Success             | Messages                 |
      | m.smith3@gmail.com | Qwerty12 | myAccountSuccess    | Welcome to your account. |
      | m.smith@gmail.com | invalid  | errorAccountSuccess | There is 1 error         |
      | m.smith@gmail.com | invalid  | errorAccountSuccess | There is 1 error         |
      | invalid@gmail.com | Qwerty12 | errorAccountSuccess | There is 1 error         |
      | msmith@gmail.com  | Qwerty12 | errorAccountSuccess | There is 1 error         |