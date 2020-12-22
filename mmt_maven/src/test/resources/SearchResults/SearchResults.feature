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
@SeachResults
Feature: Search Results
  I want to use this template for my feature file

  @tag1
  Scenario: filter flights by airline name
  Given user is on search results page
  When user selects a particular airline checkbox
  Then flights of only that airline are displayed

  @tag2
   Scenario: filter flights by number of stops
  Given user is on search results page
  When user selects a checkbox for particular number of stops
  Then flights according to number of stops are displayed
  
  @tag3
  Scenario: filter flights by number of stops
  Given user is on search results page
  When user selects a checkbox for particular number of stops
  Then flights according to number of stops are displayed
  
  @tag4
  Scenario: filter flights by arrival time
  Given user is on search results page
  When user selects a checkbox for particular arrival time
  Then flights according to the selected arrival time are displayed
  
  @tag5
  Scenario: book a particular flight
  Given user is on search results page
  When user clicks on view prices of a particular flight
  And user clicks on book now
  Then user is navigated to booking review page

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
