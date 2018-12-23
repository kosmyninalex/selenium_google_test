package test;

import org.testng.annotations.Test;
import pages.GoogleHomePage;
import pages.GoogleResultsPage;
import static org.testng.Assert.assertTrue;

public class GoogleResultsTest extends BaseTest {
    //The value that will be searched during the tests
    String valueToSearch = "yandex.ru";

    @Test (priority = 0)

    public void searchTestGoogleHomePage ()
    {
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);

        googleHomePage.goToGoogleHomePage();
        googleHomePage.sendTextToGoogleInput(valueToSearch);
        GoogleResultsPage googleResultsPage = googleHomePage.searchGoogleForInput();
        //getting the resulting hyperlink of the first non-advert search result
        String firstResHref = googleResultsPage.getFirstReferenceInResults();

        //assert method for verification of link
        assertTrue(firstResHref.equals(valueToSearch) || firstResHref.equals("https://" + valueToSearch + "/") || firstResHref.equals("https://www." + valueToSearch + "/"), "--------First resulting link DOESN'T lead to " + valueToSearch + "----------");
    }
}

