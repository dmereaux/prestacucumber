package cu.prestashop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class driverFactory {
	public enum BrowserType{
		Firefox,
		Chrome,
		Edge,
		Safari
	};
	
	public static WebDriver  makeBrowser(BrowserType type)
	{
		switch (type) {
		case Firefox: return new FirefoxDriver();
		case Chrome: return new ChromeDriver(new ChromeOptions().addArguments("--disable-search-engine-choice-screen"));
		case Edge: return new EdgeDriver(new EdgeOptions().addArguments("--disable-search-engine-choice-screen"));
		case Safari: return new SafariDriver();

		}
		return new ChromeDriver(new ChromeOptions().addArguments("--disable-search-engine-choice-screen"));


	}

}
