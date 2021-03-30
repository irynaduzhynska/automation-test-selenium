import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMarginYouTube extends  BasePage{

    By searchField = By.xpath ("//input[@id='search']");
    By searchButton = By.cssSelector("#search-icon-legacy");

    public TopMarginYouTube(WebDriver driver) {
        super(driver);
    }
    public YouTubeSearchPage enterTextInFieldAndSubmit(String text) {
        driver.findElement(searchField).clear();
        driver.findElement(searchField).sendKeys(text);
        click(searchButton);
        return new YouTubeSearchPage(driver);
    }
}
