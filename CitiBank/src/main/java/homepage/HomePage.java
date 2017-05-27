package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by Mizan on 5/16/2017.
 */
public class HomePage extends CommonAPI {
    @FindBy(how = How.CSS, using = "#InLocationFinderID")
    public static WebElement searchInput;
    @FindBy(how = How.CSS, using = "#BtnLocationFinder")
    public static WebElement gobutoon;


    @FindBy(how = How.CSS, using = "#subnav_inner li:nth-child(1)")
    public static WebElement creditCardLink;
    @FindBy(how = How.CSS, using = "#subnav_inner li:nth-child(2)")
    public static WebElement bankingLink;
    @FindBy(how = How.CSS, using = "#subnav_inner li:nth-child(3)")
    public static WebElement lendingLink;
    @FindBy(how = How.CSS, using ="#subnav_inner li:nth-child(4)")
    public static WebElement investingLink;
    @FindBy(how = How.CSS, using = "#subnav_inner li:nth-child(5)")
    public static WebElement citygoldLink;



    public static WebElement getCreditCardLink()
    {
        return creditCardLink;
    }
    public static WebElement getBankingLink()
    {
        return bankingLink;
    }
    public static WebElement getLendingLink(){
        return lendingLink;
    }
    public static WebElement getInvestingLink() {
        return investingLink;
    }
    public static WebElement getCitygoldLink() {
        return citygoldLink;
    }
    public void searchAtm(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchInput.sendKeys("Astoria");
        gobutoon.click();
    }
    public  void goToCreditCardSection() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCreditCardLink();
    }
    public void goToBankingSection() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getBankingLink().click();
    }
    public void goToInvestmentSection() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getBankingLink().click();
    }
    public void goToLandingSection(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLendingLink().click();
    }
    public void goToCitiGoldSection(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCitygoldLink().click();
    }
}

