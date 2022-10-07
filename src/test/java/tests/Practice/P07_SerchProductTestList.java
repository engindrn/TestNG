package tests.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchProducPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class P07_SerchProductTestList {

    SearchProducPage searchProducPage;

    @Test
    public void test01() throws InterruptedException {
        searchProducPage=new SearchProducPage();

        // 1. Tarayıcıyı başlat
        // 2. 'http://automationexercise.com' url'sine gidin
        Driver.getDriver().get("http://automationexercise.com");

        // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        String actualUrl= Driver.getDriver().getCurrentUrl();
        String expectedUrl= "https://automationexercise.com/";
        Assert.assertEquals(actualUrl,expectedUrl);

        // 4. 'Ürünler' butonuna tıklayın
        searchProducPage=new SearchProducPage();
        searchProducPage.product.click();

        // 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
        Assert.assertTrue(searchProducPage.allProducTitle.isDisplayed());
        /*ikinci doğrulama*/
        String productPageUrl="https://automationexercise.com/products";
        Assert.assertEquals(productPageUrl,Driver.getDriver().getCurrentUrl());

        // 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
        searchProducPage.searchBox.sendKeys("blue");  //action ile tab diyip enterda denebilir
        searchProducPage.searchButton.sendKeys(Keys.ENTER);

        //7. sayfadaki tüm ürünlerin görünür old doğrulayın
             List<WebElement> urunlistesi = searchProducPage.aramadaCikanUrunler;

           for (WebElement w:   urunlistesi ) {
            Assert.assertTrue(w.isDisplayed());
           Thread.sleep(500);
           }
            System.out.println(urunlistesi.size());
    }
}
