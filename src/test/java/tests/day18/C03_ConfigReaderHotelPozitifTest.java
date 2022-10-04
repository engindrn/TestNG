package tests.day18;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_ConfigReaderHotelPozitifTest {
    @Test (groups = "grp2")
    public void test01() {
     //  Bir Class olustur : PositiveTest
     //  2) Bir test method olustur positiveLoginTest()
     //  https://www.hotelmycamp.com/ adresine git  login butonuna bas

        Driver.getDriver().get(ConfigReader.getProperty("hotelUrl"));//driver classındaki statik methodlarımıza ulaştık
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage(); //pages clasındaki webElementlere ulaşabilmek için obje olşturduk
        hotelMyCampPage.singin.click();//objemizi kullanarak o classdaki elemente ulaştık

     //  test data username: manager
     // test data password : Manager1!


        String userName=ConfigReader.getProperty("userName");     //bu şekilde de yapılabilir
        hotelMyCampPage.username.sendKeys(userName);
       // hotelMyCampPage.username.sendKeys(ConfigReader.getProperty("userName"));
        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("password"));
        hotelMyCampPage.login.click();

     //  Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
       Assert.assertTrue(hotelMyCampPage.girisYapildi.isDisplayed());
        Driver.closeDriver();
    }
}
