package tests.day14_testNGFRamework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import ultilities.Driver;
import ultilities.ReusebleMethods;

public class C03_NutellaTesti {


    @Test (priority = 1)
    public void ts01(){

        // 1- amazon ana sayfaya gidin
        Driver.getDriver().get("https://www.amazon.com/");

        // 2- nutella icin arama yapin
        WebElement aramaKusuru=Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaKusuru.sendKeys("Nutella"+Keys.ENTER);

        // 3- sonuclari nutella icerdigini test edin
        WebElement aramaSonucuElementi=Driver.getDriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        ReusebleMethods.bekle(3);

        String expectedKelime="Nutella";
        String actuelSonucu=aramaSonucuElementi.getText();
        Assert.assertTrue(actuelSonucu.contains(expectedKelime));



        ReusebleMethods.bekle(3);
        Driver.closeDriver();
    }
}

