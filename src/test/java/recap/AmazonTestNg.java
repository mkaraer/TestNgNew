package recap;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTestNg {
    WebDriver driver;
    Select dropdown;
    @BeforeMethod
    public void setUpMethods(){
        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
        driver.get("https://www.amazon.com/ ");
    }
    @Test(priority = 0)
    public void departmentTest(){
        WebElement drop = driver.findElement(By.id("searchDropdownBox"));

         dropdown = new Select(drop);
       String print= dropdown.getFirstSelectedOption().getText();
        System.out.println(print);
    }
    @Test(priority = 1)
    public void sorting (){
        for (int i=0; i<dropdown.getOptions().size()-1; i++){
            System.out.println("comparing" + dropdown.getOptions().get(i) + "with" + dropdown.getOptions().get(i + 1));

    }
    }
        public void mainDepertmentTest(){
            driver.findElement(By.id("hmenu-canvas-background")).click();

        }
}
