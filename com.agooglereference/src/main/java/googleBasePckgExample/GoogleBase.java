package googleBasePckgExample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

// This is the BASE class that will be extended by the "Homepage" class AND the "Test" class..
public class GoogleBase {

    public static WebDriver driver;
    public static final String URL_GOOGLE = "https://www.google.com";

    // This will run before the entire suite
    @BeforeSuite
    public static void beforeSuite(){

    }

    // This will run before every Class WITH test cases
    @BeforeClass
    public static void beforeClass(){

    }

    //This will run before every Methods with a test case
    @BeforeMethod
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get(URL_GOOGLE);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    //This will run after every Methods with a test case
    @AfterMethod
    public static void tearDown() throws InterruptedException {
        Thread.sleep(5000);

        driver.close();
        driver.quit();
    }

    // This will run after every Class WITH test cases
    @AfterClass
    public static void afterClass(){

    }

    // This will run after the entire suite
    @AfterSuite
    public static void afterSuite(){

    }
}
