package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class google1 {
    WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        System.out.println("before class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before metod");
    }
    @AfterMethod
    public void tearDown(){
       driver.close();
        System.out.println("close down the browser");
    }

    @Test
    public void googlePage(){
        driver=new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement el= driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        el  .sendKeys("Etsy"+ Keys.ENTER);
    }
    @Test
    public void google2(){

        driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        driver.manage().window().maximize();
        denemeMethods.loginSmartBear( driver);
        WebElement susanDate=driver.findElement(By.xpath("//td[.='Susan McLaren']/../td[5]"));


       driver.findElement(By.xpath("//*[.='Order']")).click();
           WebElement drop= driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
           Select select= new Select(drop);
        List<WebElement> option= select.getOptions();
        System.out.println(option.size());
        for (WebElement op:option) {
            System.out.println(op.getText().equals("FamilyAlbum"));
        }
    }

}
