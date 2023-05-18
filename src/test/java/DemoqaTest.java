import Pages.DemoqaMainPage;
import Pages.ElementsPage;
import base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;


import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DemoqaTest extends BaseTest {

    protected DemoqaMainPage mainPage;
    private ElementsPage elementsPage;

    @BeforeTest
    protected void goToElements() {
        mainPage = new DemoqaMainPage(driver);
        mainPage.openUrl("https://demoqa.com/");
        elementsPage = mainPage.goToElementsPage();
    }
    @Test
    protected void submitTextform(){
        elementsPage
                .goToTextBox()
                .fillFullName("John Smith")
                .submit();
        elementsPage.assertTextBoxOutputEquals("Name:John Smith");
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}