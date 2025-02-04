package prestashop;

import io.cucumber.java.en.*;
import pageObject.HeaderPage;
import pageObject.RecherchePage;

import static org.junit.jupiter.api.Assertions.*;
public class StepDefinitionsRecherche {


	@When("je fais une recherche avec le mot-clé MUG")
	public void je_fais_une_recherche_avec_le_mot_clé_mug() {
		HeaderPage page = new HeaderPage(Hooks.getDriver());
		page.lancerUneRecherche("MUG");
	}

	@Then("le message suivant est affiché : Il y a {int} produits.")
	public void le_message_suivant_est_affiché_il_y_a_produits(Integer int1) {
		RecherchePage page = new RecherchePage(Hooks.getDriver());		
		assertTrue(page.resultatPresent());
		assertEquals("Il y a " + int1 + " produits.",page.renvoyerResultat());
	}

	@Then("Il y a {int} vignettes d’affichées avec dans la description le mot MUG")
	public void il_y_a_vignettes_d_affichées_avec_dans_la_description_le_mot_mug(Integer int1) {
		RecherchePage page = new RecherchePage(Hooks.getDriver());
		assertEquals(int1, page.nbResult());
	}

	@When("je fais une recherche avec le mot-clé T-shirt")
	public void je_fais_une_recherche_avec_le_mot_clé_t_shirt() {
		HeaderPage page = new HeaderPage(Hooks.getDriver());
		page.lancerUneRecherche("T-shirt");
	}

	@Then("Il y a {int} vignettes d’affichées avec dans la description le mot T-shirt")
	public void il_y_a_vignettes_d_affichées_avec_dans_la_description_le_mot_t_shirt(Integer int1) {
		RecherchePage page = new RecherchePage(Hooks.getDriver());
		assertEquals(int1, page.nbResult());
	}

	@Then("le message suivant est affiché : Il y a {int} produit.")
	public void le_message_suivant_est_affiché_il_y_a_produit(Integer int1) {
		RecherchePage page = new RecherchePage(Hooks.getDriver());
		assertEquals("Il y a " + int1 + " produit.",page.renvoyerResultat());
	}

	@Then("je trouve un champ de recherche")
	public void je_trouve_un_champ_de_recherche() {
		HeaderPage page = new HeaderPage(Hooks.getDriver());
		assertTrue(page.champRecherchePresent());
	}

	@When("je fais une recherche avec le mot-clé {string}")
	public void je_fais_une_recherche_avec_le_mot_clé(String string) {
		HeaderPage page = new HeaderPage(Hooks.getDriver());
		page.lancerUneRecherche(string);
	}

	@Then("un message d'erreur est affiché")
	public void un_message_d_erreur_est_affiché() {
		RecherchePage page = new RecherchePage(Hooks.getDriver());
		assertEquals("Aucun produit ne correspond à votre recherche",page.renvoyerErreur());
	}

}
