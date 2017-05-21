package banking;

import bankingpage.BankingPage;
import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Mizan on 5/20/2017.
 */
public class BankingPageTest extends CommonAPI {
    @Test
    public void banking(){
        BankingPage bankingPage = PageFactory.initElements(driver, BankingPage.class);
        bankingPage.goTobankingPage();
    }
    @Test
    public void bankingOverview(){
        BankingPage bankingPage = PageFactory.initElements(driver, BankingPage.class);
        bankingPage.goToBankingOverview();
    }
    @Test
    public void goldAccountPackage() {
        BankingPage bankingPage = PageFactory.initElements(driver, BankingPage.class);
        bankingPage.goldAccountPackage();
    }
    @Test
    public void priorityAccountPackage() {
        BankingPage bankingPage = PageFactory.initElements(driver, BankingPage.class);
        bankingPage.priorityAccountPackage();
        }
}
