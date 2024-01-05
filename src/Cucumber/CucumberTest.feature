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
Feature: Login to Facebook
  I want to use this template for my feature file
  
  Background: 
  Given I landed on Facebook

  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes

  @tag2
  Scenario Outline: Positive test of logging in Facebook
    Given I input my username <name> and password <password>
    When I clicked on submit button
    Then I can see my name "Anuuya Parajuli" on the screen

    Examples: 
      | name  										 | password  |
      | anusuyaparajulii@gmail.com | $@nu_Feb6 |
      
