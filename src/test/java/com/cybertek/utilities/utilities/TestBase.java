package com.cybertek.utilities.utilities;

import com.cybertek.utilities.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;
public abstract class TestBase {
    protected WebDriver driver;


    protected SoftAssert softAssert;
protected Actions actions;
 //   @BeforeClass
//    public void setUpClass() { //becuse of Driver classs we dont need
//
//        WebDriverManager.chromedriver().setup();
//    }
    @BeforeMethod
    public void setUpMethod(){
        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().setup();
        driver=  Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        actions=new Actions(driver);
        softAssert=new SoftAssert();
    }
@AfterMethod
    public void tearDownMwthod(){
       // driver.quit();
    //Driver.closeDriver();
        softAssert.assertAll();
}


}
