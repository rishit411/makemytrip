#Author: Rishit

#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@HomePage
Feature: HomePage

Background: User has already entered the MakeMyTrip URL
  

  @tag1
  Scenario: mmt url validation
  Given user enters a valid url
  When user presses enter
  Then mmt homepage opens
   

  @tag2
  Scenario: sign in
  Given user is on mmt homepage
  And user has a valid Gmail/Facebook account
  When user enters invalid username
  And valid password
  Then Text appears in red colour saying invalid username/password
  
  @tag3
  Scenario: sign in
  Given user is on mmt homepage
  And user has a valid Gmail/Facebook account
  When user enters valid username
  And invalid password
  Then Text appears in red colour saying invalid username/password
  
  @tag4
  Scenario: type of trip
  Given user is on mmt homepage
  And user is logged in using valid credentials
  When user clicks on oneway radio button
  Then the oneway radio button is checked
  
  @tag5
  Scenario: type of trip
  Given user is on mmt homepage
  And user is logged in using valid credentials
  When user clicks on round-trip radio button
  Then the round-trip radio button is checked
  
  @tag6
  Scenario: search results
  Given user is on mmt homepage
  And user is logged in using valid credentials
  And user clicks on oneway radio button
  When user enters source city
  And user enters destination city
  And user enters the departure date
  And user clicks on search button
  Then user is navigated to search results page
  
  @tag7
  Scenario: type of trip
  Given user is on mmt homepage
  And user is logged in using valid credentials
  When user clicks on round-trip radio button
  Then the round-trip radio button is checked
  
  @tag8
  
  Scenario: search results
  Given user is on mmt homepage
  And user is logged in using valid credentials
  And user clicks on round-trip radio button
  When user enters source city
  And user enters destination city
  And user enters the departure date
  And user enters the arrival date
  And user clicks on search button
  Then user is navigated to search results page

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
