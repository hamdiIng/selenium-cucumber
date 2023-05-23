@uploadFile
Feature: je verifie le chargement du fichier sur l application web 
  ETQ utilisateur je veux tester la fonctionnalite d charger un fichier

  @uploadFile1
  Scenario: je me connecte sur l application et je charge un fichier 
    Given je me connecte sur l application et je teste la fonctionnalite de charger un fichier 
    Then je verifie si le fichier est charge "successfully uploaded."