import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class YouTubeSearchPageTest extends BaseTest{


    private YouTubeSearchPage basicStepsTest(){
        youTubeMainPage.topMarginYouTube.enterTextInFieldAndSubmit("test");
        return youTubeSearchPage;
    }

    @Test
    public void firstTest(){
        basicStepsTest().isElementDisplayed(youTubeSearchPage.filterButton);
//        youTubeMainPage.topMarginYouTube.enterTextInFieldAndSubmit("test")
//                .isElementDisplayed(youTubeSearchPage.filterButton);
    }

    @Test
    public void secondTest(){
        youTubeSearchPage.click(youTubeSearchPage.filterButton);
//        basicStepsTest().click(youTubeSearchPage.filterButton);
//        youTubeMainPage.topMarginYouTube
//                .enterTextInFieldAndSubmit("test").click(youTubeSearchPage.filterButton);
        assertTrue(youTubeSearchPage.getFiltersByHeadings("Тип").size()==5);
    }
    @Test
    public void thirdTest() {
        basicStepsTest().click(By.xpath("//*[@id='contents']/ytd-video-renderer[1]//a[@id='thumbnail']"));
//        youTubeSearchPage.isElementNotDisplayed(youTubeSearchPage.tabList.tabMain);
//        youTubeMainPage.topMarginYouTube.enterTextInFieldAndSubmit("test")
//                .click(By.xpath("//*[@id='contents']/ytd-video-renderer[1]//a[@id='thumbnail']"));
        youTubeSearchPage.isElementNotDisplayed(youTubeSearchPage.tabList.tabMain);
    }
}