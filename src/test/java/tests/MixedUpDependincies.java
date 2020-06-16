package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MixedUpDependincies {
    @Test
    public void openBrowser(){
        System.out.println("Opening Browser");
    }
    @Test(dependsOnMethods = "openBrowser")
    public void login(){
        System.out.println("login");
    }
    @AfterMethod
    public void cleanUp(){
        System.out.println("close Browser");
    }

}
