package tests;

import org.testng.annotations.Test;

public class FileExistTest {

    @Test
    public void test(){
        String current= System.getProperty("user.dir");
        System.out.println(current);
        String userFolder= System.getProperty("user.home");
        System.out.println(userFolder);

        String path=userFolder+"\\Download\\zulal.jpeg";
        System.out.println(path);
       // Assert.assertTrue(Files.exists(Paths.get(path)));
    }


}
