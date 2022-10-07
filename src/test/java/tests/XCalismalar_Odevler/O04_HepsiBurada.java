package tests.XCalismalar_Odevler;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HespsiburadaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class O04_HepsiBurada {

    WebDriver driver= Driver.getDriver(); //Driver.getDrive methodumuzu driver webelemente aratık
                                // bu sayede sadece driver yazarak kullanabileceğiz
    HespsiburadaPage hespsiburadaPage = new HespsiburadaPage();

    @Test
    public void test01() {

        //Hepsiburada sayfasına gidiniz
        driver.get(ConfigReader.getProperty("hbUrl"));

        //Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım
        ReusableMethods.hover(hespsiburadaPage.elektronikOver);
        ReusableMethods.hover(hespsiburadaPage.pcTablet);

        //Her linkten sonra o sayfaya gittimizi test edelim ve o sayfanız resmini alalım



    }






     //Sayfayı kapatalım

}
