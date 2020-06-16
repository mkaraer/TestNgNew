package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationUserPassNegative {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://app.crossbrowsertesting.com/login");

        driver.manage().window().maximize();
        String loginTitle=  driver.getTitle();
        if(loginTitle.equals("Log in to your account")){
            System.out.println("title checekd passed");
        }else{
            System.out.println("title checekd failed");
        }
       WebElement userName= driver.findElement(By.id("inputEmail"));
       WebElement password= driver.findElement(By.id("inputPassword"));
       WebElement loginBtn= driver.findElement(By.id("login-btn"));
       userName.sendKeys("mkaraer44@hotmail.com");
       password.sendKeys("");
       loginBtn.click();
        WebElement errorMessage = driver.findElement(By.xpath( "//*[@class='alert alert-error ng-binding']"));
        if(errorMessage.getText().equals("Must enter both Email and Password")){
            System.out.println("error Message Passed");
        }else{
            System.out.println("error Message checekd failed");
        }

    }

    }



