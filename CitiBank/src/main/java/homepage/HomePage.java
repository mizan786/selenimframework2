package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Mizan on 5/16/2017.
 */
public class HomePage extends CommonAPI {
    @FindBy(how = How.CSS, using = "#primary-nav li:nth-child(1)")
    public static WebElement creditCardLink;
    @FindBy(how = How.CSS, using = "#primary-nav li:nth-child(2)")
    public static WebElement bankingLink;
    @FindBy(how = How.CSS, using = "#primary-nav li:nth-child(3)")
    public static WebElement lendingLink;
    @FindBy(how = How.CSS, using = "#primary-nav li:nth-child(4)")
    public static WebElement investingLink;
    @FindBy(how = How.CSS, using = "#primary-nav li:nth-child(5)")
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
    public static void goToCreditCardSection() {
       getCreditCardLink().click();
    }
    public static void goToBankingSection() {
        getBankingLink().click();
    }
    public static void goToInvestmentSection() {
        getBankingLink().click();
    }
    public static void goToLandingSection(){
        getLendingLink().click();
    }
    public static void goToCitiGoldSection(){
        getCitygoldLink().click();
    }
}

