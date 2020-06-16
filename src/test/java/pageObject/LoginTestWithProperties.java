package pageObject;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.utilities.TestBase;
import com.cybertek.utilities.pages.HomePage;
import org.testng.annotations.Test;

public class LoginTestWithProperties extends TestBase {
    @Test
    public void readPropertiesTest(){
        driver.get(ConfigurationReader.getProperty("username"));
        HomePage homePage=new HomePage();
//homePage.open();
        String username=ConfigurationReader.getProperty("username");
        String password= ConfigurationReader.getProperty("username");


homePage.login(username,password);

    }
}
