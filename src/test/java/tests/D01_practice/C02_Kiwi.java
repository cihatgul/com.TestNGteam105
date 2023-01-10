package tests.D01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KiwiPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C02_Kiwi extends TestBaseRapor{

    public C02_Kiwi(){

    }


    KiwiPage kiwiPage=new KiwiPage();

    @Test (priority = 1)
    public void ts01(){

        extentTest = extentReports.createTest("Kiwi testi", "ilgili ayarlar yapildi");


        Driver.getDriver().get("https://www.kiwi.com");

        // 1- Cookies'i reddedin
        kiwiPage.CookiesRedEtButtonu.click();

        // 2- sayfa dogrulamasi
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Kiwi"));

        // 3- dil segmesine tiklayalim
        kiwiPage.dilSecimiButtonu.click();

        // 4- burada dili turkceye ceviriyoruz select tag'i ile
        WebElement slc1=Driver.getDriver().findElement(By.xpath("//select[@data-test='LanguageSelect']"));
        Select select=new Select(slc1);
        select.selectByValue("tr");

        // 5- burada para birimini try ceviriyoruz select tag'i ile
        WebElement slc2=Driver.getDriver().findElement(By.xpath("//select[@data-test='CurrencySelect']"));
        Select select1=new Select(slc2);
        select1.selectByValue("try");

        // 6- dili turkce ve para birimini tr yaptik buttona basalim burada
        kiwiPage.dilVeParaBirimiButtonu.click();

        // 7- Sectiginiz dil ve para birimini dogrulayin
        WebElement testButtonu=Driver.getDriver().findElement(By.xpath("//*[text()='TRY']"));
        Assert.assertTrue(testButtonu.getText().contains("TRY"));

        // 8- burasi ucus secenek kismi
        Driver.getDriver().findElement(By.xpath("(//div[@class='ButtonWrapsstyled__ButtonTabletWrap-sc-zf781k-0 jRIGJM'])[1]")).click();

        // 9- burasi tek yon kismi
        Driver.getDriver().findElement(By.xpath("(//p[@data-test='ModePopup-iconDone'])[2]")).click();

        // 10- Kalkis kismini temizledik ve devaminda kalkisi dinamik yaptik
        WebElement aramaKismindakiCarpiKalkisButtonu=Driver.getDriver().findElement(By.xpath("(//div[@data-test='PlacePickerInputPlace-close'])[1]"));
        aramaKismindakiCarpiKalkisButtonu.click();

        ReusableMethods.bekle(3);

        WebElement kalkisSeceneginiGirelim=Driver.getDriver().findElement(By.xpath("(//input[@data-test='SearchField-input'])[1]"));
        kalkisSeceneginiGirelim.sendKeys("Istanbul");
        Driver.getDriver().findElement(By.xpath("(//div[@role='button'])[5]")).click();

        // 11- varis kismini temizledik ve devaminda varisi dinamik yaptik
        ReusableMethods.bekle(3);
        WebElement varisSeceneginiGirelim=Driver.getDriver().findElement(By.xpath("(//input[@data-test='SearchField-input'])[2]"));
        varisSeceneginiGirelim.sendKeys("New York");
        Driver.getDriver().findElement(By.xpath("//*[text()='New York, Amerika Birleşik Devletleri']")).click();

        // 11- Gidis tarihi kismina erisim saglayarak gidecegimiz gunu secelim ve booking i iptal edelim
        kiwiPage.gidisTarihButtonu.click();

        WebElement gidisTarihi=Driver.getDriver().findElement(By.xpath("(//div[@aria-label='search.calendar.day_aria_departure'])[51]"));
        gidisTarihi.click();

        kiwiPage.tarihAyarlaButtonu.click();

        ReusableMethods.bekle(3);
        kiwiPage.bookingButtonu.click();

        ReusableMethods.bekle(3);
        kiwiPage.araButtonu.click();

        ReusableMethods.bekle(3);
        // 12- Sadece aktarmasiz ucuslar olarak filtreleme yapalim
        kiwiPage.aktarmasizKisimButtonu.click();

        // 13- en ucuz secenegine tiklayalim
        kiwiPage.enUcuzButtonu.click();



        ReusableMethods.bekle(3);
        Driver.closeDriver();

    }
}
