package tests;

import com.cybertek.utilities.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleClick extends TestBase {
    @Test
    public void test(){
        driver.get("https://www.w3schools.com/tags.asp?filename=tryhtml5_ev_ondbclick2");
        driver.switchTo().frame("iframeResult");
        //we need to create action to click double and idendify webelement to click on
        Actions actions= new Actions(driver);
        WebElement text= driver.findElement(By.id("demo"));
        //double click on element
        actions.doubleClick(text).perform(); //we need to perform
       // actions.dragAndDrop()
        Assert.assertTrue(text.getAttribute("style").contains("red"));

    }


}
