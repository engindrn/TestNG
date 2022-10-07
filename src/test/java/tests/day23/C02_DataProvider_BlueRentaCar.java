package tests.day23;

import org.openqa.selenium.Keys;
import org.openqa.selenium.ScriptTimeoutException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BlueRentaCarPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C02_DataProvider_BlueRentaCar {

/*NEGATİV TEST*/
    BlueRentaCarPage blueRentaCarPage;

    @DataProvider
    public static Object[][] kullanicilar() {
        return new Object[][]{{"erol@gmail.com","12345"},{"evren@gmail.com","45678"},{"ahmet@gmail.com","98765"}};
    }
    @Test (dataProvider = "kullanicilar")
    public void test01(String userEmail, String password) {
        blueRentaCarPage=new BlueRentaCarPage();

        //-https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("bluerentUrl"));

        // -login butonuna bas
        blueRentaCarPage.loginButton.click();

        //Data provider ile 3 farklı userEmail ve 3 farklı password girelim
        blueRentaCarPage.userEmail.sendKeys(userEmail);
        ReusableMethods.Actions().sendKeys(Keys.TAB).sendKeys(password).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();//login butonuna tiklayin


        //Degerleri girildiginde sayfaya basarili sekilde ****girilemedigini***** test et
        Assert.assertTrue(blueRentaCarPage.ikinciLogin.isDisplayed());

    }
}
//ReusableMethods.getSoftAssert().assertTrue(blueRentalCarsPage.girisDogrula.isDisplayed());
//ReusableMethods.getSoftAssert().assertAll();