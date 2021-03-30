import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class YouTubeSearchPage extends YouTube {

    By filterButton = By.xpath("//yt-formatted-string[text()='Фільтрувати']/ancestor::a");
    By filerHeadings = By.xpath("//iron-collapse[@id='collapse']//h4");

    public YouTubeSearchPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getFiltersByHeadings(String heading){
        String xPath = String
                .format("//yt-formatted-string[text()='%s']/../following-sibling::ytd-search-filter-renderer", heading);
        return driver.findElements(By.xpath(xPath));
    }
}
