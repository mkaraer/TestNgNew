package pageObject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Grey {
    @BeforeClass
    public static void setup(){
        System.out.println("Junit before class");
    }
    @Before
    public void b(){
        System.out.println("Before annotation");
    }
    @Test
    public void test1(){

        System.out.println("Junit test 1");
        Assert.assertEquals(4,5);
    }
    @Test
    public void test2(){
        System.out.println("Junit test 2");
    }

}
