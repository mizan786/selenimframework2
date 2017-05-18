package politics;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Mizan on 5/14/2017.
 */
public class PoliticsPage extends CommonAPI {
    public void politicsPageNews(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.goToPolitics();
    }

}
