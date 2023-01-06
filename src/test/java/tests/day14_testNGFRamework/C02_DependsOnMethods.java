package tests.day14_testNGFRamework;

import org.testng.annotations.Test;

public class C02_DependsOnMethods {

    @Test
    public void ilkTest(){
        System.out.println("ilk test calismasi");

    }

    @Test(dependsOnMethods = "ilkTest")
    public void ikinciTest(){
        System.out.println("ikinci test calismasi");

    }

    @Test(dependsOnMethods = "ikinciTest")
    public void ucuncuTest(){
        System.out.println("ucuncu test calismasi");

    }
}
