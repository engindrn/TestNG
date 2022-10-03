package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C02_BeforeClassAfterClass extends TestBaseBeforeMethodAfterMethod {

    @Test
    public void testAmazon() {
        driver.get("https://www.amazon.com");
    }

    @Test
    public void testBestbuy() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void testTechpro() {
        driver.get("https://www.techproeducation.com");
    }
}
