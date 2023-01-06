package tests.day15;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import ultilities.Driver;

public class C03_PozitifLoginTesti {

    @Test
    public void ts01(){

        // 1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get("https://www.qualitydemy.com");

        // 2- login linkine basin
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        QualitydemyPage.ilkLoginButonu.click();

        // 3- Kullanici email’i olarak valid email girin
        qualitydemyPage.kullaniciImailKutusu.sendKeys("user_1106147@login.com");

        // 4- Kullanici sifresi olarak valid sifre girin
        qualitydemyPage.passwordKutusu.sendKeys("311488081");

        // 5- Login butonuna basarak login olun
        qualitydemyPage.loginButtonu.click();

        // 6- Basarili olarak giris yapilabildigini test edin
        Assert.assertTrue(qualitydemyPage.basariliGirisCoursesLinki.isDisplayed());

        Driver.closeDriver();





    }
}
