package tests.day18_htmlReports;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_HTML_Reports extends TestBaseRapor {

    public C01_HTML_Reports() {
    }

    @Test
    public void test01() {

        extentTest = extentReports.createTest("Nutella testi", "Kullanici amazonda Nutella arayabilmeli");

        extentTest.info("Amazon anasayfaya gidildi");
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        extentTest.info("Arama kutusuna Nutella yazip, arama yapildi");
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys(new CharSequence[]{"Nutella" + Keys.ENTER});

        extentTest.info("Arama sonuclari kaydedildi");
        String actualSonucYazisi = amazonPage.aramaSonucuElementi.getText();
        String expectedKelime = "Nutella";

        extentTest.pass("Arama sonuclarinin Nutella icerdigi test edildi");
        Assert.assertTrue(actualSonucYazisi.contains(expectedKelime));

    }
}
