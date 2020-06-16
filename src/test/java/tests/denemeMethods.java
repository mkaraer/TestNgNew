package tests;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class denemeMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        driver.manage().window().maximize();
        loginSmartBear(driver);
        driver.findElement(By.linkText("Order")).click();
        WebElement product =  driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
        Select productDropdown = new Select(product);
        productDropdown.selectByVisibleText("FamilyAlbum");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("2");
        Faker faker= new Faker();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(faker.name().fullName());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys(faker.address().streetName());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys(faker.address().city());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys(faker.address().state());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys(faker.address().zipCode().replace("-",""));
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(faker.finance().creditCard().replace("-",""));
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("12/23");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
        WebElement order=driver.findElement(By.id("//div[@class='buttons_process']//strong"));
        String check =order.getText();
        if(check.equals("New order has been successfully added.")){
            System.out.println("chceking is passed.");
        }else{
            System.out.println("chceking is failed.");
        }




    }
    public static void loginSmartBear(WebDriver driver){
        WebElement userName= driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement password= driver.findElement(By.id( "ctl00_MainContent_password"));
        WebElement loginBtn= driver.findElement(By.id("ctl00_MainContent_login_button"));
        userName.sendKeys("Tester");
        password.sendKeys("test");
        loginBtn.click();
    }
}
