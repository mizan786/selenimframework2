package search;

import base.CommonAPI;
import utility.reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mizan on 5/16/2017.
 */

public class DropDownMenuPage extends CommonAPI {
    public List<String> getMenus(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> items = new ArrayList<String>();
        items = getTextFromWebElements(".ui-selectmenu-icon ui-icon ui-icon-triangle-1-s");
        return items;
    }

    public void typeOnInputSearch(List<String> data)throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        for(int i=0; i<5; i++) {
            typeByCss("#RegionalPricingLocation-snapshot-menu-option-41", data.get(i));
            input();
            sleepFor(2);
            clearBox();
        }
    }

    public void input() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        keysInput("RegionalPricingLocation-snapshot-menu-option-42");
    }
    public void clearBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clearInput("#RegionalPricingLocation-snapshot-menu-option-43");
    }

    public void dropDownSearch()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> items = getMenus();
        typeOnInputSearch(items);
    }
}
