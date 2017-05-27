package searchitems;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.ItemsToBeSearched;
import search.SearchPage;
import utility.reporting.ApplicationLog;
import utility.reporting.TestLogger;

import java.io.IOException;

/**
 * Created by Mizan on 5/26/2017.
 */
public class SearchItems extends CommonAPI {
    @Test
    public void search() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.getDataFromExcelFileAndSearch();
    }
}

