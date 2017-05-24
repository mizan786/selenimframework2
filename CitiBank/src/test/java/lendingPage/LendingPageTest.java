package lendingPage;

import base.CommonAPI;
import landingpage.LendingPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Mizan on 5/21/2017.
 */
public class LendingPageTest extends CommonAPI {
    @Test
    public void personalLoanAndLineOfCredit() {
        LendingPage lendingPage = PageFactory.initElements(driver, LendingPage.class);
        lendingPage.personalLoanAndLineOfCredit();
    }

    @Test
    public void homeOwnershio() {
        LendingPage lendingPage = PageFactory.initElements(driver, LendingPage.class);
        lendingPage.homeOwnership();
    }
}
