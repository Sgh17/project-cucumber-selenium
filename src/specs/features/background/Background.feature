@background
Feature: Background - OrangeHRM
  ETQ utilisateur je souhaite verifier le fonctionnement du Background

  Background: 
    Given je me connecte sur l'application orange
    When Je saisi username "Admin"
    And Je saisi password "admin123"
    And Je click sur le bouton login

  @cnx
  Scenario: Authentification - OrangeHRM
    Then Redirection vers le compte admin "Welcome"

  @buzz
  Scenario: Cliquer sur le module BUZZ
    When Je clique sur le module BUZZ

  @rec
  Scenario: Cliquer sur le module Recruitment
    When Je clique sur le module Recruitment
