package tests.log4J;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.io.IOException;
public class Log4Jdeneme {

    private static Logger logger = LogManager.getLogger(Log4Jdeneme.class.getName());  //obje oluşturduk

    @Test
    public void test01() throws IOException {

        logger.info("hepsiburada sitesine gidilir");
        //Hepsiburada sayfasına gidiniz
        Driver.getDriver().get("https://hepsiburada.com");

        logger.info("ekran görüntüsü alinir");
        //Ve sayfanın resmini alınız
        ReusableMethods.getScreenshot("hepsiburada");

        logger.info("sayfa kapatilir");
        //Sayfayı kapatınız
        Driver.closeDriver();
    }

    @Test
    public void test02() throws IOException, InterruptedException {
        //amazona gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
        AmazonPage amazonPage = new AmazonPage();

        //nutella aratınız
        amazonPage.searchBox.sendKeys("Nutella", Keys.ENTER);

        //arama sonuç yazısının ekran görüntüsünü alınız
        // ReusableMethods.getScreenshotWebElement("aramaSonucWE",amazonPage.aramaSonucWE);
        ReusableMethods.getScreenshotWebElement("webelement", amazonPage.aramaSonucWE);

    }
}