package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HespsiburadaPage {

     public HespsiburadaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//*[text()='Elektronik'])[1]")
    public WebElement elektronikOver;

    @FindBy (xpath = "//*[text()='Bilgisayar/Tablet']")
    public WebElement pcTablet;

//a[starts-with(@class,'sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item')]  başlıklar  14
    //a[starts-with(@class,'sf-ChildMenuItems-OIXGN6gTcuAXz_dkh8Yv item')] alt başlık 66



}
