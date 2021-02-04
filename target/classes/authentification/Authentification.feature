@connexion
Feature: Authentification - OrangeHRM
  En tant que utilisateur je souhaite m'authentifier

Background:
    Given je me connecte sur l'application orange
    
  @cnx
  Scenario: Authentification - OrangeHRM
    When Je saisi username "Admin"
    And Je saisi password "admin123"
    And Je click sur le bouton login
    Then Redirection vers le compte admin "Welcome"
