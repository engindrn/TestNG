package tests.day19;

import org.testng.annotations.Test;
import utilities.Driver;

public class C01_SingletonPattern {

    @Test
    public void test01() {
        //Driver obj = new Driver();
        //obj.getDriver().get(ConfigReader.getProperty("amznUrl"));

        /*
        SingletonPattern : tekli kullanım demektir. Bir class'ın farklı class'lardan
        obje oluşturarak kullanımını engellemektir.
         */


        //POM'de Driver class'indaki getDriver()'nin obje olusturularak kullanilmasini engellemek icin
//Singleton pattern kullanimi benimsenmistir.

//Singleton Pattern -> tekli kullanim, bir class'in farkli class'lardan
// obje olusturularak kullanimini engellemek icin kullanilir.
// Bunu saglamak icin yapmamiz gereken sey oldukca basit
// obje olusturmak icin kullanilan constructor'i private yaptiginizda
// baska class'larda Driver class'indan obje olusturulmasi mumkun OLAMAZ

    }
}
