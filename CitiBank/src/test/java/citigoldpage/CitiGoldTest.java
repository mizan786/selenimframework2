package citigoldpage;

import base.CommonAPI;
import citigold.CitiGoldPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Mizan on 5/27/2017.
 */
public class CitiGoldTest extends CommonAPI {
    @Test
    public void beginYourRelationship(){
        CitiGoldPage citiGoldPage = PageFactory.initElements(driver, CitiGoldPage.class);
        citiGoldPage.goToBeginYourRelationship();
    }
}
