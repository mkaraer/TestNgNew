package com.cybertek.utilities.utilities;

import com.cybertek.utilities.ConfigurationReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    public static WebDriver driver;
    public Driver(){}

    public static WebDriver getDriver(){
        if(driver==null){
            // WebDriverManager.chromedriver().setup();
           // driver=new ChromeDriver();
            String browser=  ConfigurationReader.getProperty("username");
            switch (browser.trim()){
                case"chrome":
                    WebDriverManager.chromedriver().clearPreferences();
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    driver.manage().window().maximize();

                    break;
                case"firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case"ied":
                    WebDriverManager.iedriver().setup();
                    driver=new InternetExplorerDriver();
                    break;
            } }
        return driver;
    }
public static void closeDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;//we need to make null otherwise next time use will give exception
        }
}


}
