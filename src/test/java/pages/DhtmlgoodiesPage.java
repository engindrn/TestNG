package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DhtmlgoodiesPage {

     /* Bir page sayfası ilk oluşturulduğunda, ilk yapmamız gereken
     şey burada bir Constructor oluşturmak. Public olmak zorunda!

    this-> Driver class'indaki Driver.getDriver() 'i , Page class'indaki driver'a  esitledi/tanitti.
    PageFactory bizlere nesne deposu oluşturmaya imkan veren, sürdürülebilir,
    yeniden kullanılabilir ve elementleri tek bir yerden yönetmeyi sağlayan bir Page object model konseptidir.*/

    public DhtmlgoodiesPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    //capitals--baskentler

    @FindBy(xpath = "//div[@id='box1']")
    public WebElement oslo;

    @FindBy(xpath = "//div[@id='box2']")
    public WebElement stockholm;

    @FindBy(xpath = "//div[@id='box3']")
    public WebElement washington;

    @FindBy(xpath = "//div[@id='box4']")
    public WebElement kopenhag;

    @FindBy(xpath = "//div[@id='box5']")
    public WebElement seul;

    @FindBy(xpath = "//div[@id='box6']")
    public WebElement roma;

    @FindBy(xpath = "//div[@id='box7']")
    public WebElement madrid;

        //countries--ülkeler

    @FindBy(xpath = "//div[@id='box106']")
    public WebElement italy;

    @FindBy(xpath = "//div[@id='box107']")
    public WebElement spain;

    @FindBy(xpath = "//div[@id='box101']")
    public WebElement norway;

    @FindBy(xpath = "//div[@id='box104']")
    public WebElement denmark;

    @FindBy(xpath = "//div[@id='box105']")
    public WebElement southKorea;

    @FindBy(xpath = "//div[@id='box102']")
    public WebElement sweden;

    @FindBy(xpath = "//div[@id='box103']")
    public WebElement unitedStates;
}