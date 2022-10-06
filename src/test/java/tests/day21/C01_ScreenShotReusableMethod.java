package tests.day21;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.image.Kernel;
import java.io.IOException;
import java.io.ObjectInputFilter;

public class C01_ScreenShotReusableMethod {

    @Test
    public void test01() throws IOException {

        //hepsiburada sayfasına gidiniz ve sayfanın resmini alınız
        Driver.getDriver().get("https://www.hepsiburada.com");

        //sayfanın resmini reusable methodla alınız
        ReusableMethods.getScreenshot("hepsiburada");

        //sayfayi kapat
        Driver.closeDriver();

    }

    @Test
    public void test02() throws IOException, InterruptedException {
        //amazona gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
        AmazonPage amazonPage=new AmazonPage();

        //nutella aratınız
        amazonPage.searchBox.sendKeys("Nutella", Keys.ENTER);

        //arama sonuç yazısının ekran görüntüsünü alınız
       // ReusableMethods.getScreenshotWebElement("aramaSonucWE",amazonPage.aramaSonucWE);
        ReusableMethods.getScreenshotWebElement("webelement",amazonPage.aramaSonucWE);

    }
}
