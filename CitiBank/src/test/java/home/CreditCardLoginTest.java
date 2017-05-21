package home;

import base.CommonAPI;
import creditcard.CreditcardPage;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Mizan on 5/19/2017.
 */
public class CreditCardLoginTest extends CommonAPI {
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
}
