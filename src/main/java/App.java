import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class App {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:/List_of_jar/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
            driver.get("https://www.youtube.com/");
            driver.manage().window().maximize();
            YouTube youTube = new YouTube(driver);
            YouTubeMainPage mainPage = new YouTubeMainPage(driver);
            YouTubeSearchPage searchPage = mainPage.enterSearchingWord("automation").clickSearchButton();
            System.out.println(driver.getCurrentUrl());
            System.out.println(driver.getTitle());
        System.out.println("----><----");
        List<WebElement> listFilters = searchPage
                .getFiltersByHeadings("Характеристики");
            for (WebElement element: listFilters) {
                System.out.println(element.getText());
            }
    }
}
