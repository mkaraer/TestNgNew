package tests;

import com.cybertek.utilities.utilities.Driver;
import com.cybertek.utilities.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;




public class Amazon2{

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
         driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void amazon(){
         driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        WebElement signIn= driver.findElement(By.xpath("//span[.='Hello, Sign in']"));


     driver.findElement(By.id("ap_email")).sendKeys("mkaraer44@hotmail.com");
             driver.findElement(By.id("continue")).click();
             driver.findElement(By.id("ap_password")).sendKeys("mkaraer44@");
             driver.findElement(By.id("signInSubmit")).click();

             }
             }
