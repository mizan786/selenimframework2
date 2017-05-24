package creditcard;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.TestLogger;

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
    @FindBy(how = How.CSS, using = "#cmlink_SpanishSignon")
    public static WebElement forgetUserIdOrAnPaswardInSpanish;
    @FindBy(how = How.CSS, using = "#cmlink_ActivateANewCard")
    public static WebElement activateYourCard;
    @FindBy(how = How.CSS, using = "#cmlink_Register_DD")
    public static WebElement resigterNow;
    @FindBy(how = How.CSS, using = "#cA-DD-cardCategory")
    public static WebElement element;
    @FindBy(how = How.CSS, using = "#cA-DD-tabbar-card-selector-extend li:nth-child(1)")
    public static WebElement allCreditCards;
    @FindBy(how = How.CSS, using = "#cA-DD-tabbar-card-selector-extend li:nth-child(2)")
    public static WebElement lowInterestCreditCards;
    @FindBy(how = How.CSS, using = "#cA-DD-tabbar-card-selector-extend li:nth-child(3)")
    public static WebElement rewardsCreditCards;
    @FindBy(how = How.CSS, using = "#cA-DD-tabbar-card-selector-extend li:nth-child(4)")
    public static WebElement travelCards;
    @FindBy(how = How.CSS, using = "#cA-DD-tabbar-card-selector-extend li:nth-child(5)")
    public static WebElement cashBackandSavingsCards;
    @FindBy(how = How.CSS, using = "#cA-DD-tabbar-card-selector-extend li:nth-child(6)")
    public static WebElement balanceTransferCreditCards;
    @FindBy(how = How.CSS, using = "#cA-DD-tabbar-card-selector-extend li:nth-child(7)")
    public static WebElement businessCreditCards;
    @FindBy(how = How.CSS, using = "#cA-DD-tabbar-card-selector-extend li:nth-child(8)")
    public static WebElement securedCreditCards;

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

    public static WebElement getForgetUserIdOrAnPaswardInSpanish() {
        return forgetUserIdOrAnPaswardInSpanish;
    }

    public static WebElement getActivateYourCard() {
        return activateYourCard;
    }

    public static WebElement getResigterNow() {
        return resigterNow;
    }

    public void logIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCreditCards().click();
        getUsername().sendKeys("mizan123");
        getPassword().sendKeys("123m65");
        getLogin().click();
    }

    public void forgetUserIdOrPassword() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCreditCards().click();
        getForgetUserIdOrAnPasward().click();
    }

    public void forgetUserIdOrPasswordInSpanish() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCreditCards().click();
        getForgetUserIdOrAnPaswardInSpanish().click();
    }
    public void activateYourCard() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCreditCards().click();
        getActivateYourCard().click();
    }
    public void registernow() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCreditCards().click();
        getResigterNow().click();
    }
    public void goToAllCreditCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCreditCards().click();
        element.click();
        allCreditCards.click();
    }
    public void goToLowInterestCreditCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCreditCards().click();
        element.click();
        lowInterestCreditCards.click();
    }
    public void goToRewardCreditCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCreditCards().click();
        element.click();
        rewardsCreditCards.click();
    }
    public void goToTravelCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCreditCards().click();
        element.click();
        travelCards.click();
    }
    public void goToCashBackAndSavingsCards() {
        getCreditCards().click();
        element.click();
        cashBackandSavingsCards.click();
    }
    public void goToBalanceTransferCreditCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCreditCards().click();
        element.click();
        balanceTransferCreditCards.click();
    }
    public void goToBusinessCreditCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCreditCards().click();
        element.click();
        businessCreditCards.click();

    }
    public void goToSecuredCreditCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCreditCards().click();
        element.click();
        securedCreditCards.click();
    }

}