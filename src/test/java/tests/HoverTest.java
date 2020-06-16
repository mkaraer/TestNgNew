package tests;

import com.cybertek.utilities.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTest extends TestBase {

@Test
    public void test(){

    driver.get("https://amazon.com");
   WebElement signIn= driver.findElement(By.xpath("//span[.='Hello, Sign in']"));
    actions.moveToElement(signIn).perform();
    driver.findElement(By.xpath("//span[.=Your Hearts]"));
    Assert.assertTrue(driver.getTitle().contains("Interesting"));
}
@Test
    public void test2(){
    driver.get("https://amazon.com");
    WebElement help= driver.findElement(By.xpath("(//a[.='Help'])[2]"));
actions.moveToElement(help).perform();
actions.click();

    }





}
