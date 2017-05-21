package bankingpage;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Mizan on 5/20/2017.
 */
public class BankingPage extends CommonAPI {

    @FindBy(how = How.CSS, using = "#banking")
    public static WebElement banking;
    @FindBy(how = How.CSS, using = "#Banking Overview")
    public static WebElement bankingOverView;
    @FindBy(how = How.CSS, using = "#cmlink_ProdDisp")
    public static WebElement citiGoldAccountPackage;
    @FindBy(how = How.CSS, using = "#Citi Priority Account Package")
    public static WebElement citiPriorityAccountPackage;

    public static WebElement getBanking() {
        return banking;
    }
    public static WebElement getBankingOverView() {
        return bankingOverView;
    }
    public static WebElement getCitiGoldAccountPackage() {
        return citiGoldAccountPackage;
    }
    public static WebElement getCitiPriorityAccountPackage() {
        return citiPriorityAccountPackage;
    }
    public static void goTobankingPage() {
        getBanking().click();
    }
    public static void goToBankingOverview() {
        getBanking().click();
        getBankingOverView().click();
    }
    public static void priorityAccountPackage() {
        getBanking().click();
        getCitiPriorityAccountPackage().click();
    }
    public static void goldAccountPackage() {
        getBanking().click();
        getCitiGoldAccountPackage().click();
    }
}
