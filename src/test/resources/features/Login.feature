Feature: Login
  Scenario: Login valid credentials
    Given User open home page
    When  User enters username as "standard_user"
    And User enters password as "secret_sauce"
    Then User Should be able login successfully
