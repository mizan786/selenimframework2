package search;

import base.CommonAPI;
import creditcard.CreditcardPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.TestLogger;

/**
 * Created by Mizan on 5/19/2017.
 */
public class CreditCardPageTest extends CommonAPI {
    @Test
     public void creditCardLogIn(){
         TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
         creditcardPage.logIn();
     }
     @Test
     public void forgetUserIdAndPassword() {
         TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
         creditcardPage.forgetUserIdOrPassword();
     }
     @Test
     public void forgetUserIdAndPasswordInSpanish() {
         TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
         creditcardPage.forgetUserIdOrPasswordInSpanish();
     }
     @Test
     public void activateNewCreditCards() {
         TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
         creditcardPage.activateYourCard();
     }
     @Test
     public void register() {
         TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
         creditcardPage.registernow();
     }
     @Test
     public void allCreditcards(){
         TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
         creditcardPage.goToAllCreditCards();
     }
    @Test
    public void lowInterestCreditcards() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
        creditcardPage.goToLowInterestCreditCards();
    }
    @Test
    public void rewardCreditcards() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
        creditcardPage.goToRewardCreditCards();
    }
    @Test
    public void travelcards() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
        creditcardPage.goToTravelCards();
    }
    @Test
    public void cashBackAndSavingscards() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
        creditcardPage.goToCashBackAndSavingsCards();
    }
    @Test
    public void balanceTransferCreditCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
        creditcardPage.goToBalanceTransferCreditCards();
    }
    @Test
    public void businessCreditCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
        creditcardPage.goToBusinessCreditCards();
    }
    @Test
    public void securedCreditCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
        creditcardPage.goToSecuredCreditCards();
    }
}
