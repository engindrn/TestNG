package pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    /* Bir page sayfası ilk oluşturulduğunda, ilk yapmamız gereken
     şey burada bir Constructor oluşturmak. Public olmak zorunda!

    this-> Driver class'indaki Driver.getDriver() 'i , Page class'indaki driver'a  esitledi/tanitti.
    PageFactory bizlere nesne deposu oluşturmaya imkan veren, sürdürülebilir,
    yeniden kullanılabilir ve elementleri tek bir yerden yönetmeyi sağlayan bir Page object model konseptidir.*/

    public AmazonPage (){     //constructor oluşturup public yapmamız gerekir
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (id="twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy (xpath="//*[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucWE;

}
