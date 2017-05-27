package searchitems;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.DropDownMenuPage;
import utility.reporting.ApplicationLog;
import utility.reporting.TestLogger;

/**
 * Created by Mizan on 5/26/2017.
 */
public class DropDownMenuSearch extends CommonAPI {
    @Test
    public void searchMenu()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenuPage dropDownMenuPage = PageFactory.initElements(driver, DropDownMenuPage.class);
        dropDownMenuPage.dropDownSearch();
    }
}
