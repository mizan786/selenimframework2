package investingpage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Mizan on 5/21/2017.
 */
public class InvestingPageTest extends CommonAPI {
    /*@Test
    public void yourFinancialGoals(){
        InvestingPage investingPage = PageFactory.initElements(driver, InvestingPage.class);
        investingPage.yourFinacialGoal();
    }
    @Test
    public void investingWithCiti(){
        InvestingPage investingPage = PageFactory.initElements(driver, InvestingPage.class);
        investingPage.investingWithCiti();
    }*/
    @Test
    public void insightsAndTools(){
        InvestingPage investingPage = PageFactory.initElements(driver, InvestingPage.class);
        investingPage.insightsAndTools();
    }
    @Test
    public void marketInsights(){
        InvestingPage investingPage = PageFactory.initElements(driver, InvestingPage.class);
        investingPage.goToMarketInsights();
    }
}
