package bmwBasePckg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BmwBase {

    public static WebDriver driver;
    public static final String URL_BMW = "https://www.bmw.com";

    @BeforeSuite
    public static void beforeSuite(){

    }

    @BeforeClass
    public static void beforeClass(){

    }

    @BeforeMethod
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get(URL_BMW);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterMethod
    public static void tearDown(){
        driver.close();
        driver.quit();
    }

    @AfterClass
    public static void afterClass(){

    }

    @AfterSuite
    public static void afterSuite(){

    }
}
