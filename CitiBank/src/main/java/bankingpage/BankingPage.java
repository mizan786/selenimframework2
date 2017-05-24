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

import java.util.List;

/**
 * Created by Mizan on 5/20/2017.
 */
public class BankingPage extends CommonAPI {

    @FindBy(how = How.CSS, using = "#banking")
    public static WebElement banking;

    @FindBy(how = How.CSS, using = "#stateSelectorSelectId")
    public  static WebElement element;
    //By locator = By.cssSelector("button[type='button']");
    @FindBy(how = How.CSS, using = ".modal-footer-inner")
    public  static WebElement selectOption;

    @FindBy(how = How.CSS, using = "#cmlink_ProdDisp")
    public static WebElement bankingOverView;
    @FindBy(how = How.CSS, using = "#cmlink_ProdDisp")
    public static WebElement citiGoldAccountPackage;
    @FindBy(how = How.CSS, using = "#Citi Priority Account Package")
    public static WebElement citiPriorityAccountPackage;

    public static WebElement getBanking() {
        return banking;
    }

    public static WebElement getSelectOption() {
        return selectOption;
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




    public  void goToBankingOverview() {
        getBanking().click();
        selectOptionByVisibleText(element, "NY");
        element.click();
        getSelectOption().click();
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
