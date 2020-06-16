package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ValidationUserPass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://app.crossbrowsertesting.com/login");
        driver.manage().window().maximize();

        String loginTitle=  driver.getTitle();
        System.out.println(loginTitle);
        if(loginTitle.equals("Log in to your account")){
            System.out.println("title checekd passed");
        }else{
            System.out.println("title checekd failed");

        }
        driver.findElement(By.id("inputEmail")).sendKeys("Mkaraer44@hotmail.com");
        driver.findElement(By.id("inputPassword")).sendKeys("Greensboro919");
        driver.findElement(By.id("login-btn")).click();
        String newTitle=driver.getTitle();
        if(newTitle.equals("CrossBrowsingTesting App")){
            System.out.println("title verification checekd passed");
        }else{
            System.out.println("title verification checekd failed");

        }
        String url=driver.getCurrentUrl();
        if(url.equals("https://app.crossbrowsertesting.com/login")){
            System.out.println("url verification checekd passed");
        }else {
            System.out.println("url verification checekd failed");
        }

            List<WebElement> Paragraph= driver.findElements(By.xpath("//body//a"));
        for (WebElement each:Paragraph)
              {
                  System.out.println(each);
        }


    }
}
