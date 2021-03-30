import org.testng.annotations.Test;

public class YouTubeMainPageTest extends BaseTest {

    @Test
    public void firstTest() throws InterruptedException {
        youTubeMainPage.isElementDisplayed(youTubeMainPage.recommendText);
    }
}
