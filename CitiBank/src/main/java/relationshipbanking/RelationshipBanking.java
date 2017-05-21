package relationshipbanking;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Mizan on 5/19/2017.
 */
public class RelationshipBanking extends CommonAPI {
    @FindBy(how = How.CSS, using = ".col-xs-2 li:nth-child(1)")
    public static WebElement citiPriority;

    @FindBy(how = How.CSS, using = ".col-xs-2 li:nth-child(2)")
    public static WebElement citiGold;
    @FindBy(how = How.CSS, using = ".col-xs-2 li:nth-child(3)")
    public static WebElement citiPrivateBank;
    @FindBy(how = How.CSS, using = ".col-xs-2 li:nth-child(4)")
    public static WebElement citiGlobalBanking;

    public static WebElement getCitiPriority() {
        return citiPriority;
    }
    public static WebElement getCitiGold() {
        return citiGold;
    }

    public static WebElement getCitiPrivateBank() {
        return citiPrivateBank;
    }
    public static WebElement getCitiGlobalBanking() {
        return citiGlobalBanking;
    }
    public static void goToCitiPriority(){
        getCitiPriority().click();
    }
    public static void goToCitiGold(){
        getCitiGold().click();
    }
    public static void goToCitiPrivateBank(){
        getCitiPrivateBank().click();
    }
    public static void goToCitiGlobalBanking(){
        getCitiGlobalBanking().click();
    }
}
