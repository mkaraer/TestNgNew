package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

public class iFrame {

    WebDriver driver;
    Select dropdown;


    @BeforeClass
    public void setUpMethods() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
        public void test()throws  InterruptedException{
            driver.get("https://stackoverflow.com/questions/57090861/issues-with-opening-webpage-using-selenium");
            Thread.sleep(2000);
           WebElement facebookFrame= driver.findElement(By.xpath("//div[@id='google_ads_iframe_/248424177/stackoverflow.com/lb/question-pages_0__container__']//iframe"));
            driver.switchTo().frame(facebookFrame);
            System.out.println(driver.getPageSource());
            driver.switchTo().defaultContent();
            System.out.println(driver.getTitle());
        }

        }

