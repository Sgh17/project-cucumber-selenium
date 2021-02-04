@outline
Feature: Authentification Outline - OrangeHRM
  En tant que utilisateur je souhaite m'authentifier avec un scenario outline
  
  Background:
    Given je me connecte sur l'application orange
  
  @cnx-outline
  Scenario Outline: Authentification Outline - OrangeHRM
    When je saisi username "<name>"
    And je saisi password "<password>"
    And je click sur le bouton login

    Examples: 
      | name    | password   |
      | Admin   | admin123   |
      | Safe    | safe123    |
       | Imen    | imen123    |
      | Sondes  | sondes123  |
      | Hanene  | hanene123  |
      | Zakaria | zakaria123 |
