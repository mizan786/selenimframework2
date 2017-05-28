package bankingpage;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.reporting.TestLogger;

import java.util.List;

/**
 * Created by Mizan on 5/20/2017.
 */
public class BankingPage extends CommonAPI {

    @FindBy(how = How.CSS, using = "#banking")
    public static WebElement banking;

    @FindBy(how = How.CSS, using = "#stateSelectorSelectId")
    public  static WebElement element;
    @FindBy(how = How.CSS, using = ".modal-footer-inner")
    public  static WebElement selectOption;
    @FindBy(how = How.CSS, using = "#cmlink_ProdDisp")
    public static WebElement bankingOverView;
    public static WebElement getBanking() {
        return banking;
    }
    public static WebElement getSelectOption() {
        return selectOption;
    }
    public static WebElement getBankingOverView() {
        return bankingOverView;
    }
    public static void goTobankingPage() {
        getBanking().click();
    }
    public void selectFromDropdownMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getBanking().click();
        selectOptionByVisibleText(element, "NY");
        element.click();
        }
    public  void goToBankingOverview() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getBanking().click();
        selectOptionByVisibleText(element, "NY");
        element.click();
        getSelectOption().click();
    }
}
