package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ultilities.Driver;

public class QualitydemyPage {

    public QualitydemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='btn btn-sign-in-simple']")
    public static WebElement ilkLoginButonu;

    @FindBy(id="login-email")
    public WebElement kullaniciImailKutusu;

    @FindBy(id="login-password")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[text='Login']")
    public WebElement loginButtonu;

    @FindBy(linkText = "My courses")
    public WebElement basariliGirisCoursesLinki;
}
