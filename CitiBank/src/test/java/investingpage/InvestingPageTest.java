package investingpage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.TestLogger;

/**
 * Created by Mizan on 5/21/2017.
 */
public class InvestingPageTest extends CommonAPI {

    @Test
    public void insightsAndTools(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        InvestingPage investingPage = PageFactory.initElements(driver, InvestingPage.class);
        investingPage.insightsAndTools();
    }
    @Test
    public void marketInsights(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        InvestingPage investingPage = PageFactory.initElements(driver, InvestingPage.class);
        investingPage.goToMarketInsights();
    }
}
