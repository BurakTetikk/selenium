package lesson_07;

import org.testng.annotations.Test;

public class C01_TestNG {

    @Test(priority = 5)
    public void test01(){
        System.out.println("Test01");
    }


    @Test
    public void test02(){
        System.out.println("Test02");
    }



    @Test(priority = 1)
    public void test03(){
        System.out.println("Test03");
    }


    @Test(priority = 3)
    public void test04(){
        System.out.println("Test04");
    }


    @Test(dependsOnMethods = "test03")
    public void test05(){
        System.out.println("Test05");
    }

    // Priority -> 5 -> 2 -> 3 -> 4 -> 1
    // dependsOnMethods  -> 2 -> 3 -> 5 -> 4 -> 1

}
