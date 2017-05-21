package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.TestLogger;
import whycitibank.WhyCitiBank;

/**
 * Created by Mizan on 5/18/2017.
 */
public class WhyCitiBankTest extends CommonAPI {
    @Test
    public void ourStory(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WhyCitiBank citiBank = PageFactory.initElements(driver, WhyCitiBank.class);
        citiBank.goToOurStorySection();
    }
    @Test
    public void careers(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WhyCitiBank citiBank = PageFactory.initElements(driver, WhyCitiBank.class);
        citiBank.goToCareeSection();
    }
    @Test
    public void benefitAndServices(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WhyCitiBank citiBank = PageFactory.initElements(driver, WhyCitiBank.class);
        citiBank.goToBenefitAndServicesSection();
    }
    @Test
    public void rewards(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WhyCitiBank citiBank = PageFactory.initElements(driver, WhyCitiBank.class);
        citiBank.goToRewardSection();
    }
    @Test
    public void citiEasyDeals(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WhyCitiBank citiBank = PageFactory.initElements(driver, WhyCitiBank.class);
        citiBank.goToCitiEasyDealsSection();
    }
    @Test
    public void citiPrivatePass(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WhyCitiBank citiBank = PageFactory.initElements(driver, WhyCitiBank.class);
        citiBank.goToCitiPrivatePassSection();
    }
    @Test
    public void speacialOffer(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WhyCitiBank citiBank = PageFactory.initElements(driver, WhyCitiBank.class);
        citiBank.goToSpeacialOffersSection();
    }
  }
