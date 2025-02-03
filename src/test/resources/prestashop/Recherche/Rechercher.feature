
Feature: Rechercher

Cette fonctionalité permet de chercher un vêtement sur le site MonPrestashop 
à partir d'un champ texte.

  Background:
  Given le site est affiché en mode desktop


   
	@TestSimple   
Scenario Outline: recherche générique
	Given je vais sur la page d’accueil de prestashop
	When je fais une recherche avec le mot-clé <item>
	Then le message suivant est affiché : <msg>
	And Il y a <nb> vignettes d’affichées avec dans la description le mot <item>
   
   	Examples:
  	 | item              | nb      |  msg               |
     |    MUG            |   5     | Il y a 5 produits. | 
     |    T-shirt        |   1     | Il y a 1 produit.  |  

@TestPage     
Scenario: champ recherche sur la page accueil
	Given un utilisateur de prestashop
	When je vais sur la page "accueil"
	Then je trouve un champ de recherche
@TestPage
Scenario: champ recherche sur la page contact
	Given un utilisateur de prestashop
	When je vais sur la page "contact"
	Then je trouve un champ de recherche
	
@TestRechercheInfructueuse	
Scenario Outline: recherche infructueuse
	Given je vais sur la page d’accueil de prestashop
	When je fais une recherche avec le mot-clé "<item>"
	Then un message d'erreur est affiché
   
   	Examples:
  	 | item              |  
     |  xxxxxxxxxxx      | 
     |  yyyyyyyyyyy      |   

 
  
