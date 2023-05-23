@todoAddRemove
Feature: tester la suppression d un element
  As a user i want test if a deleted element is delete

  @todoAdd
  Scenario: je souhaite ajouter un texte dans la liste puis le supprimer 
    Given je me connecte a l application 
    And J ajoute texte dans l input ""
    And Je clique sur le bouton entree du clavier
    And  Je verifie le texte ajoutee

