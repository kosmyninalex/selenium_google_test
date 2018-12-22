package test;

import org.testng.annotations.Test;
import pages.GoogleHomePage;
import pages.GoogleResultsPage;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class GoogleHomeTest extends BaseTest {
    String valueToSearch = "yandex.ru";

    @Test (priority = 0)

    public void searchTestGoogleHomePage ()
    {
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);

        googleHomePage.goToGoogleHomePage();
        googleHomePage.GoogleSendTextToInput(valueToSearch);
        googleHomePage.searchGoogleForInput();
    }

    @Test (priority = 1)
    public void checkResultingPage ()
    {
        GoogleResultsPage googleResultsPage = new GoogleResultsPage(driver);
        String resHref = googleResultsPage.firstReferenceInResults(valueToSearch);

        assertTrue(resHref.endsWith("yandex.ru"));
       // assertEquals(resHref, "yande.xru");
    }

}
