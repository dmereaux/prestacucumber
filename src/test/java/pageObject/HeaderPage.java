package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {
    public HeaderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "s")
    private WebElement champRecherche;
    
    public void  lancerUneRecherche(String item)
    {
		champRecherche.sendKeys(item);
		champRecherche.sendKeys(Keys.ENTER);

    }
    public Boolean champRecherchePresent()
    {
    	return champRecherche.isDisplayed();
    }
    

}
