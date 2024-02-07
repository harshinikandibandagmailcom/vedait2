
Feature: Login feature
 I want to login into application

  Scenario Outline: login with valid username and password
  Given user is on logi
  When enter Username as "<name>"
  And enters pasword "<password>"
  And user clicks on submit
 
 Examples:
 |name|password|
 |Test@gmail.com|test|
 |testdata@gmail.com|P123|
 