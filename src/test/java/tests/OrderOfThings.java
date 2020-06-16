package tests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OrderOfThings {
    @Ignore
    @Test(priority = 1)
    public void test1(){
        System.out.println("Excute test 1");
    }
    @Test(priority = 3)
    public void atest2(){
        System.out.println("Excute test2");
    }
    @Test(priority = 2)
    public void test3(){

        System.out.println("Excute test 3");
    }

}
