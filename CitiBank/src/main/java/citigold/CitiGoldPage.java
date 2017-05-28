package citigold;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Mizan on 5/27/2017.
 */
public class CitiGoldPage extends CommonAPI {
    @FindBy(how = How.CSS, using = "a[onclick='lnk(this.href);return false;']")
    public static WebElement citiGold;
    @FindBy(how = How.CSS, using = "a[title='for Citigold']")
    public static WebElement beginyourRelationShip;
    public static WebElement getCitiGold() {
        return citiGold;
    }
    public static WebElement getBeginyourRelationShip() {
        return beginyourRelationShip;
    }
    public void goToBeginYourRelationship(){
        getCitiGold().click();
       }
}
