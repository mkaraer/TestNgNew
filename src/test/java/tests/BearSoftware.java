package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BearSoftware {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().
                setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        driver.manage().window().maximize();
        denemeMethods.loginSmartBear( driver);
        WebElement susanDate=driver.findElement(By.xpath("//td[.='Susan McLaren']/../td[5]"));
        if(susanDate.getText().equals("01/05/2010")){
            System.out.println("susan date verifcication passed.");
        }else{
            System.out.println("susan date verification is failed.");

        }

    }
    public static void verifyOrder(WebDriver driver, String orderName){
        List<WebElement> names= driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']"));
       for (WebElement name:names) {
            System.out.println(name.getText());
//            if(name.getText().equals(orderName)){
//                System.out.println("order name passed.");
//                return;
//            }
        }
        System.out.println("order name failed.");
    }

}
