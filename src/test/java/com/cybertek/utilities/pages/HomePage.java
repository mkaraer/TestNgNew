package com.cybertek.utilities.pages;

import com.cybertek.utilities.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement username;
    @FindBy(id = "ctl00_MainContent_password")
    public WebElement password;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;
    @FindBy(id = "ctl00_MainContent_status")
    public WebElement errorMessage;
    @FindBy(xpath = "//a[.=\"View all products\"]")
    public WebElement Viewallorders;


    public void login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);

        loginButton.click();
        Viewallorders.
                click();
    }


//    public void open(){
//        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
//
//    }







}
