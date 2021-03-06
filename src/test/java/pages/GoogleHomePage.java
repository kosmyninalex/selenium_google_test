package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage extends BasePage {
    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }


    String baseURL = "https://google.com";

    //location of Google Search button
    By searchGoogleButtonBy = By.name("btnK");

    //location of Google input field
    By searchGoogleInput = By.name("q");

    public GoogleHomePage goToGoogleHomePage ()
    {
        driver.get(baseURL);
        return this;
    }

    public void sendTextToGoogleInput (String text)
    {
        writeText(searchGoogleInput, text);
    }

    public GoogleResultsPage searchGoogleForInput ()
    {
        click (searchGoogleButtonBy);
        return new GoogleResultsPage(driver);
    }
}
