Feature: Homepage
  Verify minicabit homepage


  Scenario: Login //With correct email and password
    Given In a browser I enter "https://www.minicabit.com/"
    And I should be navigated to homepage
    When I click on login button
    And I enter email as "vinaykumarvvs@gmail.com"
    And I enter password as "asdfgh"
    And I click on submit button
    Then I should be able view my account details


  Scenario: Invalid Login1 //With out filling the email
    Given In a browser I enter "https://www.minicabit.com/"
    And I should be navigated to homepage
    When I click on login button
    And I enter email as " "
    And I enter password as "asdfgh"
    And I click on submit button
    Then I should not be able view my account details

   Scenario: Invalid Login2 //With out filling the password
     Given In a browser I enter "https://www.minicabit.com/"
     And I should be navigated to homepage
     When I click on login button
     And I enter email as "vinaykumarvvs1936@gmail.com "
     And I enter password as " "
     And I click on submit button
     Then I should not be able view my account details

   Scenario: Invalid Sign Up //Leaving any one of the Mandatory fields
     Given In a browser I enter "https://www.minicabit.com/"
     And I should be navigated to homepage
     When I click on sign up button
     And I enter email as "vinaykumarvvs1936@gmail.com "
     And I enter confirm email as "vinaykumarvvs1936@gmail.com"
     And I enter password as "asdfgh1"
     And I enter confrim password as "asdfgh1"
     And I enter title as " "
     And I enter firstname as "vinaykumar"
     And I enter lastname as "vvs"
     And I enter mobile as "12345678901"
     And I enter confirm mobile as "12345678901"
     And I enter city as "London"
     And I click on submit button
     Then I should not be able to get register

   Scenario: Invalid Sign up  //Password having only characters and not having any special symbol or number
    Given In a browser I enter "https://www.minicabit.com/"
    And I should be navigated to homepage
    When I click on sign up button
    And I enter email as "vinaykumarvvs1936@gmail.com "
    And I enter confirm email as "vinaykumarvvs1936@gmail.com"
    And I enter password as "asdfgh1"
    And I enter confrim password as "asdfgh"
    And I enter title as "Mr "
    And I enter firstname as "vinaykumar"
    And I enter lastname as "vvs"
    And I enter mobile as "12345678901"
    And I enter confirm mobile as "12345678901"
    And I enter city as "London"
    And I click on submit button
    Then I should not be able to get register

  Scenario: Social Media Action //Minicabit Facebook Page
    Given In a browser I enter "https://www.minicabit.com/"
    And I should be navigated to homepage
    And I click on Facebook Icon
    Then I need to see the Minicabit Facebook Page

  Scenario: Social Media Action //Minicabit Google Plus Page
    Given In a browser I enter "https://www.minicabit.com/"
    And I should be navigated to homepage
    And I click on Google Plus Icon
    Then I need to see the Minicabit Google Plus Page

  Scenario: Invalid Booking1 //With having the same Source and Destination
    Given In a browser I enter "https://www.minicabit.com/"
    And I should be navigated to homepage
    And I enter Source as "Central London"
    And I enter Destination as "Central London"
    And I enter Date as "28-10-2016"
    And I enter Time as "10:15"
    And I select option "Single"
    And I select passenger as "1 Passenger"
    And I select laguage as "1 backpack"
    And I click on getquotes
    Then I should not able to see the list of cabs

  Scenario: Invalid Booking2  //Without entering the Destination
    Given In a browser I enter "https://www.minicabit.com/"
    And I should be navigated to homepage
    And I enter Source as "Central London"
    And I enter Destination as " "
    And I enter Date as "28-10-2016"
    And I enter Time as "10:15"
    And I select the option "Single"
    And I select passenger as "1 Passenger"
    And I select laguage as "1 backpack"
    And I click on getquotes
    Then I should not able to see the list of cabs

  Scenario: Invalid Booking3  //Without entering the Source
    Given In a browser I enter "https://www.minicabit.com/"
    And I should be navigated to homepage
    And I enter Source as " "
    And I enter Destination as "Central London"
    And I enter Date as "28-10-2016"
    And I enter Time as "10:15"
    And I select the option "Round"
    And I select passenger as "1 Passenger"
    And I select laguage as "1 backpack"
    And I click on getquotes
    Then I should not able to see the list of cabs

  Scenario: Valid Booking4  //Selecting the Maximum number of Passenger and Maximum number of backpacks
    Given In a browser I enter "https://www.minicabit.com/"
    And I should be navigated to homepage
    And I enter Source as "City Airport"
    And I enter Destination as "Central London"
    And I enter Date as "28-10-2016"
    And I enter Time as "10:15"
    And I select the option "Round"
    And I select passenger as "16 Passenger"
    And I select laguage as "16 backpack"
    And I click on getquotes
    Then I should able to see the list of cabs




























