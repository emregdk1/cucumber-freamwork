
Feature: US1007_KoalaResort Positive Login

  @rapor2
  Scenario: TC11 kullanici gecerli bilgilerle giris yapar

    Given kullanici "kr_url" sayfasina gider
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
