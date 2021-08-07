package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\cucumber-raporlar.html","json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        //1- bu notasyonun görevi feature dosyalarim ile stepdefinition dosyalarini bislestirmek

        features="src/test/resources/features",
        glue="stepdefinitions",
        // böylece package'lari birbirine bagliyoruz
        // bu iki paket altinda kac tane class olursa olsun
        // herhangi bir class'da yazilan her adim diger class'lardaki adimlarla uyusursa yeni adim
        // olusturmaya gerek kalmaz


        tags="@rapor1", // work in progress
        //2- @ testNG ' deki group gibi calisir
        // eger sadece 1 Feature veya Scenerio calistiracaksak, gidip feature dosyasindan calistirabiliriz
        // birden fazla Feature veya Scenerio calistirmak istedigimizde
        // calistiracaginiz Feature veya Scenerio 'lara ortak bir tag atamamiz ve bu tag'i
        // runner'da belirtmemiz  gerekiyor
        // and denildiginde yazilan tag'larin tamamini tasiyanlar calisir
        // or denildiginde yazilan tag'lardan herhangi birine veya daha fazlasina sahip olanlar calisir
        // eger tüm test case'leri calistirmak isterseniz, tag'i yorum haline getirmemiz yeterli olur

        dryRun=false
        // true oldugunda test case'leri calistirmayi denemeden sadec eksik olan step'leri bana verir
        // false oldugunda test case'leri calistirmayi dener, eksik step bulursa onu rapor eder
                   )

public class TestRunner {
}
