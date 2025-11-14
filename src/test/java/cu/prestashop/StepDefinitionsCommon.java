package cu.prestashop;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
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
		else if (page.equals("conexion")) {
			driver.get("http://www.qualifiez.fr/monPrestashop2/prestashop/index.php?controller=authentication?back=http%3A%2F%2Fwww.qualifiez.fr%2FmonPrestashop2%2Fprestashop%2Findex.php%3Fcontroller%3Dregistration");

		}
		
		else if (page.equals("detail")) {
			driver.get("http://www.qualifiez.fr/monPrestashop2/prestashop/index.php?id_product=2&id_product_attribute=9&rewrite=brown-bear-printed-sweater&controller=product#/1-taille-s");

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
