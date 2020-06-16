package pageObject;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.pages.OrangeHomePage;
import com.cybertek.utilities.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class OrangeTest  {
    WebDriver driver;

    @BeforeClass
public void setUp(){
    WebDriverManager.chromedriver().clearPreferences();
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
}

    @Test
    public void testOne(){
        driver.get(ConfigurationReader.getProperty("url"));

        OrangeHomePage orangeHomePage= new OrangeHomePage();
        orangeHomePage.login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("username"));
    }
    @Test
    public void jobTitleVerification() throws InterruptedException {
        driver.get(ConfigurationReader.getProperty("username"));
        OrangeHomePage ohp= new OrangeHomePage();

        ohp.login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("username"));
        Thread.sleep(1000);
        Actions actions=new Actions(driver);
        actions.moveToElement(ohp.performance).perform();
        actions.moveToElement(ohp.configure).perform();
        ohp.kpi.click();
        Select jobTitle= new Select(ohp.jobTitleDropdown);
              List<WebElement> options=jobTitle.getOptions();
              boolean found= false;
        for (WebElement option:options) {
            System.out.println(option);
            if (option.getText().contains("CEO")){
                found=true;
                break;
            }
        }
        Assert.assertTrue(found);


    }

}
