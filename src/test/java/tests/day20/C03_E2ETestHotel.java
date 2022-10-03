package tests.day20;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_E2ETestHotel {

    @Test
    public void testE2E() throws InterruptedException {

        // https://www.hotelmycamp.com adresine git.
        Driver.getDriver().get(ConfigReader.getProperty("hotelUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.singin.click();
      // Username textbox ve password metin kutularını locate edin ve asagidaki verileri
      // Username : manager
      // Password  : Manager1!
        hotelMyCampPage.username.sendKeys(ConfigReader.getProperty("userName"));
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password")).
                sendKeys(Keys.ENTER).perform();
               // Login butonuna tıklayın.enter yaptık

      // Hotel Management/Room reservation menusunden ADD ROOM RESERVATION butonuna tiklayin
        hotelMyCampPage.hotelManagementButton.click();
        hotelMyCampPage.roomReservationButton.click();
        hotelMyCampPage.addRoomReservation.click();

      // Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        Faker faker=new Faker();
        hotelMyCampPage.iduser1.sendKeys("manager");                 //İLK LOCATE İLE BAŞLAYIP ACTİONLA DEVAM ETTİK
        actions.sendKeys(Keys.TAB).sendKeys("Happy Hotel").
                sendKeys(Keys.TAB).sendKeys("1500").sendKeys(Keys.TAB).sendKeys("10/02/2022")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("10/13/2022").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("2").sendKeys(Keys.TAB).sendKeys("2")
                .sendKeys(Keys.TAB).sendKeys(faker.name().fullName()).sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB).sendKeys("skajdlaksjdaasd")
                .sendKeys(Keys.TAB).sendKeys(Keys.SPACE).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

      Thread.sleep(3000); /*hızlı geçiş olunca göremiyor beklettik*/
      // “RoomReservation was inserted successfully” textinin göründüğünü test edin.
        Assert.assertTrue(hotelMyCampPage.RoomReservationGorunumu.isDisplayed());

      // OK butonuna tıklayın.
        hotelMyCampPage.okbutonu.click();

    }
}
