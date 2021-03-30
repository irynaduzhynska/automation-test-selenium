import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class YouTube extends BasePage {

    public MainPageTabList tabList;
    public TopMarginYouTube topMarginYouTube;

    public YouTube(WebDriver driver) {
        super(driver);
        tabList = PageFactory.initElements(driver, MainPageTabList.class);
        topMarginYouTube = PageFactory.initElements(driver, TopMarginYouTube.class);
    }
}
