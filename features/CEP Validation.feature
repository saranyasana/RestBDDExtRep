#Author: Saranya Ramachandran
Feature: Validate CEP from the API - (Correios)

  Background: Endpoint Configuration 
    Given The endpoint is already configured

  @run
  Scenario: Enter an invalid CEP
    When I input a valid CEP "45683499"
    Then I should have the status code "404"
    
  
  @run
  Scenario Outline: Enter  valid CEP
    When I input a valid CEP "<cep>"
    Then I should have the status code "404"
    Examples:
    |cep|
    |111|
    |1111|
    |1111|
