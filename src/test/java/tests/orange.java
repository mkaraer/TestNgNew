package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class orange {
    WebDriver driver;
    @BeforeClass  // it runs before everything
    public void setup() {
        WebDriverManager.chromedriver().setup();
         driver= new ChromeDriver();

    }
        @BeforeMethod
                public void testSetup(){
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
//            driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//            driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//            driver.findElement(By.id("btnLogin")).click();
        }
        @AfterMethod
        public void testCleanUp (){
           // driver.close();
        }
        @AfterClass
        public void testDown() {
            driver.quit();
        }
        @Test
    public void orangeTitleVerification (){
     Assert.assertEquals(driver.getTitle(),"OrangeHRM","orange verification");
    }
@Test
    public void orangeLoginVeifivation(){
    System.out.println(driver.getPageSource());
    Assert.fail("on purpose fail");

    }


}
