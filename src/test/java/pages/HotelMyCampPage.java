package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {
    public HotelMyCampPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "(//*[@class='nav-link'])[7]")
    public WebElement singin;

    @FindBy (xpath = "//*[@id='UserName']")
    public WebElement username;

    @FindBy (xpath = "//*[@id='Password']")
    public WebElement password;

    @FindBy (id = "btnSubmit")
    public WebElement login;

    @FindBy (xpath = "//*[text()='User Management']")
    public WebElement girisYapildi;

    @FindBy (xpath = "//*[text()='Try again please']")   //negative testimiz için locate ettik
    public WebElement girisYapilamadi;

    @FindBy(xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagementButton;

    @FindBy (xpath = "//*[@href='/admin/RoomReservationAdmin']")
    public WebElement roomReservationButton;

    @FindBy(xpath = "//*[text()='Add Room Reservation ']")
    public WebElement addRoomReservation;

    @FindBy (xpath = "//*[@id='IDUser']")
    public WebElement iduser1;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement RoomReservationGorunumu;

    @FindBy (xpath = "//*[text()='OK']")
    public WebElement okbutonu;


}