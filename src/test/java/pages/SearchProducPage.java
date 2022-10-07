package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SearchProducPage {

    public SearchProducPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//*[text()=' Products']")
    public WebElement product;

    @FindBy(xpath = "//*[text()='All Products']")
    public WebElement allProducTitle;

    @FindBy(xpath = "//*[@id='search_product']")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@id='submit_search']")
    public WebElement searchButton;

    @FindBy (xpath = "//h2[contains(text(),'Searched Products')]")  //   (//h2)[3]
    public WebElement searchProductTitle;

    @FindBy (linkText = "View Product")
    public WebElement viewProduct;

    @FindBy (xpath = "(//h2)[3]")
    public WebElement blueTop;

    @FindBy(xpath = "//div[@class='productinfo text-center']")    //sayfadaki ürünlerin hepsini liste atıp yüklendiklerini
    public List<WebElement> aramadaCikanUrunler;         //doğrulaycağız


}