package com.cybertek.utilities.pages;

import com.cybertek.utilities.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrangeHomePage {
    WebDriver driver;
    public OrangeHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="txtUsername")
   public WebElement userName;
    @FindBy(id="txtPassword")
   public WebElement password;
    @FindBy(id="btnLogin")
   public WebElement loginBtn;
    @FindBy(id="menu__Performance")
   public WebElement performance;
    @FindBy(id="menu_performance_Configure")
   public WebElement configure;
   @ FindBy(id="menu_performance_searchKpi")
       public WebElement kpi;
   @FindBy(id="kpi360SearchForm_jobTitleCode")
  public WebElement jobTitleDropdown;

public void login (String userName, String password){
    this.userName.sendKeys(userName);
    this.password.sendKeys(password);
    loginBtn.click();

}
@FindBy(id="menu_admin_viewAdminModule")
    public WebElement adminHover;
@FindBy(id="menu_admin_UserManagement")
    public WebElement usermagement;
    @FindBy(id="menu_admin_viewSystemUsers")
    public WebElement users;




}
