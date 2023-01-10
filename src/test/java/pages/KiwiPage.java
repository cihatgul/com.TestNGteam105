package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class KiwiPage {

    public KiwiPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // 1- Cookies'i reddedin
    @FindBy(xpath = "(//div[text()='Reject all'])[2]")
    public WebElement CookiesRedEtButtonu;

    // 2- Sag ust kisimda dil kisimini tikliyoruz
    @FindBy(xpath = "(//div[@class='CountryFlag__StyledShadow-sc-ltfn8f-2 jxwlrI'])[1]")
    public WebElement dilSecimiButtonu;

    // 4- dili turkce ve para birimini tr yaptik buttona basalim burada
    @FindBy(xpath = "(//div[*='Save & continue'])[2]")
    public WebElement dilVeParaBirimiButtonu;

    // 5- gidis tarih buttonu
    @FindBy(xpath = "//*[text()='Gidiş']")
    public WebElement gidisTarihButtonu;

    // 6- tarih ayarlama buttonu
    @FindBy(xpath = "//*[text()='Tarihleri ayarla']")
    public WebElement tarihAyarlaButtonu;

    // 7- booking kaldirma buttonu
    @FindBy(xpath = "//div[@class='Checkbox__IconContainer-sc-1xqef2c-0 CULdd']")
    public WebElement bookingButtonu;

    // 8- arama buttonu
    @FindBy(xpath = "//*[text()='Ara']")
    public WebElement araButtonu;

    // 9- aktarmasiz secenek buttonu
    @FindBy(xpath = "(//div[@class='Radio__IconContainer-sc-crlwn1-1 ixtoRa'])[1]")
    public WebElement aktarmasizKisimButtonu;

    // 10- en ucuz bilet buttonu
    @FindBy(xpath = "//div[@data-test='SortBy-price']")
    public WebElement enUcuzButtonu;









}
