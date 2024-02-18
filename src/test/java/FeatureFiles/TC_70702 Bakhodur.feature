Feature: Update the contact information
  As a user, I want to update the contact information in my profile. In this way, my address, my phone number and other
  contact information will be up -to -date and correct, so that I can communicate with the bank in a smooth way when
  communicating and transactions.

  Background:
    Given Navigate To Website
    And Enter Data in Text Box
      | username | group2@gmail.com |
      | password | Group2Password   |
    And Click On The Element
      | SubmitLogin |

  Scenario: Update the contact information Negative Scenario
    And Click On The Element
      | updateContactInfo |
    And Waiting for fields to be populated
      | address | Address |
    And Enter Data in Text Box
      | address | [blank] |
    And Verification Is In Progress
      | errorMessage | required |
    And Click On The Element
      | updateProfile |
