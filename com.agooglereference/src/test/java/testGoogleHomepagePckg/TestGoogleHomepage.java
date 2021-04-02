package testGoogleHomepagePckg;

import googleBasePckgExample.GoogleBase;
import googleRefExamplePckg.GoogleHomepage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;


// This test class would EXTEND the BASE class and all test cases would go in THIS test class.
public class TestGoogleHomepage extends GoogleBase {

    GoogleHomepage googleHomepage;

    // First test case to search for a text using the "Google Search" button:
    @Test
    public void testTextSearchWithGoogleSearchButton(){
        googleHomepage = new GoogleHomepage();

        googleHomepage.searchByGoogleSearch("Furqan Javed");

        String actualPageTitle = driver.getTitle().toLowerCase();
        String expectedPageTitle = "Furqan Javed - Google Search".toLowerCase();

        Assert.assertEquals(actualPageTitle, expectedPageTitle, "Titles Do NOT match !");
    }

    // Second test case to search for a text using the "I'm Feeling Lucky" button:
    @Test
    public void testTextSearchWithImFeelingButton(){
        googleHomepage = new GoogleHomepage();

        googleHomepage.searchByImFeelingSearch("FuRqan JaveD");

        String actualTextOnPage = driver.findElement(By.xpath("//b[@xpath='1']")).getText().toLowerCase();
        String expectedTextOnPage = "Redirect Notice".toLowerCase();
        Assert.assertEquals(actualTextOnPage, expectedTextOnPage, "Text On Page Do NOT match !");
    }

    // Third test case to validate the "About" link on the homepage:
    @Test
    public void testAboutLink(){
        googleHomepage = new GoogleHomepage();

        googleHomepage.clickOnAboutLink();

        String actualTitleOnHomepage = driver.getTitle();
        String expectedTitleOnHomepage = "Google - About Google, Our Culture & Company News";

        Assert.assertEquals(actualTitleOnHomepage, expectedTitleOnHomepage, "Titles do not match !");
    }

}
