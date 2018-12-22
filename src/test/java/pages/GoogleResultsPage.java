package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleResultsPage extends BasePage {
    public GoogleResultsPage(WebDriver driver) {
        super(driver);
    }

    public String firstReferenceInResults (String searchVal)
    {
        return driver.findElement(By.xpath("//*[@class=\"r\"]/a")).getText();
    }

}
