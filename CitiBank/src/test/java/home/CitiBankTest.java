package home;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.TestLogger;

/**
 *Created by Mizan on 5/11/2017.
*/
public class CitiBankTest extends CommonAPI {

   @Test
    public void creditCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.goToCreditCardSection();
    }
    @Test
    public void banking() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.goToBankingSection();
    }
     @Test
    public void landing() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.goToLandingSection();
    }
     @Test
    public void investing() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.goToInvestmentSection();
    }
      @Test
    public void citiGold() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.goToCitiGoldSection();
    }
}