@about
Feature: Je souhaite cliquer sur le bouton about apres connexion de l application Swag labs
  ETQ utilisateur je souhaite couvrir la fonctionnalite about de l application Swag Labs

 Background: 
    Given Je me connecte a l application Swag Labs
    When Je clique sur le burguer menu button
  @aboutclick
  Scenario: decouvrir la page about
    Given je clique sur le bouton about
    When je me rederige vers l url https://saucelabs.com/ "Products"
    Then je cherche et clique sur cross-browser-testing "CROSS-BROWSER TESTING"

 