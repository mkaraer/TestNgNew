package tests;

import com.cybertek.utilities.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EtsyWithSoftAssert  {
    @Test
    public void  test(){
        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://etsy.com");
        driver.findElement(By.id("search-query")).sendKeys("gift"+ Keys.ENTER);
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(driver.getTitle().contains("gift"));
        Assert.assertTrue(driver.getTitle().contains("AAA"));

    }

}
