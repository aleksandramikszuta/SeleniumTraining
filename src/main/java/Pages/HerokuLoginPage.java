package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class HerokuLoginPage extends BasePage {
    public HerokuLoginPage(WebDriver driver) {
        super(driver);
    }
    By usernameLocator = By.xpath("//label[contains(text(),'Username')]/..//input");
    By passwordLocator = By.xpath("//label[contains(text(),'Password')]/..//input");
    By loginButton = By.xpath("//label[contains(text(),'Password')]/..//../../button");
    public void Login(String username, String password) {
        type("tomsmith",
                usernameLocator);
        type("SuperSecretPassword!", passwordLocator);
    }
}
