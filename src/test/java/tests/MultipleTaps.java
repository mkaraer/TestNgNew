package tests;

import com.cybertek.utilities.utilities.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.*;

public class MultipleTaps extends TestBase {

    @Test
    public void MultipleTap() {
        driver.get("http://amazon.com");

        ((JavascriptExecutor) driver).executeScript("window.open('http://www.google.com','_blank');") ;
        ((JavascriptExecutor) driver).executeScript("window.open('http://www.etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://www.openxcell.com','_blank');");

        String title="Personalized gifts";
        List<String> allTaps=new ArrayList<String>(driver.getWindowHandles());
        for (String allTap:allTaps){

            driver.switchTo().window(allTap) ;
            if(driver.getTitle().equals(title)){
                break;
            }
        }
        System.out.println(driver.getCurrentUrl());

    }
}