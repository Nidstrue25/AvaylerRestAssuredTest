Feature: Parabank Functionality
AS a user I should be able to withdraw funds from the account

  Scenario: User should able to Withdraw from account when funds are available
    Given User has an account with valid credential
    And User should able to get account details

  Scenario: User should able to Withdraw from account when funds are available
    Given User has an account with valid credential
    And User should able to get account details
    And the account balance is 1000.00 dollars
    When the customer withdraws 500.00 dollars
    Then the account balance should be 500.00 dollars
    And a new transaction should be recorded

