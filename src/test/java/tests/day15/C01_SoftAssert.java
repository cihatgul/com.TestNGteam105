package tests.day15;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import ultilities.Driver;
import ultilities.ReusebleMethods;

import java.util.Arrays;

public class C01_SoftAssert {

    @Test
    public void ts01(){

        // amazon anasayfaya gidin
        Driver.getDriver().get("https://www.amazon.com");
        // amazon anasayfaya gittiginizi dogrulayin
        SoftAssert softAssert= new SoftAssert();
        String expectedUrlKelime="amazon";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedUrlKelime));
        // Nutella aratin
        AmazonPage amazonPage= new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        // arama sonuclarinin nutella icerdigini dogrulayin

        String aramaSonucYazisi= amazonPage.aramaSonucuElementi.getText();
        softAssert.assertTrue(aramaSonucYazisi.contains("Nutella"));
        // Java aratin
        amazonPage.amazonAramaKutusu.clear();
        amazonPage.amazonAramaKutusu.sendKeys("Java" + Keys.ENTER);


        // arama sonuclarinin 1000'den fazla oldugunu dogrulayin

        // 1-48 of over 6,000 results for "Java"

        aramaSonucYazisi=amazonPage.aramaSonucuElementi.getText();

        String[] sonucArr= aramaSonucYazisi.split(" ");
        // [1-48, of, over, 6,000, results, for, "Java"]


        String javaSonucSayisiStr= sonucArr[3]; // 6,000

        javaSonucSayisiStr=javaSonucSayisiStr.replaceAll("\\W",""); // 6000


        int sonucSayisiInt= Integer.parseInt(javaSonucSayisiStr);

        softAssert.assertTrue(sonucSayisiInt>1000);

        ReusebleMethods.bekle(3);
        softAssert.assertAll();
        Driver.closeDriver();
    }
}







        /*
        1- Driver Class : Oluşturacagımız Framework'de webDriver'i Driver class'ındaki getDriver()
        method'undan alacagız.Driver class'ını biraz daha geliştireceğiz .Farklı browser'larla calısabılır
        hale gelecek
        2- Page Class : Surekli kullandıgımız Locate ıslemlerini ve Logın gibi basit işlevleri yapacak
        method'ları Page class'ında olusturacagız.
        3- Bir Page class'ı olusturur olusturmaz ilk yapmamız gereken sey, parametresiz bir Constructor olusturup,içinde
        PageFactory.initElements(webdriver,this) ile driver'a page sayfasında ilk değer atamasını yapmak olmalıdır.
        4- Assertion : TestNG'de 2 assertion yontemi vardır.
            - Hard Assert : JUnit'deki assert ile aynı method'lara sahiptir . İlk FAILED olan assertion'da
            çalışmayı durdurur ve rapor verir.
            - Soft Assert : Biz raporla diyene kadar assertion'lar FAILED olsa bile çalışmaya devam eder .assertAll() ile
            raporlamasını ıstedıgımızde failed olan  assertion varsa raporlar ve çalışmayı durdurur.

         5- Genelte "test edin" dendiğinde hard assert , doğrulayın(verify) denirse soft assert kullanılır.
         */
