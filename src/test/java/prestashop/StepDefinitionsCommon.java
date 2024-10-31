package prestashop;

import io.cucumber.java.After;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StepDefinitionsCommon {
	private WebDriver driver= Hooks.getDriver();


	@Given("je vais sur la page {string}")
	public void je_vais_sur_la_page(String page) {
		// Write code here that turns the phrase above into concrete actions
		if (page.equals("accueil")) {
			driver.get("http://www.qualifiez.fr/monPrestashop2/prestashop/index.php");
		}

		else if (page.equals("contact")) {
			driver.get("http://www.qualifiez.fr/monPrestashop2/prestashop/index.php?controller=contact");
		}

	}

	@Given("le site est affiché en mode desktop")
	public void le_site_est_affiché_en_mode_desktop() {
		driver.manage().window().setSize(new Dimension(1500, 1000));
		System.out.print("hook");
	}
	@Given("un utilisateur de prestashop")
	public void un_utilisateur_de_prestashop() {
		System.out.println("je suis un utilisateur de prestashop");
	}
	@Given("je vais sur la page d’accueil de prestashop")
	public void je_vais_sur_la_page_d_accueil_de_prestashop() {
		driver.get("http://www.qualifiez.fr/monPrestashop2/prestashop/index.php");
	}

}
