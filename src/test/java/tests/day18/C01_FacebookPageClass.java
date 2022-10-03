package tests.day18;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C01_FacebookPageClass {

    @Test
    public void test01() {

     //  https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com");
        Driver.getDriver().findElement(By.xpath("//*[text()='Temel ve isteğe bağlı çerezlere izin ver'] ")).click();
        FacebookPage facebookPage= new FacebookPage();
        Faker faker=new Faker();

    //  POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
      /*pages dosyasında Facebookpage de locatelerimizi aldık*/


     //  Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        facebookPage.email.sendKeys(faker.internet().emailAddress());
        facebookPage.sifre.sendKeys(faker.internet().password());
        facebookPage.login.click();

     //  Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girisYapilmadi.isDisplayed());
    }
}

/* faker ile giris yapilamadiginda yada dogru bi email yakaladiginda try catch'le cozumu
        try {
            String actualText = facebookPage.girisYapilamadi.getText();
            Assert.assertTrue(actualText.contains("Facebook"));
        } catch (Exception e) {
            String acturalText2 = facebookPage.getGirisYapilamadiEvetBendim.getText();
            Assert.assertTrue(acturalText2.contains("Evet, Devam Et"));
        }

 */
