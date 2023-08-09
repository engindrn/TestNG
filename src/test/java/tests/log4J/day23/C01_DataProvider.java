package tests.log4J.day23;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_DataProvider {
AmazonPage amazonPage=new AmazonPage();

    @DataProvider
    public static Object[][] aranacakKelimeler() {
        return new Object[][]{{"java"},{"selenium"},{"samsung"},{"iphone"}};
    }

    @Test(dataProvider = "aranacakKelimeler")    //teste dataProvider ekledikten sonra üzerine gelip ekle dedik
    public void test01(String kelimeler) {                            //parametre atadık
        //amazona gideilim
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));

        //java, selenium, samsung ve iphone için arama yapalım
        amazonPage.searchBox.sendKeys(kelimeler, Keys.ENTER);       //tırnak kullamadan parametre yaz

        //sonuclarin aradigimiz kelime icerdigini test edelim
        String actualKelime=amazonPage.aramaSonucWE.getText();
        Assert.assertTrue(actualKelime.contains(kelimeler));


    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        Driver.closeDriver();

    }
}
