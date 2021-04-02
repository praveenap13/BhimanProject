Feature: verify add bank

  Background: 
    Given user enter '9876543211' as username
    And user enters 'admin' as password
    And click on login button
    Then mousehover on master menu and click on Banks

  Scenario: Add new bank record
    Given user on bank interface
    And click on add button
    And verify add bank page is opened.
    When user enters the following details
      #|BankName|AccHolder|AccNo|AccType|IFSC|MICR|
      | Alahabad | Ravi Shankar | 1234567 | Savings | Ahbd0123456 | 21345678 |
    Then user should be add bank successfully
