import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.DemoqaMainPage;
import Pages.ElementsPage;
import base.BaseTest;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
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

public class Demoqatest_test {
    @Test
    public void test2() throws InterruptedException {
        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();

// chromeOptions.addArguments("--headless");

//Wystartuj webdriver typu chrome, ustaw implicit wait i maxwindow
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();

//wystartuj stronę

        driver.get("https://demoqa.com/elements");


        driver.findElement(By.id("item-0")).click();




        FluentWait wait = new FluentWait<>(driver);
        wait.pollingEvery(Duration.ofSeconds(1))
                .withTimeout(Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));

//Zaloguj i sprawdź czy zalogowanie się powiodło
        driver.findElement(By.id("userName")).sendKeys("standard_user");
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.id("userName")).getText().contains("standard_user"));
        driver.quit();
    }
}
