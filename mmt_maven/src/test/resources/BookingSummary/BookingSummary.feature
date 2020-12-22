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
@BookingSummary
Feature: Booking Summary
  I want to use this template for my feature file

  @tag1
  Scenario: entering traveller details
  Given user is on booking review page
  When clicks on add traveller
  And user leaves firstname blank
  And user enters lastname
  And user selects the gender
  And user enters a phone number
  And user enters an email-id 
  And user clicks on continue
  Then alert message is displayed
  
  @tag2
  Scenario: entering traveller details
  Given user is on booking review page
  When clicks on add traveller
  And user enters firstname
  And user enters lastname
  And user selects the gender
  And user doesnot enter a phone number
  And user enters an email-id 
  And user clicks on continue
  Then alert message is displayed
  