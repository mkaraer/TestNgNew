package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Amazon {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().clearPreferences();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("searchDropdownBox")).click();
        WebElement product = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        Select productDropdown = new Select(product);
         productDropdown.getFirstSelectedOption().getText();
        productDropdown.selectByVisibleText("Baby");
        List<WebElement> r= productDropdown.getOptions();

        productDropdown.getFirstSelectedOption().click();
//
        for (WebElement option:r) {
            System.out.println(option.getText());
        }
          driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect']//option[10]")).click();
    }

}
