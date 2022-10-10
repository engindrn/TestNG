package tests.Practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerOkuTiklama;
import utilities.Driver;

public class P06_HerOkuTiklamapPage {

     HerOkuTiklama herOkuTiklama;
    Actions actions = new Actions(Driver.getDriver());


     //kodlarımızı yazrken clean kod kapsamında daha sade kod yazabilmek amacıyla
    //HER METHODDAM ULAŞABİLMEK İÇİN, ayrı bir object create temektense bu
    // objecti class seviyesinde instance olarak create edip
    //test methodlarında buna değer atamak ve kullanmak daha uygun bir yöntemdir


    @Test
    public void test01() {

        //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
        Driver.getDriver().get("https://testpages.herokuapp.com/styled/events/javascript-events.html");

        //Click all the buttons and verify they are all clicked
        herOkuTiklama=new HerOkuTiklama();

        herOkuTiklama.onBlur.click();
        herOkuTiklama.onClick.click();
        herOkuTiklama.onClick.click();
        actions.contextClick(herOkuTiklama.onContextMenu).
                doubleClick(herOkuTiklama.onDoubleClick).
                click(herOkuTiklama.onFocus).
                click(herOkuTiklama.onKeyDown)
                .sendKeys(Keys.ENTER).
                click(herOkuTiklama.onKeyUp).
                sendKeys(Keys.ENTER).
                click(herOkuTiklama.onKeyPress).
                sendKeys(Keys.ENTER).
                moveToElement(herOkuTiklama.onMouseOver).
                moveToElement(herOkuTiklama.mouseLeave).
                moveToElement(herOkuTiklama.onMouseOver).
                click(herOkuTiklama.mouseDown).perform();


    }

    @Test (dependsOnMethods = "test01")  //dependsOnMethods ile yaptığımız şey burayı çalıştırmadan önce tet01 çalışsın demekti diğer türlü hata alırdık
    public void test02() {
        Assert.assertEquals(herOkuTiklama.eventTriggered.size(), 11);

     /*   List<WebElement> clicked = herOkuTiklama.eventTriggered;
        Assert.assertEquals(clicked.size(),11);*/

    }
}
/*Rausable Classınndan method kullanarak*/

// herokuTestPage = new HerokuTestPage();
//         ReusableMethods.Actions().click(herokuTestPage.onBlurButton)
//         .sendKeys(Keys.TAB)
//         .doubleClick(herokuTestPage.onClickButton)
//         .sendKeys(Keys.TAB)
//         .contextClick(herokuTestPage.onContextMenuButton)
//         .sendKeys(Keys.TAB)
//         .doubleClick(herokuTestPage.onDoubleClickButton)
//         .sendKeys(Keys.TAB)
//         .click(herokuTestPage.onFocusButton)
//         .click(herokuTestPage.onKeyDownButton).sendKeys(Keys.DOWN)
//         .sendKeys(Keys.TAB)
//         .click(herokuTestPage.onKeyUpButton).sendKeys(Keys.TAB)
//         .click(herokuTestPage.onKeyPressButton).sendKeys(Keys.ENTER)
//         .dragAndDrop(herokuTestPage.onKeyPressButton,herokuTestPage.onMouseOverButton)
//         .dragAndDrop(herokuTestPage.onMouseOverButton,herokuTestPage.onMouseLeaveButton)
//         .moveToElement(herokuTestPage.onMouseDownButton).click(herokuTestPage.onMouseDownButton)
//         .perform();