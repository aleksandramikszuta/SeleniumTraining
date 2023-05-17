package Pages;

import base.BrowserDriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class BasePage {

    public static Integer WAIT=5;
    public WebDriver driver;

    public void openUrl(String url){
        driver.get(url);
    }

    BasePage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    protected void click(By locator) {
        waitForVisibilityOf(locator, WAIT);
        click(find(locator));
    }

    protected void  click(WebElement element) {
        Actions builder = new Actions(driver);
        builder.moveToElement(element).click().build().perform();
    }

    protected void waitFor(ExpectedCondition<WebElement> condition, Duration duration){
        FluentWait wait = new FluentWait(driver).withTimeout(duration);
        wait.pollingEvery(Duration.ofSeconds(1));
        wait.until(condition);
    }

    protected void waitForVisibilityOf(By locator, Integer waitingTime){
        waitFor(ExpectedConditions.visibilityOfElementLocated(locator), Duration.ofSeconds(waitingTime));
    }

    protected void type(String text, By locator) {
        waitForVisibilityOf(locator, 5);
        find(locator).sendKeys(text);
    }

    protected void scrollDown() {
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
    }

    protected void assertTextEquals(By locator, String text) {
        waitForVisibilityOf(locator, 5);
        assertEquals(find(locator).getText(), text);
    }
}
