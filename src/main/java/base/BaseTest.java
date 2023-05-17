package base;


import com.beust.jcommander.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseTest {
    public WebDriver driver = BrowserDriverFactory.CHROME.createDriver();
    public WebDriverWait wait;
    private static Logger logger = LoggerFactory.getLogger(BaseTest.class);
    protected String testSuitName;
    protected String testName;
    protected String testMethodName;


    @FindBy(xpath = "userName")
    WebElement username;



}
