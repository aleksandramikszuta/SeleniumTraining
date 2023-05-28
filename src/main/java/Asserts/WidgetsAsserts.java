package Asserts;

import Pages.BasePage;
import Pages.WidgetsPage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.lang.invoke.MethodHandles;


public class WidgetsAsserts extends WidgetsPage {
    private final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    public WidgetsAsserts(WebDriver driver){
        super(driver);
    }
    public WidgetsAsserts assertThatNonDateFormatInDateInputDoesNotChangeTheValue(String textInput){
        logger.info("Data and Time input is unafected by wrong input");
        Assert.assertNotEquals(getValueOf(dateAndTime, "value"), textInput);
        return this;

    }
}
