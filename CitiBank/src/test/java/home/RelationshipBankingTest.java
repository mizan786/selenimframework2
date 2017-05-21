package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import relationshipbanking.RelationshipBanking;
import utility.reporting.TestLogger;

/**
 * Created by Mizan on 5/19/2017.
 */
public class RelationshipBankingTest extends CommonAPI {
    @Test
    public void citiPriority(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        RelationshipBanking relationshipBanking = PageFactory.initElements(driver, RelationshipBanking.class);
        relationshipBanking.goToCitiPriority();
    }
    @Test
    public void citiGold(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        RelationshipBanking relationshipBanking = PageFactory.initElements(driver, RelationshipBanking.class);
        relationshipBanking.goToCitiGold();
    }
    @Test
    public void citiPrivateBank(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        RelationshipBanking relationshipBanking = PageFactory.initElements(driver, RelationshipBanking.class);
        relationshipBanking.goToCitiPrivateBank();
    }
    @Test
    public void citiGlobalBanking(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        RelationshipBanking relationshipBanking = PageFactory.initElements(driver, RelationshipBanking.class);
        relationshipBanking.goToCitiGlobalBanking();
    }
}
