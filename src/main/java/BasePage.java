import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
    }

    public void click(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    public void isElementDisplayed(By elementBy) {
        waitVisibility(elementBy);
        Assert.assertTrue(driver.findElement(elementBy).isDisplayed());
    }

    public void isElementNotDisplayed(By elementBy) {
        driver.findElement(elementBy);
        wait.until(ExpectedConditions
                .presenceOfAllElementsLocatedBy(By
                .xpath("//*[@id='columns']//div[@id='items']/ytd-compact-video-renderer")));
        Assert.assertFalse(driver.findElement(elementBy).isDisplayed());
    }
}
