@kybordEvent
Feature: Je verifie le selectionnement le copie et le collage du texte avec clavier 
  ETQ utilisateur je veux tester la fonctionnalite de selectionner copier coller

  @kybordEventkey
  Scenario:  Je verifie la saisie des parametre sur l IHM avec le copier coller du clavier 
    Given Je visite la page de connexion a l application 
    When  Je selectionne le text de parametre avec les raccourcis clavier
    And   J utilise le clavier pour faire copier 
    And   J utilise le clavier pour faire coller dans les deux champs login et password 
    Then   Je clique sur le bouton de connexion
 