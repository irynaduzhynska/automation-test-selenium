import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    public YouTubeMainPage youTubeMainPage;
    public YouTubeSearchPage youTubeSearchPage;
    final String URL = "https://www.youtube.com/";


    @BeforeClass
    public void start(){

        System.setProperty("webdriver.chrome.driver","D:/List_of_jar/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\User\\AppData\\Local\\Google\\Chrome SxS\\Application\\chrome.exe");
        options.addArguments("--headless");
        options.addArguments("window-size=1800x900");
        options.setHeadless(true);
        driver = new ChromeDriver(options);
        driver.get(URL);
        driver.manage().window().maximize();
//        wait = new WebDriverWait(driver, 20);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        youTubeMainPage = PageFactory.initElements(driver, YouTubeMainPage.class);
        youTubeSearchPage = PageFactory.initElements(driver, YouTubeSearchPage.class);
    }
    @AfterClass
    public void finish(){
        if (driver!=null){
            driver.quit();
        }
    }
}
