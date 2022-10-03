
package tests.day20;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_SmokeNagatifTestHotel {

    @Test
    public void yanlisKullanici() {

        // 1.Senoryo: yanlış kullanıcı, doğru şifre
        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelUrl"));
        HotelMyCampPage hmcPage = new HotelMyCampPage();

        //login butonuna bas
        hmcPage.singin.click();

        //test data username: manager1 ,  test data password : manager1!
        hmcPage.username.sendKeys(ConfigReader.getProperty("hmcWrongUserName"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password"))
                .sendKeys(Keys.ENTER).perform();

        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hmcPage.girisYapilamadi.isDisplayed());
        //Sayfayı kapatınız
        Driver.closeDriver();
    }
    @Test
    public void yanlisSifre() {
        //2.Seneryo: Doğru kullanıcı, Yanlış Şifre
        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelUrl"));
        HotelMyCampPage hmcPage = new HotelMyCampPage();

        //login butonuna bas
        hmcPage.singin.click();

        //test data username: manager1 ,  test data password : manager1!
        hmcPage.username.sendKeys(ConfigReader.getProperty("userName"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hmcWrongPassword"))
                .sendKeys(Keys.ENTER).perform();

        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hmcPage.girisYapilamadi.isDisplayed());
        //Sayfayı kapatınız
        Driver.closeDriver();
    }
    @Test
    public void yanlisKullaniciSifre() {
        // 3. Senoryo: Yanlış kullanıcı, Yanlış şifre
        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelUrl"));
        HotelMyCampPage hmcPage = new HotelMyCampPage();

        //login butonuna bas
        hmcPage.singin.click();

        //test data username: manager1 ,  test data password : manager1!
        hmcPage.username.sendKeys(ConfigReader.getProperty("hmcWrongUserName"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hmcWrongPassword"))
                .sendKeys(Keys.ENTER).perform();

        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hmcPage.girisYapilamadi.isDisplayed());
        //Sayfayı kapatınız
        Driver.closeDriver();
    }
}

