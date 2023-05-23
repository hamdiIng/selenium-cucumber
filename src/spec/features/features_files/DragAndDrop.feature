@dragAndDrop
Feature: je souhaite se connecter a l application https://demoqa.com/droppable/ 
  as a user I want to test drag and drop fonctionnality

  @dragDrop
  Scenario: se connecter a https://demoqa.com/droppable/ et tester le drag and drop
    Given je me connecte a https://demoqa.com/droppable/
    Then je teste la fonctionnalite drag and drop