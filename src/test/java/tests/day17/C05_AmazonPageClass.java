package tests.day17;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C05_AmazonPageClass {

    @Test
    public void test01() {
        AmazonPage amazonPage = new AmazonPage(); //pages klasından bir obje oluşturduk ordaki wenElementlere ulaşmak için
        Driver.getDriver().get("https://amazon.com");
        amazonPage.searchBox.sendKeys("Nutella", Keys.ENTER);

        Assert.assertTrue(amazonPage.aramaSonucWE.isDisplayed());
        System.out.println(amazonPage.aramaSonucWE.getText());

    }
}
