package tests.XCalismalar_Odevler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.TestBaseBeforeMethodAfterMethod;

public class O02_SoftAssert extends TestBaseBeforeMethodAfterMethod {

    @Test
    public void test01() {
        SoftAssert softAssert=new SoftAssert();

        //"htpps://zero.webappsecurity.com/" adresine gidin
        Driver.getDriver().get("http://zero.webappsecurity.com/");

        //sing in butonuna basın
        Driver.getDriver().findElement(By.xpath("//*[@id='signin_button']")).click();

        //Login kutusuna "username" yazin
     WebElement loginBox= Driver.getDriver().findElement(By.xpath("//*[@id='user_login']"));
     loginBox.sendKeys("username");

        //Password kutusuna "password" yazin
        WebElement passwordBox=Driver.getDriver().findElement(By.xpath("//*[@id='user_password']"));
        passwordBox.sendKeys("password");

        //Sign in tusuna basin
        Driver.getDriver().findElement(By.xpath("//*[@name='submit']")).click();

    }
}
