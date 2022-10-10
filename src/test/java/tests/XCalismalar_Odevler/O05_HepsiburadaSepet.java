package tests.XCalismalar_Odevler;

import org.apache.commons.math3.stat.interval.ConfidenceInterval;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HespsiburadaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class O05_HepsiburadaSepet {

    HespsiburadaPage hespsiburadaPage=new HespsiburadaPage();


    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("hbUrl"));


        ReusableMethods.Actions().sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.Actions().sendKeys(Keys.PAGE_DOWN).perform();
       Driver.getDriver().findElement(By.xpath("//*[text()='Sepete ekle']")).click();
       Driver.getDriver().findElement(By.xpath("//*[text()='Sepete ekle']")).click();


      //  List<WebElement> uruneTikla=hespsiburadaPage.urunler;

      //  hespsiburadaPage.urunler.forEach(t->t.click());

    }
}
