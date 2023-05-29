import Asserts.WidgetsAsserts;
import Pages.DemoqaMainPage;
import Pages.WidgetsPage;
import base.BaseTest;
import configuration.Group;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups = {Group.NEGATIVE})
public class DemoqaWidgetsTest extends BaseTest {
    protected DemoqaMainPage mainPage;
    private static final String TEXT_INPUT = "fdakhsjfhewav dsjsavlkndsavfbh adsj";
    private WidgetsPage widgetsPage;
    private WidgetsAsserts widgetsAsserts;
    @BeforeTest(alwaysRun = true)
    protected void goToWidgets(){
        mainPage = new DemoqaMainPage(driver);
        mainPage.openUrl("https://demoqa.com/");
        widgetsPage = mainPage.goToWidgetsPage();
        widgetsAsserts = new WidgetsAsserts(driver);
    }
    @Test
    protected void returnsDefaultWhenInvalidDataFormatEntered(){
        widgetsPage
                .goToDatePicker()
                .fillDateAndTime(TEXT_INPUT)
                .clickOutside();
        widgetsAsserts.assertThatNonDateFormatInDateInputDoesNotChangeTheValue(TEXT_INPUT);
    }
}
