package creditcard;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Mizan on 5/19/2017.
 */
public class CreditcardPage extends CommonAPI {

    @FindBy(how = How.CSS, using = "#creditCards")
    public static WebElement creditCards;
    @FindBy(how = How.CSS, using = "#cA-cardsUseridMasked")
    public static WebElement username;
    @FindBy(how = How.CSS, using = "#PASSWORD")
    public static WebElement password;
    @FindBy(how = How.CSS, using = ".cA-cardsLoginSubmit.cA-DD-singon-buttom")
    public static WebElement login;
    @FindBy(how = How.CSS, using = ".cA-DD-list-links-middle")
    public static WebElement forgetUserIdOrAnPasward;

    public static WebElement getCreditCards() {
        return creditCards;
    }
    public static WebElement getUsername() {
        return username;
    }
    public static WebElement getPassword() {
        return password;
    }
    public static WebElement getLogin() {
        return login;
    }
    public static WebElement getForgetUserIdOrAnPasward() {
        return forgetUserIdOrAnPasward;
    }
    public void logIn(){
       getCreditCards().click();
       getUsername().sendKeys("mizan123");
       getPassword().sendKeys("123m65");
       getLogin().click();
        }
    public void forgetUserIdOrPassword(){
        getCreditCards().click();
        getForgetUserIdOrAnPasward().click();
       }
}
