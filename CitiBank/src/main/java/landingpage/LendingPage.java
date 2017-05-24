package landingpage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by Mizan on 5/21/2017.
 */
public class LendingPage extends CommonAPI {
    @FindBy(how = How.CSS, using = "#lending")
    public static WebElement lending;
    @FindBy(how = How.CSS, using = ".sia-nav_submenu li:nth-child(1)")
    public static WebElement personalLoanAndLineOfCredit;
    @FindBy(how = How.CSS, using = ".sia-nav_submenu li:nth-child(2)")
    public static WebElement homeOwnership;


    public static WebElement getLending() {
        return lending;
    }

    public static WebElement getPersonalLoanAndLineOfCredit() {
        return personalLoanAndLineOfCredit;
    }

    public static WebElement getHomeOwnership() {
        return homeOwnership;
    }

    public void personalLoanAndLineOfCredit(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLending().click();
        getPersonalLoanAndLineOfCredit().click();
     }
     public  void homeOwnership(){
         TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLending().click();
        getHomeOwnership().click();
     }
}
