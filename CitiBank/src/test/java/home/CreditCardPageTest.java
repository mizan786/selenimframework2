package home;

import base.CommonAPI;
import creditcard.CreditcardPage;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Mizan on 5/19/2017.
 */
public class CreditCardPageTest extends CommonAPI {
    @Test
     public void creditCardLogIn(){
         CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
         creditcardPage.logIn();
     }
     @Test
     public void forgetUserIdAndPassword() {
         CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
         creditcardPage.forgetUserIdOrPassword();
     }
     @Test
     public void forgetUserIdAndPasswordInSpanish() {
         CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
         creditcardPage.forgetUserIdOrPasswordInSpanish();
     }
     @Test
     public void activateNewCreditCards() {
         CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
         creditcardPage.activateYourCard();
     }
     @Test
     public void register() {
         CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
         creditcardPage.registernow();
     }
     /*@Test
     public void allCreditcards(){
         CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
         creditcardPage.goToAllCreditCards();
     }
    @Test
    public void lowInterestCreditcards() {
        CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
        creditcardPage.goToLowInterestCreditCards();
    }
    @Test
    public void rewardCreditcards() {
        CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
        creditcardPage.goToRewardCreditCards();
    }
    @Test
    public void travelcards() {
        CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
        creditcardPage.goToTravelCards();
    }
    @Test
    public void cashBackAndSavingscards() {
        CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
        creditcardPage.goToCashBackAndSavingsCards();
    }
    @Test
    public void balanceTransferCreditCards() {
        CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
        creditcardPage.goToBalanceTransferCreditCards();
    }
    @Test
    public void businessCreditCards() {
        CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
        creditcardPage.goToBusinessCreditCards();
    }
    @Test
    public void securedCreditCards() {
        CreditcardPage creditcardPage = PageFactory.initElements(driver, CreditcardPage.class);
        creditcardPage.goToSecuredCreditCards();
    }*/
}
