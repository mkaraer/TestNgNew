package com.cybertek.utilities;

import com.cybertek.utilities.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleDemo extends TestBase {

    @Test
    public void titleTest(){
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("selenium cookbook"+ Keys.ENTER);
        Assert.assertTrue(driver.getTitle().contains("selenium cookbook"));
    }
}
