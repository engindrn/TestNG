package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HespsiburadaPage {

     public HespsiburadaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//*[text()='Elektronik'])[1]")
    public WebElement elektronikOver;

    @FindBy (xpath = "//*[text()='Bilgisayar/Tablet']")
    public WebElement pcTablet;

    @FindBy (xpath = "//h1")         //sayfaya girdikten sonra kendine ait titlelarını aldık
    public WebElement pageTitle;     //örn:   <h1 class="title">Anakart</h1>

    @FindBy (xpath = "//a[starts-with(@class,'sf-ChildMenuItems-OIXGN6gTcuAXz_dkh8Yv item')]")
    public List<WebElement> childMenuItems;

    @FindBy(xpath ="//a[starts-with(@class,'sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item')]" )
    public List <WebElement> ustBaslik;

//a[starts-with(@class,'sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item')]  başlıklar  14
    //a[starts-with(@class,'sf-ChildMenuItems-OIXGN6gTcuAXz_dkh8Yv item')] alt başlık 66


    @FindBy (xpath = "//*[@class='sf-dod-hIvuCH dbTj sgm36hrazsd']")
    public List<WebElement> urunler;


    @FindBy (xpath = "//*[text()='Sepete ekle']")
    public WebElement deneme;



}
