package tests.day17;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C02_HardAssert extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test01() {
        //1-amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        //2-title in Amazon içerdigini test edin
        Assert.assertTrue(driver.getTitle().contains("Amazon"));

        //3-arama kutusnun erişilebilir oldugunu tets edin
       WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
       Assert.assertTrue(searchBox.isEnabled());

        //4-arama kutusuna Nuella yazıp aratın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella"+ Keys.ENTER);

        //5-arama yapıldıgını test edin
       WebElement sonuc= driver.findElement(By.className("sg-col-inner"));
       Assert.assertTrue(sonuc.isDisplayed());
        System.out.println(sonuc.getText());

        //sonucun nutella içerdiğini test edin
        Assert.assertTrue(sonuc.getText().contains("Nutella"));
       String [] sonucYazisi=sonuc.getText().split(" ");
        System.out.println(sonucYazisi[2]+sonucYazisi[5]);

/* NOT: HARD ASSERT TESTİN HERHANGİ BİR AŞAMASINDA FAİLD ALIRSAK TESTE DEVAM ETMEZ SONLANDIRIR*/



    }
}
