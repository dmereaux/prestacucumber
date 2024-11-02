package prestashop;

import io.cucumber.java.After;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Hooks {
	static private WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	@Before
	public void debut_de_test() throws MalformedURLException {
//		driver = new ChromeDriver(new ChromeOptions().addArguments("--disable-search-engine-choice-screen"));
		driver = new RemoteWebDriver(new URL("http://localhost:4444"), new ChromeOptions().addArguments("--disable-search-engine-choice-screen"));


	}

	@After
	public void fin_de_test() {
		driver.quit();
	}

}
