@PlaceHolder
Feature: Je souhaites tester la fonctionnalite de placeHolder
  ETQ utilisateur je souhaites tester la fonctionnalite de place holder

	Background
  @PlaceHolderDemo
  Scenario: Je souhaites tester la fonctionnalite de placeHolder
    Given Je me connecte a l application pour tester placeholder 
    When 	Je cherche l element contenant le place holder 
    Then 	je recupere le text du placeHolder