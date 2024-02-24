Feature: Register

  Scenario: US_01
    Given Navigate To Website
    And Click On The Element
      | registerButton |
    And Enter Data in Text Box
      | customerFirstName       | Melikk             |
      | customerLastName        | Keskiner          |
      | customerAddress         | 11300 chapman ave |
      | customerAddressCity     | garden grove      |
      | customerAddressState    | CA                |
      | customerAddressZipCode  | 92840             |
      | customerPhoneNumber     | 7148566641        |
      | customerSSN             | 111111            |
      | customerUserName        | melik1            |
      | customerPassword        | 123456            |
      | customerPasswordConfirm | 123456            |
    When Click On The Element
      | registerComplete |
    Then Verification Is In Progress
      | registerSuccessMessage |