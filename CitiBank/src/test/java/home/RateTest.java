package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import rates.Rates;
import utility.reporting.TestLogger;

/**
 * Created by Mizan on 5/19/2017.
 */
public class RateTest extends CommonAPI {
    @Test
    public void personalBanking() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Rates rates = PageFactory.initElements(driver, Rates.class);
        rates.goToPersonalBanking();
    }
    @Test
    public void creditCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Rates rates = PageFactory.initElements(driver, Rates.class);
        rates.goToCrecard();
    }
    @Test
    public void mortgage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Rates rates = PageFactory.initElements(driver, Rates.class);
        rates.goToMortgage();
    }
    @Test
    public void homeEquity() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Rates rates = PageFactory.initElements(driver, Rates.class);
        rates.goToHomeEquity();
    }
    @Test
    public void lending() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Rates rates = PageFactory.initElements(driver, Rates.class);
        rates.goToLending();
    }
}