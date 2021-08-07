
Feature:US1006_Farkli Url Calistirma

  @rapor1
  Scenario Outline:

    Given kullanici "<sayfaUrl>" sayfasina gider



    Examples:
    |sayfaUrl|
    |amazon_url|
    |yandex_url|
    |facebook_url|