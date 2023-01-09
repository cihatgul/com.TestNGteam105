package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

public class BookingPage {

    public BookingPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    // para birimi olarak TL secelim
    @FindBy(xpath = "(//span[@aria-hidden='true'])[1]")
    public WebElement paraBirimiButtonu;
    @FindBy(xpath = "(//div[@class='bui-inline-container__main'])[54]")
    public WebElement trParaButtonu;

    // ulke olarak Turkiye yi secelim
    @FindBy(xpath = "//div[@class='bui-avatar bui-avatar--small']")
    public WebElement ulkeSecmeButtonu;
    @FindBy(xpath = "(//div[@class='bui-inline-container bui-inline-container--align'])[1]")
    public WebElement turkiyeSecmeButtonu;

    // sayfanin en altindan ulkeler kismini secelim
    @FindBy(xpath = "(//a[@data-ga='seoindexlinks'])[1]")
    public WebElement sayfaninEnAltindakiUlkelerButtonu;
    @FindBy(css = "div#countryTmpl div:nth-child(44) > div.block_header > h2 > a")
    public WebElement sayfaninEnAltindakiUlkelerButtonuTurkiye;


}
