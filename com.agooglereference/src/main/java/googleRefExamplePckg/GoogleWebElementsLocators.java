package googleRefExamplePckg;

public class GoogleWebElementsLocators {


    /*
        ---> Elements related to search:
     */
    //Search bar on homepage, located by: CSS
    public static final String webElementSearchBar = ".a4bIc > input[role='combobox']";
    //Google search button on homepage, located by: CSS
    public static final String webElementSearchButton = ".UUbT9 input[name='btnK']";
    //Alternate search button (I'm Feeling Lucky) on homepage, located by: CSS
    public static final String webElementImFeelingLuckyButton = ".UUbT9 input[name='btnI']";
    //Mic option inside search bar to search, located by: XPATH
    public static final String webElementMicButton = "//*[@class='HPVvwb']";

    /*
        ---> Elements on the homepage:
     */
    //Google image on homepage, located by: CSS
    public static final String webElementGoogleImageOnHomepage = "img[alt='Google']";

    /*
        ---> Navigation links on homepage:
     */
    //"About" link on the homepage, located by: XPATH
    public static final String webElementAboutLink = "//a[contains(text(),'About')]";
    //"Store" link on the homepage, located by: XPATH
    public static final String webElementStoreLink = "//a[contains(text(),'Store')]";
    //"Gmail" link on the homepage, located by: XPATH
    public static final String webElementGmailLink = "//a[contains(text(),'Gmail')]";
    //"Images" link on the homepage, located by: XPATH
    public static final String webElementImagesLink = "//a[contains(text(),'Images')]";

}
