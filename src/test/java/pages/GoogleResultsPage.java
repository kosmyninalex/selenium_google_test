package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleResultsPage extends BasePage {
    public GoogleResultsPage(WebDriver driver) {
        super(driver);
    }

    // Receiving the location of the first non-advert google results page webelement
    By firstElementsLinkInGoogleSearch = By.xpath("//*[@class=\"r\"]/a");

    // method for getting the non-advert hyperlink in Google search results
    public String getFirstReferenceInResults ()
    {
        return getHyperlink(firstElementsLinkInGoogleSearch);
    }

}
