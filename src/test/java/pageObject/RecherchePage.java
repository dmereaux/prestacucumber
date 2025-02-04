package pageObject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import prestashop.Hooks;

public class RecherchePage {
//	private WebDriver driver;

    public RecherchePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
 //       this.driver = driver;
    }

    @FindBy(xpath = "//*[@id='js-product-list']/div[1]/div/article")
    public List<WebElement> vignettes;
    @FindBy(xpath ="//*[@id='js-product-list-top']/div[1]/p")
    public WebElement resultat;
    @FindBy(id="product-search-no-matches")
	public WebElement erreur;
    
    public Boolean resultatPresent()
    {
		WebDriverWait wait = (new WebDriverWait(Hooks.getDriver(), Duration.ofSeconds(30)));
		wait.until(ExpectedConditions.visibilityOf(resultat));
		return resultat.isDisplayed();

    }
    
    public String renvoyerResultat()
    {
		WebDriverWait wait = (new WebDriverWait(Hooks.getDriver(), Duration.ofSeconds(30)));
		wait.until(ExpectedConditions.visibilityOf(resultat));

    	return resultat.getText();
    }
    
    public Integer nbResult()
    {
		WebDriverWait wait = (new WebDriverWait(Hooks.getDriver(), Duration.ofSeconds(30)));
		wait.until(ExpectedConditions.visibilityOf(resultat));

    	return vignettes.size();
    }
    public String renvoyerErreur()
    {
		WebDriverWait wait = (new WebDriverWait(Hooks.getDriver(), Duration.ofSeconds(30)));
		wait.until(ExpectedConditions.visibilityOf(erreur));

    	return erreur.getText();
    }
    
      

}
