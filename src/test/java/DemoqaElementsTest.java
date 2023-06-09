
import Pages.DemoqaMainPage;
import Pages.ElementsPage;
import Asserts.ElementsAsserts;

import base.BaseTest;
import configuration.Group;
import org.testng.annotations.*;
@Test(groups = {Group.POSITIVE})
public class DemoqaElementsTest extends BaseTest {
    protected DemoqaMainPage mainPage;
    private ElementsPage elementsPage;
    private ElementsAsserts elementsAsserts;

    @BeforeTest(alwaysRun = true)
    protected void goToElements() {
        mainPage = new DemoqaMainPage(driver);
        mainPage.openUrl("https://demoqa.com/");
        elementsPage = mainPage.goToElementsPage();
        elementsAsserts = new ElementsAsserts(driver);
    }
    @Test
    protected void submitTextform(){
        elementsPage
                .goToTextBox()
                .fillFullName("John Smith")
                .submit();
        elementsAsserts.assertTextBoxOutputEquals("Name:John Smith");
    }
    @Test
    protected void listsAllDirectoriesWhenTheRootIsChecked(){
        elementsPage
                .goToCheckBox()
                .checkDirectoryHome()
                .expandCheckboxTree();
        elementsAsserts.assertCheckboxesCount(17);
    }

}