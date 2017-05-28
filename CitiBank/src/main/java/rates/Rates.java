package rates;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Mizan on 5/19/2017.
 */
public class Rates extends CommonAPI {
    @FindBy(how = How.CSS, using = ".col-xs-2 li:nth-child(1)")
    public static WebElement personalBanking;
    @FindBy(how = How.CSS, using = ".col-xs-2 li:nth-child(2)")
    public static WebElement creditCard;
    @FindBy(how = How.CSS, using = "a[onclick='lnk(this.href);return false;']")
    public static WebElement mortgage;
    @FindBy(how = How.CSS, using = ".col-xs-2 li:nth-child(4)")
    public static WebElement homeEquity;
    @FindBy(how = How.CSS, using = "a[onclick='lnk(this.href);return false;']")
    public static WebElement lending;

    public static WebElement getPersonalBanking() {
        return personalBanking;
    }
    public static WebElement getCreditCard() {
        return creditCard;
    }
    public static WebElement getMortgage() {
        return mortgage;
    }
    public static WebElement getHomeEquity() {
        return homeEquity;
    }
    public static WebElement getLending() {
        return lending;
    }
    public static void goToPersonalBanking(){
        getPersonalBanking().click();
    }
    public static void goToCrecard(){
        getCreditCard().click();
    }
    public static void goToMortgage(){
        getMortgage().click();
    }
    public static void goToHomeEquity(){
        getHomeEquity().click();
    }
    public static void goToLending(){
        getLending().click();
    }
}
