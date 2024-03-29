package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid2 {
    WebDriver driver;

    @Test
    public void test01() throws InterruptedException, MalformedURLException {
        driver=new RemoteWebDriver(new URL("http://192.168.0.31:4444"),new ChromeOptions());

        driver.get("https://www.bluerentalcars.com/");
        Thread.sleep(3000);
        String customerService=driver.findElement(By.xpath("//*[text()='Customer Services']")).getText();
        System.out.println("customerService = " + customerService);
        Thread.sleep(3000);
        System.out.println("Current Thread :"+Thread.currentThread());
        System.out.println("Blue Rental Title :"+ driver.getTitle());
        driver.quit();
    }
}
