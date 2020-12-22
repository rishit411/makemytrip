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
@Paymet
Feature: Payment
  I want to use this template for my feature file

 @tag1
  Scenario: Failure in flight Booking on leaving the CardHolderName blank 
		Given User is on make payment page
		When user leaves CardHolderName blank and clicks the button
		Then display alert msg
		
	@tag2	
	Scenario: Failure in flight Booking on leaving the DebitCardNo blank 
		Given User is on make payment page
		When user leaves DebitCardNo blank and clicks the button
		Then display alert msg
		
	@tag3	
	Scenario: Failure in flight Booking on leaving the expirationMonth blank 
		Given User is on make payment page
		When user leaves expirationMonth blank and clicks the button
		Then display alert msg
		
	@tag4	
	Scenario: Failure in flight Booking on leaving the expirationYr blank 
		Given User is on make payment page
		When user leaves expirationYr blank and clicks the button
		Then display alert msg

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
