Feature: Crear cuenta

  Background: Sign in Successful
    Given user is Log in Guru Bank
      | mngr316325 | mArynaz |


  Scenario: create Account
    When the user create the clients account
    |30000|
    Then user Should see  accounts data
