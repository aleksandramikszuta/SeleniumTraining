package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WidgetsPage extends BasePage {
    protected WidgetsPage(WebDriver driver) {
        super(driver);
    }
    protected By datePicker = By.xpath("//span[contains(text(),'Date Picker')]");
    protected By dateAndTime = By.cssSelector("input[id='dateAndTimePickerInput']");
    public WidgetsPage goToDatePicker(){
      //  scrollDown();
        click(datePicker);
        return this;
    }
    public WidgetsPage fillDateAndTime(String textInput) {
        click(dateAndTime);
        clearInput(dateAndTime);
        type(textInput, dateAndTime);
        return this;
    }

}
