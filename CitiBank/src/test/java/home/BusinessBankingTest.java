package home;

import base.CommonAPI;
import businessbanking.BusinessBanking;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.TestLogger;

/**
 * Created by Mizan on 5/19/2017.
 */
  public class BusinessBankingTest extends CommonAPI {

    @Test
    public void smallBusinessAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BusinessBanking businessBanking = PageFactory.initElements(driver, BusinessBanking.class);
        businessBanking.goToSmallBusinessAccount();
    }
    @Test
    public void commercialAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BusinessBanking businessBanking = PageFactory.initElements(driver, BusinessBanking.class);
        businessBanking.goToCommercialAccount();

    }
}