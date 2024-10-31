package prestashop;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefinitionsRecherche {
	
	private WebDriver driver = Hooks.getDriver();


	@When("je fais une recherche avec le mot-clé MUG")
	public void je_fais_une_recherche_avec_le_mot_clé_mug() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("s")).sendKeys("MUG");
		driver.findElement(By.name("s")).sendKeys(Keys.ENTER);
	}

	@Then("le message suivant est affiché : Il y a {int} produits.")
	public void le_message_suivant_est_affiché_il_y_a_produits(Integer int1) {
		WebDriverWait wait = (new WebDriverWait(driver, Duration.ofSeconds(30)));
		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//*[@id='js-product-list-top']/div[1]/p"))));

		assertTrue(driver.findElement(By.xpath("//*[@id='js-product-list-top']/div[1]/p")).isDisplayed());
		assertEquals("Il y a " + int1 + " produits.",
				driver.findElement(By.xpath("//*[@id='js-product-list-top']/div[1]/p")).getText());

	}

	@Then("Il y a {int} vignettes d’affichées avec dans la description le mot MUG")
	public void il_y_a_vignettes_d_affichées_avec_dans_la_description_le_mot_mug(Integer int1) {
		int nb = driver.findElements(By.xpath("//*[@id=\"js-product-list\"]/div[1]/div/article")).size();
		assertEquals(int1, nb);
	}

	@When("je fais une recherche avec le mot-clé T-shirt")
	public void je_fais_une_recherche_avec_le_mot_clé_t_shirt() {
		driver.findElement(By.name("s")).sendKeys("T-shirt");
		driver.findElement(By.name("s")).sendKeys(Keys.ENTER);
	}

	@Then("Il y a {int} vignettes d’affichées avec dans la description le mot T-shirt")
	public void il_y_a_vignettes_d_affichées_avec_dans_la_description_le_mot_t_shirt(Integer int1) {
		int nb = driver.findElements(By.xpath("//*[@id=\"js-product-list\"]/div[1]/div/article")).size();
		assertEquals(int1, nb);
	}

	@Then("le message suivant est affiché : Il y a {int} produit.")
	public void le_message_suivant_est_affiché_il_y_a_produit(Integer int1) {
		assertEquals("Il y a " + int1 + " produit.",
				driver.findElement(By.xpath("//*[@id='js-product-list-top']/div[1]/p")).getText());
	}



	@Then("je trouve un champ de recherche")
	public void je_trouve_un_champ_de_recherche() {
		assertTrue(driver.findElement(By.name("s")).isDisplayed());
	}

	@When("je fais une recherche avec le mot-clé {string}")
	public void je_fais_une_recherche_avec_le_mot_clé(String string) {
		driver.findElement(By.name("s")).sendKeys(string);
		driver.findElement(By.name("s")).sendKeys(Keys.ENTER);
	}

	@Then("un message d'erreur est affiché")
	public void un_message_d_erreur_est_affiché() {
		assertEquals("Aucun produit ne correspond à votre recherche",
				driver.findElement(By.id("product-search-no-matches")).getText());
	}

}
