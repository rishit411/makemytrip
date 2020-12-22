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
@BookingReview
Feature: Booking Review
  I want to use this template for my feature file

  
  @tag1
  Scenario: select add-ons for the flight
  Given user is on booking review page
  When user select the no radio button for securing the trip
  Then fare summary remains the same 

  
  

    
