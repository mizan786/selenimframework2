package banking;

import bankingpage.BankingPage;
import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.TestLogger;

/**
 * Created by Mizan on 5/20/2017.
 */
public class BankingPageTest extends CommonAPI {
    @Test
    public void dropDownMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       BankingPage bankingPage = PageFactory.initElements(driver, BankingPage.class);
        bankingPage.selectFromDropdownMenu();
    }
    @Test
    public void bankingOverview() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        BankingPage bankingPage = PageFactory.initElements(driver, BankingPage.class);
        bankingPage.goToBankingOverview();
    }
 }
