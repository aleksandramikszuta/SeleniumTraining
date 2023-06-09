package base;


import com.beust.jcommander.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;

public class BaseTest {
    public WebDriver driver = BrowserDriverFactory.CHROME.createDriver();
    public WebDriverWait wait;
    private static Logger logger = LoggerFactory.getLogger(BaseTest.class);
    protected String testSuitName;
    protected String testName;
    protected String testMethodName;

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
