@connexion
Feature: Authentification - OrangeHRM
  En tant que utilisateur je souhaite m'authentifier

  @cnx
  Scenario: Authentification - OrangeHRM
    Given Je me connecte sur l'application orange
    When Je saisi username
    And Je saisi password
    And Je click sur le bouton login
    Then Redirection vers le compte admin
