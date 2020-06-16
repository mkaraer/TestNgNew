package tests;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.utilities.TestBase;
import com.cybertek.utilities.pages.HomePage;
import com.cybertek.utilities.pages.PrestashopHomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ErrorMessageValidation extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void wrongEmailTest() {
driver.get(ConfigurationReader.getProperty("username"));
       // driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
        homePage.username.sendKeys("admin");
        homePage.password.sendKeys("test");
        homePage.loginButton.click();

        String error = "Invalid Login or Password.";
        String errorExpected = homePage.errorMessage.getText();

        Assert.assertEquals(errorExpected, error);
    }

    @Test
    public void wrongPasswoed() {
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePage.username.sendKeys("Tester");
        homePage.password.sendKeys("wrong Passwoed");
        homePage.loginButton.click();

        String error2 = "Invalid Login or Password.";
        String errorExpected = homePage.errorMessage.getText();

        Assert.assertEquals(errorExpected, error2);
    }

    @Test
    public void blankUsername() {
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");

        homePage.login("", "Tester");
        String error2 = "Invalid Login or Password.";
        String errorExpected = homePage.errorMessage.getText();

        Assert.assertEquals(errorExpected, error2);
    }
    @Test
    public void test() {
        PrestashopHomePage prestashopHomePage = new PrestashopHomePage();
    WebElement tshirt = prestashopHomePage.product("tshirt");
    WebElement dress =prestashopHomePage.product("dress");

}


















}