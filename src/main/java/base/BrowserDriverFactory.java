package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;

public enum BrowserDriverFactory {

    CHROME {
        @Override
        public WebDriver createDriver() {
            WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
            ChromeDriver driver = new ChromeDriver(getOptions());
            driver.manage().window().setSize(new Dimension(4096,4096));
            return driver;
        }

        @Override
        public ChromeOptions getOptions() {
            return new ChromeOptions();

        }
    },
    EDGE {
      @Override
      public WebDriver createDriver() {
            WebDriverManager.getInstance(DriverManagerType.EDGE).setup();
            return new EdgeDriver(getOptions());
        }
        @Override
        public EdgeOptions getOptions() {
          return new EdgeOptions();
        }
    };

    public abstract WebDriver createDriver();
    public abstract AbstractDriverOptions<?> getOptions();
}
