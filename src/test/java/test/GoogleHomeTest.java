package test;

import org.testng.annotations.Test;
import pages.GoogleHomePage;

public class GoogleHomeTest extends BaseTest {
    @Test (priority = 0)

    public void searchTestGoogleHomePage ()
    {
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);

        googleHomePage.goToGoogleHomePage();
        googleHomePage.GoogleSendTextToInput("yandex.ru");
        googleHomePage.searchGoogleForInput();
    }

}
