@ManualFeature2
Feature: register for a job on the website
 AS send empty registration form
 I want to register my data on the website
 TO create a profile
 
 Background:
 Given that Carolayn enters the website
 
  @tag4
  Scenario: Register for a job Successfully
   When she enters her data in the registration form and sends it
   Then she should see the successful registration message
  
  @tag5
  Scenario: Send empty registration form
   When she clicks submit without filling out the registration form data
   Then she should see the mandatory field error message
    
  