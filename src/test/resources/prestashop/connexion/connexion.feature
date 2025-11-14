#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: connexion
  I want to use this template for my feature file

  @tag1
  Scenario: Connexion avec succes
	Given  je suis sur la page de connexion
	When je m’authentifie avec le login "xxx" et mdp "yyy" 
	Then je suis redirigé vers la page d’accueil
	And Mon nom "zzz" est affiché
	
		@tag1   
Scenario Outline: connexion avec erreur
	Given je suis sur la page de connexion
	When je m’authentifie avec le login <login> et mdp <mdp> 
	Then le message d erreur suivant est affiché : <msg>
   
   	Examples:
  	 | login             | mdp     |  msg                       |
     |   domi@toto.fr    |   azerty| Échec d'authentification.  | 
     | inexistant@toto.fr| qsdfghhj| Échec d'authentification.  |  

