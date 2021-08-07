
Feature: US1003_Yandex Arama

  Background: Kullanici Yandex anasayfasina gider
    Given Kullanici Yandex anasayfasina gider

    Scenario: TC05_IPhone arama
      When Yandex'te iPhone icin arama yapar
      Then Yandex'te sonuclarin iPhone icerdigini test eder

    Scenario: TC06_tea pot arama
      When Yandex'te tea pot icin arama yapar
      Then Yandex'te sonuclarin tea pot icerdigini test eder
      And sayfayi kapatir

#      1- feature dosyasi olusturup, insan olarak yapacagim adimlari yaziyorum
#      2- Eksik step definitions'lari elde etmek icin, testimizi calistiriyoruz
#         eger Feature dosyasindan calistirirsak calisan adimlari run eder ve eksik kalan adimlari bize verir
#         eger varolan adimlari calistirmadan, direkt olarak eksik step'leri versin istiyorsak
#         runner'a gidip dryRun'i true yapariz, eksik step'leri aldiktan sonra yeniden false yapariz
#      3- eksik step'leri kopyalayip, stepDefinition class'ina yapistiririz
#      4- step'leri calistiracak Java kodlarimizi method'larin icine yazariz
#      5- Locate ihtiyacimiz olursa page class'i olusturup, gerekli Locate'leri yapariz
#           step definition class'inda birden fazla method'da page objesini kullanacagim icin
#           page objesini class leval'da (instance) olustururum