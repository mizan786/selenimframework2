package whycitibank;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.xml.ws.Service;

/**
 * Created by Mizan on 5/18/2017.
 */
public class WhyCitiBank extends CommonAPI {

    @FindBy(how = How.CSS, using = "#whyCiti li:nth-child(1)")
    public static WebElement ourStoryLink;
    @FindBy(how = How.CSS, using = "#whyCiti li:nth-child(2)")
    public static WebElement careerLink;
    @FindBy(how = How.CSS, using = "#whyCiti li:nth-child(3)")
    public static WebElement benifitAndServicesLink;
    @FindBy(how = How.CSS, using = "#whyCiti li:nth-child(4)")
    public static WebElement rewardsLink;
    @FindBy(how = How.CSS, using = "#whyCiti li:nth-child(5)")
    public static WebElement citiEasyDealsLink;
    @FindBy(how = How.CSS, using = "#whyCiti li:nth-child(6)")
    public static WebElement citiPrivateLink;
    @FindBy(how = How.CSS, using = "#whyCiti li:nth-child(7)")
    public static WebElement speacialOfferLink;

    public static WebElement getOurStoryLink() {
        return ourStoryLink;
    }

    public static WebElement getCareerLink() {
        return careerLink;
    }

    public static WebElement getBenifitAndServicesLink() {

        return benifitAndServicesLink;
    }

    public static WebElement getRewardsLink() {
        return rewardsLink;
    }

    public static WebElement getCitiEasyLink() {
        return citiEasyDealsLink;
    }

    public static WebElement getCitiPrivateLink() {
        return citiPrivateLink;
    }

    public static WebElement getSpeacialOfferLink() {
        return speacialOfferLink;
    }

    public static void goToOurStorySection() {
        getOurStoryLink().click();
    }
    public static void goToCareeSection(){
        getOurStoryLink().click();
    }

    public static void goToBenefitAndServicesSection(){
        getBenifitAndServicesLink().click();
    }

    public static void goToRewardSection(){
        getRewardsLink().click();
    }

    public static void goToCitiEasyDealsSection(){
        getCitiEasyLink().click();
    }

    public static void goToCitiPrivatePassSection(){
        getCitiPrivateLink().click();
    }

    public static void goToSpeacialOffersSection(){
        getSpeacialOfferLink().click();
    }
}

