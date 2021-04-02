Feature: Add project in project master successfull

  Background: 
    Given user enter '9876543211' as username
    And user enters 'admin' as password
    And click on login button
    And mousehover on master menu
    And click on projects submenu
    And click on add project button

  #Scenario: user is adding new project record
    #When user select 'Union Bank' as branch name
    #And user enters  'NewHorizon' as project name
    #And user enters '2' as number of plots
    #And user enters '2200' as total area
    #And user enters '200' as rate
    #And user upload 'D:\\Freelance.pdf' as layout file
    #And user upload 'D:\\Freelance.pdf' as NAOrder file
    #And user upload 'D:\\Freelance.pdf' as sevenTwelve file
    #And click on submit
    #And verify msg project created successfully.
    #And click on ok button
#
   #Scenario: user click on submit button to check error messages
    #When user click on submit button
    #And verify branch name error message
    #And verify project name error message
    #And verify NoOfPlots error message
    #And verify totalArea error message
    #And verify rate error message
    #And verify totalAmt error message
    #
    Scenario: user reset all fields
    When user select 'Union Bank' as branch name
    And user enters  'NewHorizon' as project name
    And user enters '2' as number of plots
    And user enters '2200' as total area
    And user enters '200' as rate
    And user upload 'D:\\Freelance.pdf' as layout file
    And user upload 'D:\\Freelance.pdf' as NAOrder file
    And user upload 'D:\\Freelance.pdf' as sevenTwelve file
    And click on cancel button
    And accept alert
    And verify all fields are cleared
    
    Scenario: user trying to enter project without layout,NAoder, 7/12 files
    
    When user select 'Union Bank' as branch name
    And user enters  'NewHorizon' as project name
    And user enters '2' as number of plots
    And user enters '2200' as total area
    And user enters '200' as rate
    And click on submit
    And verify error message for files
    And click on ok button
    
    
