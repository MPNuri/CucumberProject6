Feature: Adding new Payee

  Background:
    Given User is on LoginPage
    When User enters login credentials as Username "username" Password "password"
    Then User Successfully login

  Scenario Outline: Add Payee
    When User clicks on Add New Payee
    And User should able to add "<Payee Name>", "<Payee Address>", "<Payee Account>", "<Payee Details>" information
    Then user should see success message

    Examples:
    | Payee Name | Payee Address    | Payee Account | Payee Details |
    | Murillo    | 124 zattiri road | 5116156       | Electricity   |
  #  | 16113      | 135 horasan      | #$%^&         |               |
  #  |!@#$%^&     | 16531            | kalmcsvl      | 64344         |



