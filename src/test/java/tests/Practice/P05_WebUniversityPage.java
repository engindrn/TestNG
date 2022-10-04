package tests.Practice;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebUniversityPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P05_WebUniversityPage {
    /* Keşif Testi (Exploratory Testing) , test senaryolarının önceden oluşturulmadığı, testçilerin sistemi test
     anında kontrol ettiği bir tür yazılım testidir. Herhangi bir test senaryosuna bağlı kalmaksızın yazılımları
     serbestçe keşfederek buldukları bug’ları raporlamasına dayanır. Test uzmanlarının minimum planlama ve maksimum
     test uygulamasına katıldığı uygulamalı bir yaklaşımdır. Testin yürütülmesinden önce neyin test edileceğine dair
     fikirleri not edebilirler.
    Keşif Testi (Exploratory Testing), diğer test yaklaşımlarında kolayca kapsanmayan hataları ve eksiklikleri keşfetmeye,
    ortaya çıkarmaya dayanır. Özellikle yazılım test döngüsünün başlarında sıkça başvurulan bir test türüdür. Test uzmanı
     açısından ise istediği şekilde son kullanıcı senaryoları oluşturma imkanı olduğu için eğlencelidir. */









    @Test

    // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
    public void test01() throws InterruptedException {
        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");

    // Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
        WebUniversityPage webUniversityPage=new WebUniversityPage();
        Actions actions=new Actions(Driver.getDriver());

    List<String> workList= new ArrayList<>(Arrays.asList("Kahvaltıyı hazırla","Bulaşıkları yıka","Bebekle ilgilen","Çocuğunun ödevine yardım et","Selenyum çalış","Uyu"));
    /*budaki listeyi todo liste tek tek eklemek yerine toplu göndermek için bir list oluşturduk aslist  methoduyla ekledik
     bunları foreach loop ile ekliyeceğiz*/

        for (String w:workList) {
         actions.click(webUniversityPage.addNewToDo).sendKeys(w, Keys.ENTER).perform();//önce actionla tıkladık ekledik
        }


          /*  for (String w:workList) {
               webUniversityPage.addNewToDo.sendKeys(w, Keys.ENTER);
        }

        lambda ile
        workList.forEach(t->webUniversityPage.addNewTodo.sendKeys(t, Keys.ENTER));
         */

    //Tüm yapılacakların üzerini çiz.
      List <WebElement> todos=  webUniversityPage.todoswWebElement;

        for (WebElement w:todos) {
            w.click();
        }

     //Tüm yapılacakları sil.
        List<WebElement> deleteButtons= webUniversityPage.deleteButtonsWebEelement;

        for (WebElement w:deleteButtons) {
            w.click();
        }
     /*lambda ile == webUniversityPage.deleteButtons.forEach(t->t.click());  */


        Thread.sleep(3000);
        //Tüm yapılacakların silindiğini doğrulayın.  //li tagı olmaması aslında listenin boş old gösterir
       List <WebElement> newtodos= webUniversityPage.todoswWebElement;   //listin size ina bakacağız liste
        Assert.assertTrue(newtodos.size()==0);

        //Assert.assertEquals(0,newtodos.size());

    }

}
