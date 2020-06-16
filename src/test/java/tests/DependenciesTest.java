package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciesTest {
    @Test
    public void login(){
        Assert.assertTrue(false);
        System.out.println("login");
    }
    @Test(dependsOnMethods = "login")
    public void zbuysth(){
        System.out.println(" buy buy baby");
    }
    @Test
    public void HomePage(){
        System.out.println("Home Page");
    }



}
