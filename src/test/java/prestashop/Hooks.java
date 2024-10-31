package prestashop;

import io.cucumber.java.After;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Hooks {
	static private WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	@Before
	public void debut_de_test() {
		driver = new ChromeDriver(new ChromeOptions().addArguments("--disable-search-engine-choice-screen"));

	}

	@After
	public void fin_de_test() {
		driver.quit();
	}

}
