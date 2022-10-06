package tests.day22;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BlueRentaCarPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {        //utilities deki testbaserapor clasını parent yaptık
                                                            //rapor alabilmek için

    BlueRentaCarPage blueRentaCarPage=new BlueRentaCarPage();
    Actions actions=new Actions(Driver.getDriver());

    @Test
    public void test01() {
        /*TestBase classından obje oluşturarak parant calasımızdaki metodlara ulaştık  */
        extentTest=extentReports.createTest("Pozitif Test","Geçerli kullanıcı adı ve password ile giriş yapıldı");

        //-https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("bluerentUrl"));
        extentTest.info("sayfaya gidildi");

        // -login butonuna bas
        blueRentaCarPage.loginButton.click();
        extentTest.info("login e basıldı");

     // -test data user email: customer@bluerentalcars.com
        blueRentaCarPage.userEmail.sendKeys(ConfigReader.getProperty("blueemail"));

     // -test data password : 12345 dataları girip login e basın
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("bluepassword")).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
                                         // -login butonuna tiklayin
        extentTest.info("doğru kullanici email ve passwor girildi");
        extentTest.info("login butonuna actions callası kullanılarak enter dedik");


        // -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
            String actualUserName= blueRentaCarPage.basariliGiris.getText();
            String expectedUserName= "John Walker";
            Assert.assertEquals(expectedUserName,actualUserName);

        extentTest.pass("sayfaya başarılı girdi");

    }
}

//eğer hata raporu alırsak ve raporda resmi görüntülemek istersek rapor üzerine sağ click
//open, explorer secip resimli raporu görüntüleyebiliriz.

/*
Hatanin resmini RAPORDA görmek istersek  target altinda Rapor icinde rapor uzernie sag tiklayin --->
Open in --> uzerine gelin -->  Explorer tiklayin bilgisayardaki dosyaninzin icine yönleneceksiniz
oradan raporu cift tiklayin acilan yeni sayfada alta kucuk resim var uzerini tiklayin
ve karsimiza resim cikmis olacak .

 */