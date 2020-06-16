package tests;

import com.cybertek.utilities.pages.OrangeHomePage;
import com.cybertek.utilities.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class OrangeDeneme extends TestBase  {

    @Test
    public void OrangeTest()  {


            driver.get("https://opensource-demo.orangehrmlive.com");

        OrangeHomePage or = new OrangeHomePage();
        or.login("Admin", "admin123");
        Actions action= new Actions(driver);
        action.moveToElement(or.performance).perform();
        action.moveToElement(or.configure).perform();
        or.kpi.click();
        String acceptedMessage= "Search Key Performance Indicators";
        String actualResult=driver.findElement(By.xpath("//h1[.='Search Key Performance Indicators']")).getText();
      //  System.out.println(driver.getTitle());
      //  System.out.println(driver.findElement(By.xpath("//h1[.='Search Key Performance Indicators']")).getText().equals(acceptedMessage));
       Assert.assertEquals(acceptedMessage,actualResult);
        Select select=new Select(or.jobTitleDropdown);
        String expectedT="CEO";
        String actualR="";
        List<WebElement> list=select.getOptions();
        for (WebElement each:list) {
            System.out.println(each.getText());
            if(each.getText().equals(expectedT))
                actualR=each.getText();
        }
            Assert.assertEquals(expectedT,actualR);




    }





}
