package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.ExecutorService;

import static org.testng.Assert.assertEquals;


public class ElementsPage extends BasePage {
  public  ElementsPage(WebDriver driver) {
        super(driver);
    }
    public static By getBySelector(String elementText) {
        return By.xpath("//span[text()='" + elementText + "']");
    }

    By textbox = ElementsPage.getBySelector("Text Box");
    By checkbox = ElementsPage.getBySelector("Check Box");
    By radiobutton = ElementsPage.getBySelector("Radio Button");
    By webtables = ElementsPage.getBySelector("Web Tables");

    By textboxFullname = By.xpath("//input[@id='userName']");
    By textboxEmail = By.xpath("//input[@id='userEmail']");

    By textBoxAddress = By.xpath("//textarea[@id='currentAddress']");

    By textBoxSubmitButton = By.cssSelector("button[id='submit']");

    By outputField = By.cssSelector("p[id='name']");


        public ElementsPage goToTextBox () {
            scrollDown();
            click(textbox);
            return this;
        }

        public ElementsPage goToCheckBox () {
            click(checkbox);
            return this;
        }

    public ElementsPage fillFullName(String name) {
            click(textboxFullname);
            type(name, textboxFullname);
            return this;
    }

    public ElementsPage submit() {
            click(textBoxSubmitButton);
            return this;
    }

    public ElementsPage assertTextBoxOutputEquals(String output) {
            assertTextEquals(outputField, output);
            return this;
    }
}