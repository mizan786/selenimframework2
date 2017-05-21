package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Mizan on 5/14/2017.
 */
public class HomePage extends CommonAPI {
    @FindBy(how = How.CSS, using = "#menu")
    public static WebElement sectionsMenu;
    @FindBy(how = How.CSS, using = ".nav-flyout__menu-item nav-flyout__menu-item--intl_regions")
    public static WebElement sectionsMenuRegions;
    @FindBy(how = How.CSS, using = ".nav-flyout__menu-item nav-flyout__menu-item--politics")
    public static WebElement sectionsMenuPolitics;
    @FindBy(how = How.CSS, using = ".nav-menu__img-money")
    public static WebElement sectionsMenuMoney;
    @FindBy(how = How.CSS, using = ".nav-menu__img-tech")
    public static WebElement sectionsMenuTech;

    public static WebElement getSectionsMenuWebElement() {
        return sectionsMenu;
    }
    public static WebElement getSectionsMenuRegions() {
        return sectionsMenuRegions;
    }
    public static WebElement getSectionsMenuPolitics() {
        return sectionsMenuPolitics;
    }
    public static WebElement getSectionsMenuMoney() {
        return sectionsMenuMoney;
    }
    public static WebElement getSectionsMenuTech() {
        return sectionsMenuTech;
    }
    public static void clickOnSectionMenu(){
        getSectionsMenuWebElement().click();
    }
    public static void clickOnSectionMenuPolitics(){
        getSectionsMenuPolitics().click();
    }
    public static void goToPolitics(){
        clickOnSectionMenu();
        clickOnSectionMenuPolitics();
    }
}





