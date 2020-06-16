package tests;

import com.cybertek.utilities.utilities.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class scrollTest extends TestBase {
    @Test
    public void test(){
      //  WebDriver driver=new ChromeDriver();
        driver.get("https://youtube.com");
        actions.sendKeys(Keys.PAGE_DOWN);
        actions.sendKeys(Keys.PAGE_DOWN);
        actions.sendKeys(Keys.PAGE_DOWN);
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        JavascriptExecutor js=(JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,1000)","");

    }
}
