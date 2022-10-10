package tests.XCalismalar_Odevler;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HespsiburadaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class O04_HepsiBurada {

    WebDriver driver= Driver.getDriver(); //Driver.getDrive methodumuzu driver webelemente aratık
                                // bu sayede sadece driver yazarak kullanabileceğiz
    HespsiburadaPage hespsiburadaPage = new HespsiburadaPage();

    @Test
    public void test01() throws IOException {

        //Hepsiburada sayfasına gidiniz
        driver.get(ConfigReader.getProperty("hbUrl"));
        Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains("hepsiburada"));

        //Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım
        //Her linkten sonra o sayfaya gittimizi test edelim ve o sayfanız resmini alalım


            for (int i = 0; i <66; i++) {

                hespsiburadaPage.elektronikOver.click();
                ReusableMethods.waitFor(2);
                ReusableMethods.Actions().moveToElement(hespsiburadaPage.pcTablet).perform();
                ReusableMethods.waitFor(2);
                hespsiburadaPage.childMenuItems.get(i).click();   //listteki webElementlerimizi forloop kullnarak
                                                                //sırayla alıyoruz
                Assert.assertTrue(hespsiburadaPage.pageTitle.isDisplayed());
                ReusableMethods.getScreenshot("Hepsiburada "+ hespsiburadaPage.pageTitle.getText() + " sayfasi ");
                Driver.getDriver().navigate().back();
        }

        //Sayfayı kapatalım
        Driver.closeDriver();

    }

    @Test
    public void test02() throws IOException {
        //childMeünüleri üzeirndeki 14 adet menüyede aynı işlemi yapınız
        //Hepsiburada sayfasına gidiniz
        driver.get(ConfigReader.getProperty("hbUrl"));
        Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains("hepsiburada"));

        for (int i = 0; i <14; i++) {
            hespsiburadaPage.elektronikOver.click();
            ReusableMethods.waitFor(2);
            ReusableMethods.Actions().moveToElement(hespsiburadaPage.pcTablet).perform();
            ReusableMethods.waitFor(2);
            hespsiburadaPage.ustBaslik.get(i).click();
            Assert.assertTrue(hespsiburadaPage.pageTitle.isDisplayed());
            ReusableMethods.getScreenshot("ustBaslik"+hespsiburadaPage.pageTitle.getText()+" sayfasi");
            Driver.getDriver().navigate().back();
        }
      Driver.closeDriver();

    }
}
/*locate ettiğimiz webelement test edilecek bölge dışınıda kapsıyorsa yani aynı locate ile başka bölgede
* kapsanıyorsa fori ile istediğimiz webElemente kadar (66) sınırladık bu yüzden foreach kullanamayız*/