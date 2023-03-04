Feature: SignUp Functionality of MagicBricks
  I want to test the SignUp Functionality of MagicBricks

  Scenario: Successfull SignUp with valid credentials
    Given User is on SignUp Page
    When User selects radio button
    And User enters valid name, email, password, country code and mobile number
    And User selects the checkbox
    And clicks on SignUp button
    Then User SignUp and navigate to the MagicBricks HomePage
    
  Scenario: Unsuccessfull SignUp with invalid email
  	Given User is on SignUp Page
  	When User enters invalid email
  	And User should see an error message
  	Then User should not be redirected to the MagicBricks HomePage
  	
  Scenario: Unsuccessful SignUp with duplicate email
  	Given User is on SignUp Page
  	When User enters an email that is already in use
  	And User should see an error message
  	Then User should not be redirected to the MagicBricks HomePage
  	
  Scenario Outline: Unsuccessful SignUp with invalid email and password
  	Given User is on SignUp Page
  	When User enter <email> as email
  	And User enter <password> as password
  	And User should see an error message
  	Then User should not be redirected to the MagicBricks HomePage
  	
  	Examples:
  		| email            | password | status |
  		| 123@gmail.com    | 123456   | Fail   |
  		| abc,123@gmail.com| abcdef   | Fail   |
  		 
  Scenario: Unsuccessful SignUp with invalid mobile number
  	Given User is on SignUp Page
  	When User enters invalid contact number
  	And User should see an error message
  	Then User should not be redirected to the MagicBricks HomePage