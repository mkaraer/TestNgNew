package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodValidation {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.crossbrowsertesting.com/login");
        negativeLogin((WebElement) driver, "mkaraer44@hotmail.com", "Greensboro919");
        negativeLogin((WebElement) driver, "mkaraer44@hotmail", "eensboro919");
        negativeLogin((WebElement) driver, "mkaraer44hotmail.com", "");
    }
    public static void negativeLogin(WebElement driver, String userNameValue, String passwordValue) {
        WebElement userName = driver.findElement(By.id("inputEmail"));
        WebElement password = driver.findElement(By.id("inputPassword"));
        WebElement loginBtn = driver.findElement(By.id("login-btn"));
        userName.clear();
        userName.sendKeys(userNameValue);
        password.clear();
        password.sendKeys(passwordValue);
        loginBtn.click();
        WebElement errorMessage = driver.findElement(By.xpath ("//*[@class='alert alert-error ng-binding']"));
        if (errorMessage.getText().equals("Must enter both Email and Password")) {
            System.out.println("error Message Passed");
        } else {
            System.out.println("error Message checekd failed");
        }

    }
}