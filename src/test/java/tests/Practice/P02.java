package tests.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

import java.util.List;

public class P02 extends TestBaseBeforeMethodAfterMethod {

    // ...Exercise3...
    // go to url : https://www.techlistic.com/p/selenium-practice-form.html
    //fill the firstname
    //fill the lastname
    //check the gender
    //check the experience
    //fill the date
    //choose your profession -> Automation Tester
    //choose your tool -> Selenium Webdriver
    //choose your continent -> Antartica
    //choose your command  -> Browser Commands
    //click submit button


    @Test
    public void test01() {
        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        //COOKİES
        driver.findElement(By.xpath("//*[@id='ez-accept-all']")).click();

        //fill the firstname
        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("ENGİN");

        //fill the lastname
        driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("DRN");

        //check the gender
        driver.findElement(By.xpath("//*[@id='sex-0']")).click();

        //check the experience
        driver.findElement(By.xpath("//*[@id='exp-2']")).click();

        //fill the date
        driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("15.07.1987");

        //choose your profession -> Automation Tester
        driver.findElement(By.xpath("//*[@id='profession-1']")).click();

        //choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//*[@id='tool-2']")).click();

        //choose your continent -> Antartica
        WebElement dropdownContinent =  driver.findElement(By.xpath("//select[@id='continents']"));
        Select select = new Select(dropdownContinent);
        select.selectByVisibleText("Antartica");

        /*2.yol
        driver.findElement(By.xpath("//*[@id='continents']")).sendKeys("Antartika");*/

       // 3.yol
        List<WebElement> ddmlist= select.getOptions();
        for (WebElement w:ddmlist) {
            System.out.println(w.getText());
        }


        //choose your command  -> Browser Commands
        //1.YOL
        /*WebElement dropDownCommand = driver.findElement(By.xpath("//select[@id='selenium_commands']"));
        Select select2 = new Select(dropDownCommand);
        select2.selectByVisibleText("Browser Commands");*/

        //2.YOL
        driver.findElement(By.xpath("//select[@id='selenium_commands']/option[1]")).click();

        //click submit button
        driver.findElement(By.xpath("//*[@id='submit']")).click();

    }
}
