package searchitems;
import base.CommonAPI;
import datasource.DatabaseDataReader;
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
public class SearchItemsWithDatabaseDataSource extends CommonAPI {
    @Test
    public void searchItemsWithDB()throws Exception, InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DatabaseDataReader databaseDataReader = PageFactory.initElements(driver, DatabaseDataReader.class);
        databaseDataReader.dataFromDatabase();
    }

}
