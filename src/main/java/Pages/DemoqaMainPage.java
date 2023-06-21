package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class DemoqaMainPage extends BasePage {
    private final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    By elements = By.xpath("//h5[text()='Elements']");
    By widgets = By.xpath("//h5[text()='Widgets']");

    public DemoqaMainPage(WebDriver driver) {
        super(driver);
    }

    public ElementsPage goToElementsPage(){
        scrollDown();
        click(elements);
        return new ElementsPage(driver);
    }
    public WidgetsPage goToWidgetsPage(){
        scrollDown();
        click(widgets);
        return new WidgetsPage(driver);
    }

}
