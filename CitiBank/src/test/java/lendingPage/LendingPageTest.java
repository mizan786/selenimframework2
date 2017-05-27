package lendingPage;

import base.CommonAPI;
import landingpage.LendingPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.TestLogger;

/**
 * Created by Mizan on 5/21/2017.
 */
public class LendingPageTest extends CommonAPI {
    @Test
    public void personalLoanAndLineOfCredit() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        LendingPage lendingPage = PageFactory.initElements(driver, LendingPage.class);
        lendingPage.personalLoanAndLineOfCredit();
    }

    @Test
    public void homeOwnershio() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        LendingPage lendingPage = PageFactory.initElements(driver, LendingPage.class);
        lendingPage.homeOwnership();
    }
}
