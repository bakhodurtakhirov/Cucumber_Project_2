Feature: Credit Application
  As a customer, I would like to apply for a loan through the Parabank website. In this way, I can get the financing
  I need and follow the status of my application.

  Background:
    Given Navigate To Website
    And Enter Data in Text Box
      | username | group2@gmail.com |
      | password | Group2Password   |
    And Click On The Element
      | SubmitLogin |

  Scenario: Credit Application Negative Scenario
    And Click On The Element
      | requestLoan |
    And Enter Data in Text Box
      | LoanAmount | 100000000000000000 |
      | downPayment | 200 |
    And Click On The Element
      | applyNow |
    And Verification Is In Progress
      | loanStatus | Denied |
      | insufficientFundsMessage | We cannot |
