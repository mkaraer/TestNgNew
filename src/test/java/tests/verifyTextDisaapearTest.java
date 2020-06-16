package tests;

import com.cybertek.utilities.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class verifyTextDisaapearTest extends TestBase {
@Test
public void verify1(){

    driver.get("https://www.w3schools.com/howto/howto_js_toggle_hide_show.asp");
    WebElement text = driver.findElement(By.id("myDIV"));
   // System.out.println(text.getText());
    Assert.assertTrue(text.isDisplayed());
    WebElement button=driver.findElement(By.xpath("//button[.='Toggle Hide and Show']"));
    button.click();
    Assert.assertFalse(text.isDisplayed());
}
@Test
    public void verify2(){
    driver.get("https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_html_remove");
driver.switchTo().frame("iframeResult");
    WebElement text= driver.findElement(By.xpath("//body/p"));
   Assert.assertTrue(text.isDisplayed());
    // System.out.println(text.getText());
    WebElement button=driver.findElement (By.xpath("//body/button"));
   button.click();
   Assert.assertFalse(elementExist(By.xpath("//body/p")));
}
//takes a locator and returns if elemeant matching this locator
    //param by  return
    public boolean elementExist(By by){
    //try find it
        // if cant find it, return false
        try{
            driver.findElement(by).isDisplayed();
            return true;
        }catch(NoSuchElementException e){
            return false;
        }
    }

}
