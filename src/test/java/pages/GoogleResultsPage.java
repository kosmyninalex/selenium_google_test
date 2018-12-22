package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleResultsPage extends BasePage {
    public GoogleResultsPage(WebDriver driver) {
        super(driver);
    }

    public String firstReferenceInResults (String searchVal)
    {
       // String href = element.getAttribute("href");
      //  return driver.findElement(By.xpath("//*[@class=\"r\"]/a")).getText();
        return driver.findElement(By.xpath("//*[@class=\"r\"]/a")).getAttribute("href");
    }

}
