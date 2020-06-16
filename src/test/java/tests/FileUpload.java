package tests;

import com.cybertek.utilities.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class FileUpload {
    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement chooseFile= driver.findElement(By.id("file-upload"));
        //String path="\\Users\\KIDS ACADEMY\\Desktop\\cennet.docx";
      String path= "C:\\Users\\KIDS ACADEMY\\Desktop\\V form.docx";
        chooseFile. sendKeys(path);
        driver.findElement(By.id("file-submit")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[.='File Uploaded!']")).isDisplayed(),"It is failed");
    }
}
