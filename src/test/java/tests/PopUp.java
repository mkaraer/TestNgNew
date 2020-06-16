package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopUp {

    WebDriver driver;
    Select dropdown;
    private Object Tread;

    @BeforeMethod
    public void setUpMethods() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
        public void warningAlert() throws InterruptedException {
            driver.get("http://the-internet.herokuapp.com/javascript_alerts");
            driver.manage().window().maximize();

            driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
            Thread.sleep(1000);
            Alert firstAlert = driver.switchTo().alert();
            firstAlert.accept();
        }
    @Test
    public void confirmAlert()  throws InterruptedException{
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
        Thread.sleep(1000);
        Alert secondAlert = driver.switchTo().alert();
        secondAlert.dismiss();
    }
    @Test
    public void promptAlert() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
        Thread.sleep(1000);
        Alert thirdtAlert = driver.switchTo().alert();
        thirdtAlert.sendKeys("this is test");
        thirdtAlert.accept();
    }


}





















