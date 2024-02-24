Feature: Paying Bills

  Background:
    Given Navigate To Website
    And Enter Data in Text Box
      | username | melikk  |
      | password | 123456 |
    And Click On The Element
      | SubmitLogin |

  Scenario: US_03
    Given Click On The Element
      | billPay |
    And Enter Data in Text Box
      | payeeName                | melik1          |
      | payeeAddress             | 12345 trask ave |
      | payeeCity                | Los Angeles     |
      | payeeState               | California      |
      | payeeZipCode             | 12345           |
      | payeePhone               | 17145667899     |
      | payeeAccountNumber       | 123456789       |
      | payeeAccountNumberVerify | 123456789       |
      | payeeAmount              | 100             |
    And Click On The Element
      | payeeSendPayment |
    And Verification Is In Progress
      | payeeSuccessMessage | was successful. |
    When Click On The Element
      | accountOverview |
      | accountNumber   |
    Then Verification Is In Progress
      |paymentCompleteMessage|