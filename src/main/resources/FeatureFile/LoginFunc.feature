Feature: Login Functionality

  Scenario: Positive Login
    Given User is on LoginPage
    When User enters login credentials as Username "username" Password "password"
    Then User Successfully login