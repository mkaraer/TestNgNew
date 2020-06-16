package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

    @Test
            public void test1(){ //if it fails rest of the test fails
        System.out.println("Starting");
        Assert.assertTrue(false);
        System.out.println("done");
    }
    @Test
    public void test2(){// it fails doesnt stop the test
        SoftAssert softAssert=new SoftAssert();
        System.out.println("starting");
        softAssert.assertTrue(false);
        System.out.println("done");
                softAssert.assertEquals("google","etsy");
              softAssert.assertAll();
    }
   @Test
   public void Test3(){
       SoftAssert softAssert=new SoftAssert();
       System.out.println("starting");
       softAssert.assertTrue(false);
       Assert.assertTrue(false);
       System.out.println("done"); // fail becuse of asserTrue
       softAssert.assertAll();
   }




}
