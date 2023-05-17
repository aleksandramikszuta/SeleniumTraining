import Pages.HerokuLoginPage;
import Pages.HerokuappMain;
import base.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test (groups={"HerokuAppTest"})
    public void loginTest(){
        HerokuappMain mainPage = new HerokuappMain(driver);
        mainPage.startPage();
        mainPage.clickFormAuthenticationLink();
        HerokuLoginPage loginPage = new HerokuLoginPage(driver);
        loginPage.Login("tomsmith", "SuperSecretPassword");

    }
}
