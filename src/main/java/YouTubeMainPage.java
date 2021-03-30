import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YouTubeMainPage extends YouTube {

    @FindBy(xpath = "//input[@id='search']")
    WebElement searchField;

    By recommendText = By.xpath("//*[@id='grid-title']/span");

    public YouTubeMainPage(WebDriver driver) {
        super(driver);
    }

    public YouTubeMainPage enterSearchingWord(String text){
        searchField.sendKeys(Keys.chord(Keys.LEFT_SHIFT, text));
        return this;

    }
    public YouTubeSearchPage clickSearchButton(){
        searchField.submit();
        return new YouTubeSearchPage(driver);
    }
    public void checkPageIsCorrect(){
        isElementDisplayed(recommendText);
    }
}
