package businessbanking;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Mizan on 5/19/2017.
 */
public class BusinessBanking extends CommonAPI {
    @FindBy(how = How.CSS, using = ".col-xs-2 li:nth-child(1)")
    public static WebElement smallBusunessAccount;
    @FindBy(how = How.CSS, using = ".col-xs-2 li:nth-child(2)")
    public static WebElement commercialAccount;

    public static WebElement getSmallBusunessAccount() {
        return smallBusunessAccount;
    }

    public static WebElement getCommercialAccount() {
        return commercialAccount;
    }
    public static void goToSmallBusinessAccount(){
        getSmallBusunessAccount().click();
    }
    public static void goToCommercialAccount(){
        getCommercialAccount().click();
    }
}
