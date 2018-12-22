package test;

import org.testng.annotations.Test;
import pages.GoogleHomePage;
import pages.GoogleResultsPage;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class GoogleHomeTest extends BaseTest {
    @Test (priority = 0)

    public void searchTestGoogleHomePage ()
    {
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);

        googleHomePage.goToGoogleHomePage();
        googleHomePage.GoogleSendTextToInput("yandex.ru");
        googleHomePage.searchGoogleForInput();
    }

    @Test (priority = 1)
    public void checkResultingPage ()
    {
        GoogleResultsPage googleResultsPage = new GoogleResultsPage(driver);
        String s = googleResultsPage.firstReferenceInResults("yandex.ru");
        assertEquals ("yandx.ru",googleResultsPage.firstReferenceInResults("yandex.ru"));
    }

}
