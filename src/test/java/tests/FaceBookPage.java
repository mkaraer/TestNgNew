package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FaceBookPage {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement drop= driver.findElement(By.xpath("//*[@id='month']"));
        Select dropDown=new Select(drop);
        String str=dropDown.getFirstSelectedOption().getText();
        List<WebElement>  list=dropDown.getOptions();
        String expected="Jun";
        for(WebElement each:list){
            System.out.println(each.getText());
            if(each.getText().equals(expected)){
                each.click();
            }
        }
     //   System.out.println(str);
    }
}
