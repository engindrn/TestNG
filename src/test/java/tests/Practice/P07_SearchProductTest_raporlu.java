package tests.Practice;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchProducPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class P07_SearchProductTest_raporlu extends TestBaseRapor {

    SearchProducPage searchProducPage;

    @Test
    public void searchProducPage() {
        extentTest=extentReports.createTest("automationexcercise","Web automation");

        // 1. Tarayıcıyı başlat
        // 2. 'http://automationexercise.com' url'sine gidin
        Driver.getDriver().get("http://automationexercise.com");
        extentTest.info("   // 1. Tarayıcıyı başlat\n" +
                         "// 2. 'http://automationexercise.com' url'sine gidin");

        // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        String actualUrl= Driver.getDriver().getCurrentUrl();
        String expectedUrl= "https://automationexercise.com/";

        Assert.assertEquals(actualUrl,expectedUrl);
        extentTest.info("3. Ana sayfanın başarıyla görünür olduğunu doğrulayın");


        // 4. 'Ürünler' butonuna tıklayın
        searchProducPage=new SearchProducPage();
        searchProducPage.product.click();
        extentTest.info("4. 'Ürünler' butonuna tıklayın");


        // 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
        Assert.assertTrue(searchProducPage.allProducTitle.isDisplayed());
         /*ikinci doğrulama*/
        String productPageUrl="https://automationexercise.com/products";
        Assert.assertEquals(productPageUrl,Driver.getDriver().getCurrentUrl());
        extentTest.info("5.Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın");


        // 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
        searchProducPage.searchBox.sendKeys("blue top");  //action ile tab diyip enterda denebilir
        searchProducPage.searchButton.sendKeys(Keys.ENTER);
        extentTest.info("6. Arama girişine ürün adını girin ve ara düğmesine tıklayın");

        // 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
        Assert.assertTrue(searchProducPage.searchProductTitle.isDisplayed());
        extentTest.info("7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın");


    /*sayfadaki tüm ürüleri bu şekilde doğrulayabiliriz ürünlerin locatini page classda aldık
    burda liste akdardık not:testimizde tek ürün arandı"blue top"*/
 //       List<WebElement> urunlistesi = searchProducPage.aramadaCikanUrunler;
//        for (WebElement w:   urunlistesi      ) {
//            Assert.assertTrue(w.isDisplayed());
//            Thread.sleep(500);
//        }


        // 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın
        ReusableMethods.Actions().click(searchProducPage.viewProduct).perform();
        Assert.assertTrue(searchProducPage.blueTop.isDisplayed());
        extentTest.pass("Aramayla ilgili ürünün (\"blue top\") görünür olduğu doğrulandı");


    }


}
