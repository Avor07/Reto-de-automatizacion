Feature: Sign in

  Scenario Outline:  Sign in Successful
    Given user is on Guru Bank
    Given user is Log in
      | user   | pass   |
      | <user> | <pass> |
    When  user Sign in a client
      | name   | birthday   | address   | city   | state   | pin   | mobile   | email   | password   |
      | <name> | <birthday> | <address> | <city> | <state> | <pin> | <mobile> | <email> | <password> |
    Then  user Should see data client
    Examples:
      | name | birthday | address    | city   | state  | pin    | mobile    | email          | password | user       | pass    |
      | gato | 07012003 | Cra prueba | Bogota | bogota | 123456 | 318612087 | bebq@gmail.com | 12345678 | mngr316325 | mArynaz |