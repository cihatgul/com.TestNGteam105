package tests.D01_practice;

import org.testng.annotations.Test;
import pages.BookingPage;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_booking {

    // driverimiz ile ilgili kurulumlari baslatalim
    // https://www.booking.com/ sayfasina gidelim
    // para birimi olarak TL secelim
    // ulke olarak Turkiye yi secelim
    // sayfanin en altindan ulgeler kismini secelim
    // ulkeler sayfasindan turkiye yi secelim
    // turkiye sayfasinin secildigini test edin

    BookingPage bookingPage= new BookingPage();

    @Test(priority = 1)
    public void ts01(){

        // https://www.booking.com/ sayfasina gidelim
        Driver.getDriver().get("https://www.booking.com/");

        // para birimi olarak TL secelim
        bookingPage.paraBirimiButtonu.click();
        ReusableMethods.bekle(3);
        bookingPage.trParaButtonu.click();

        // ulke olarak Turkiye yi secelim
        bookingPage.ulkeSecmeButtonu.click();
        bookingPage.turkiyeSecmeButtonu.click();

        // sayfanin en altindan ulkeler kismini secelim
        bookingPage.sayfaninEnAltindakiUlkelerButtonu.click();
        ReusableMethods.bekle(5);
        bookingPage.sayfaninEnAltindakiUlkelerButtonuTurkiye.click();



        ReusableMethods.bekle(3);
        Driver.closeDriver();
    }
}
