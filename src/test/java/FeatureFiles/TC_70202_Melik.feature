Feature: Login with invalid and valid data

  Scenario Outline: US_02
    Given Navigate To Website
    And Enter Data in Text Box
      | username | <Username> |
      | password | <Password>  |
    When Click On The Element
      | SubmitLogin |
    Then Verification Is In Progress
      | <Success> | <Messages> |

    Examples:
      | Username        | Password     | Success          | Messages                              |
      | Invaliduserr      | WrongPass123 | myAccountError   | Please enter a username and password. |
      |                  | WrongPass123 | myAccountError   | Please enter a username and password. |
      | Invaliduser      |              | myAccountError   | Please enter a username and password. |
      | msmith@gmail.com | Qwerty12     | myAccountError   | Please enter a username and password. |
      | melik            | 123456       | myAccountSuccess | Welcome