package home;

import base.CommonAPI;
import org.testng.annotations.Test;


/**
 * Created by Mizan on 5/12/2017.
 */
public class TestMetLife extends CommonAPI {
    @Test
    public void checkAutoInsurance(){
        clickByCss(".homepage-nav__link");
        clickByCss("#insurance_tile-0_content-buttonLink");
        clickByCss("#auto-insurance_first-tile_content-link");
       typeByCss("#zipCode","11373");
       typeByCss("#companyName","Citi Bank");
       clickByCss("#ahL1_quoteBtn");
    }
}
