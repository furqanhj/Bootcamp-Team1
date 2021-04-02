package googleRefExamplePckg;

import googleBasePckgExample.GoogleBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static googleRefExamplePckg.GoogleWebElementsLocators.*;

/*
   - This class will EXTEND the BASE class (so that the constructor used on line 41, will instantiate the elements)
   - Also, this class will have all the helper methods, that would be called upon in the TEST CLASS.
 */
public class GoogleHomepage extends GoogleBase {

    @FindBy (css = webElementSearchBar)
    WebElement searchBar;

    @FindBy (css = webElementSearchButton)
    WebElement searchButton;

    @FindBy (css = webElementImFeelingLuckyButton)
    WebElement imFeelingSearchButton;

    @FindBy (xpath = webElementMicButton)
    WebElement micSearchButton;

    @FindBy (css = webElementGoogleImageOnHomepage)
    WebElement googleImage;

    @FindBy (xpath = webElementAboutLink)
    WebElement aboutLink;

    @FindBy (xpath = webElementStoreLink)
    WebElement storeLink;

    @FindBy (xpath = webElementGmailLink)
    WebElement gmailLink;

    @FindBy (xpath = webElementImagesLink)
    WebElement imagesLink;

    public GoogleHomepage(){
        PageFactory.initElements(driver, this);
    }

    //Helper method 1: To enter text in the search box
    public void enterTextInSearchBar(String keysToSend){
        searchBar.sendKeys(keysToSend);
    }

    //Helper method 2: Clicking the search button
    public void clickSearchButton(){
        searchButton.click();
    }

    //Helper method 3: Clicking the "I'm Feeling Lucky" search button
    public void clickImFeelingButton(){
        imFeelingSearchButton.click();
    }
    //Helper method 4: To search using the mic option
    public void googleSearchWithMic(){

    }

    //Helper method 5: combining method 1 & 2 to search
    public void searchByGoogleSearch(String keysToSend){
        enterTextInSearchBar(keysToSend);
        clickSearchButton();
    }

    //Helper method 6: combining method 1 & 3 to search
    public void searchByImFeelingSearch(String keysToSend){
        enterTextInSearchBar(keysToSend);
        clickImFeelingButton();
    }

    public void clickOnAboutLink(){
        aboutLink.click();
    }
}
