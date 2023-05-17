package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HerokuappMain extends BasePage {
    private By formAuthenticationLinkLocator = By.linkText("Form Authentication");

    public HerokuappMain(WebDriver driver){super(driver);}
    public void startPage(){
        openUrl("https://the-internet.herokuapp.com/");
    }
    public HerokuLoginPage clickFormAuthenticationLink(){
        click(formAuthenticationLinkLocator);
        return new HerokuLoginPage(driver);
    }
}
