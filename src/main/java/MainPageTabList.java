import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageTabList extends BasePage {

    @FindBy(xpath = "//a[@title='Головна' and @role='tablist']")
    WebElement mainTabElement;
    public By tabMain = By.xpath("//a[@title='Головна' and @role='tablist']");
    private By tabPopular = By.xpath("//a[@title='Популярне' and @role='tablist']");
    private By tabSubscriptions = By.xpath("//a[@title='Підписки' and @role='tablist']");
    private By tabLibrary = By.xpath("//a[@title='Бібліотека' and @role='tablist']");
    private By tabHistory = By.xpath("//a[@title='Історія' and @role='tablist']");
    private By tabYourVideo = By.xpath("//a[@title='Ваші відео' and @role='tablist']");
    private By tabWatchLater = By.xpath("//a[@title='Переглянути пізніше' and @role='tablist']");
    private By tabLikeVideo = By.xpath("//a[@title='Відео, які сподобалися' and @role='tablist']");

    public MainPageTabList(WebDriver driver) {
        super(driver);
    }


    public void clickOnTabMain(){
        driver.findElement(tabHistory).click();
    }

}
