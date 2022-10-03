package tests.day18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigurationProperties {

    @Test
    public void test01() {

        //amazona git
        String amznurl=ConfigReader.getProperty("amznUrl");
        Driver.getDriver().get(amznurl);

        //facebooka git
        String faceurl=ConfigReader.getProperty("faceUrl");
        Driver.getDriver().get(faceurl);

        Driver.closeDriver();

    }
}
