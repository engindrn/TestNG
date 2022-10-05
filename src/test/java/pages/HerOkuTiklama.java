package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerOkuTiklama {

   public HerOkuTiklama(){
       PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (xpath = "//*[@id='onblur']")      //bir üzerine bir başka bir alana tıklamamız gereki
    public WebElement onBlur;

   @FindBy (xpath = "//*[@id='onclick']")      //üzerine tıklamamız yeterli-iki kere tıklarsak üstekide aktif olur
    public WebElement onClick;                  //birinci tık yukardakinin ilk tıkı oldu aktif oldu

   @FindBy (xpath = "//*[@id='oncontextmenu']")  //sağ click yapılması gerekir
    public WebElement onContextMenu;
   @FindBy (xpath = "//*[@id='ondoubleclick']")  //çift tıklama
    public WebElement onDoubleClick;

   @FindBy (xpath = "//*[@id='onfocus']")   //tek tık
    public WebElement onFocus;

   @FindBy (xpath = "//*[@id='onkeydown']")  //tıklamadan sonra bir tuşa basmak gerekir
    public WebElement onKeyDown;

   @FindBy (xpath = "//*[@id='onkeyup']")  //tıklamadan sonra bir tuşa basmak gerekir
    public WebElement onKeyUp;

   @FindBy (xpath = "//*[@id='onkeypress']")  //tıklamadan sonra bir tuşa basmak gerekir
    public WebElement onKeyPress;

   @FindBy (xpath = "//*[@id='onmouseover']")      //üzerine gelince aktif olur
    public WebElement onMouseOver;

    @FindBy (xpath = ("//button[@id='onmouseleave']"))  //üzerine gelip tekar çekince aktif olur
    public WebElement mouseLeave;

    @FindBy (xpath = ("//button[@id='onmousedown']"))  //tıklayınca çalışr
    public WebElement mouseDown;

    @FindBy(xpath = "//*[text()='Event Triggered']")  //hepsinin tıklandığını doğrulamak için tıkladıktan sonra
    public List<WebElement> eventTriggered;       //altlarında çıkan evetTriggered (olay tetiklendi) yazısını aldık
                                                //başlık hariç 11 adet var liste attık


}
