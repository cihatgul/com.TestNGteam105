package tests.day14_testNGFRamework;

import org.testng.annotations.Test;

public class C01_TestNGIlkTest {

    /*
    TestNG test method'larını ısım sırasına gore calıştırır

    priotity degeri verilen method'lar priority degeri kuçukten büyüğe doğru çalışır.
     */

    @Test(priority = 1)
    public void ts01(){
        System.out.println("ilk test calismasi");

    }

    @Test(priority = 2)
    public void ts02(){
        System.out.println("ikinci test calismasi");

    }

    @Test(priority = 3)
    public void ts03(){
        System.out.println("ucuncu test calismasi");

    }

}
