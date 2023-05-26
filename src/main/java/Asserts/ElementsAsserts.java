package Asserts;

import Pages.ElementsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.lang.invoke.MethodHandles;




public class ElementsAsserts extends ElementsPage {
    private final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public ElementsAsserts(WebDriver driver) {
        super(driver);
    }

    public ElementsAsserts assertTextBoxOutputEquals(String output) {
        logger.info("Textbox output equals " + output);
        assertTextEquals(outputField, output);
        return this;
    }
    public ElementsAsserts assertCheckboxesCount(int expectedCount) {
        String checkboxTrue = "svg[class='rct-icon rct-icon-check']";
        logger.info("Checkboxes true: " + expectedCount + "as expected");
        Assert.assertEquals(By.cssSelector(checkboxTrue).findElements(driver).size(),expectedCount);
        return this;
    }
}
