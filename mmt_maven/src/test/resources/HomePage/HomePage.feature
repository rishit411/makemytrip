#Author: your.email@your.domain.com
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
@tag
Feature: homepage
  Background: User has already navigated to makemytrip
 @Tag1
  Scenario: sign in
  Given user is on mmt homepage
  When user clicks on login button
  And user enters invalid username
  And user clicks on next button
  Then Text appears invalid username
  
  @Tag2
  Scenario: sign in
  Given user is on mmt homepage
  When user clicks on login button1
  And user enters valid username
  And clicks on next button1
  And invalid password
  And user clicks on signin1
  Then text appears invalid password

	@Tag3
  Scenario: sign in
  Given user is on mmt homepage
  When user clicks on login button2
  And user enters valid username1
  And clicks on next button2
  And valid password1
  And clicks on signin2
  Then Successful login
  
  
  @Tag4
  Scenario: search results
  Given user is on mmt homepage
  When user clicks on oneway
  And user enters source city
  And user enters destination city
  And user enters departure date and clicks on search button
  Then user is navigated to search results page
  

	@Tag5
  Scenario: search results
  Given user is on mmt homepage
  When  user clicks on roundtrip
  And   user enters source city1
  And   user enters destination city1
  And   user enters departure date
  And   user enters arrival date and clicks on search button
  Then  user is navigated to search results page1