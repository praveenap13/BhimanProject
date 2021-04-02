Feature: This feature consist of all positive and negative flows for login page.

   
  Scenario Outline: try to login with invalid username but invalid password.
    Given user enters '<username>' as username.
    And user enters '<password>' as password.
    When click on login button.
    Examples:
    |username|password|
    |9876542210|admin|
   






















    
    
    
    
    
    