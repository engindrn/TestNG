package tests.day18;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_ConfigReaderHotelNagativeTest {

    @Test
    public void testNegative() {
      //  1 ) Bir Class olustur : NegativeTest
      //  2) Bir test method olustur NegativeLoginTest()
      //  https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();    //pozitivi yaparken page classımızı hazırlamıştık
                                                                 //locate lerimiz hazır obje olş kullanacaz
      //  login butonuna bas
        hotelMyCampPage.singin.click();

      //  test data username: manager1 ,  test data password : manager1!
        hotelMyCampPage.username.sendKeys(ConfigReader.getProperty("hmcWrongUserName"));
        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("hmcWrongPassword"));
        hotelMyCampPage.login.click();

      //  Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hotelMyCampPage.girisYapilamadi.isDisplayed());

        //sayfayi kapat
        Driver.closeDriver();

    }
}
