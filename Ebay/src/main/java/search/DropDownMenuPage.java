package search;

import base.CommonAPI;
import utility.reporting.TestLogger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mizan on 5/26/2017.
 */
public class DropDownMenuPage extends CommonAPI {
    public List<String> getMenus(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> items = new ArrayList<String>();
        items = getTextFromWebElements("#gh-cat option");

        return items;
    }

    public void typeOnInputSearch(List<String> data)throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        for(int i=0; i<5; i++) {
            typeByCss("#gh-ac", data.get(i));
            input();
            sleepFor(2);
            clearBox();
        }
    }

    public void input() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        keysInput("#gh-ac");
    }
    public void clearBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clearInput("#gh-ac");
    }

    public void dropDownSearch()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> items = getMenus();
        typeOnInputSearch(items);
    }
}
