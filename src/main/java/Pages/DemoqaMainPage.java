package Pages;

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
    @FindBy(xpath = "//h5[text()='Elements']")
    WebElement elements;

    public DemoqaMainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ElementsPage goToElementsPage(){
        scrollDown();
        click(elements);
        return new ElementsPage(driver);

    }

}
