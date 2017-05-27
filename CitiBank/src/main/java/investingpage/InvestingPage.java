package investingpage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by Mizan on 5/21/2017.
 */
public class InvestingPage extends CommonAPI {

    @FindBy(how = How.CSS, using = "#investing")
    public static WebElement investing;
    @FindBy(how = How.CSS, using = ".sia-nav_submenu li:nth-child(1)")
    public static WebElement yourFinancialGoal;
   @FindBy(how = How.CSS, using = ".sia-nav_submenu li:nth-child(2)")
    public static WebElement investingWithCiti;
    @FindBy(how = How.CSS, using = ".sia-nav_submenu li:nth-child(3)")
    public static WebElement insightAndTools;
    @FindBy(how = How.CSS, using = "#MarketInsights")
    public static WebElement marketInsights;

    public static WebElement getInvesting() {
        return investing;
    }
    public static WebElement getYourFinancialGoal() {
        return yourFinancialGoal;
    }

    public static WebElement getInvestingWithCiti() {
        return investingWithCiti;
    }

    public static WebElement getInsightAndTools() {
        return insightAndTools;
    }
    public void insightsAndTools() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       investing.click();
       insightAndTools.click();

    }
    public void goToMarketInsights(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        investing.click();
        insightAndTools.click();
       }
}


