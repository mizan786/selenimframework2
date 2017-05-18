package politics;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Mizan on 5/14/2017.
 */
public class Politics extends CommonAPI {
    @Test
    public void politicsNews(){
        PoliticsPage politicsPage = PageFactory.initElements(driver, PoliticsPage.class);
        politicsPage.politicsPageNews();
    }
}
