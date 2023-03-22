Feature: Web tables yazdirma

  Scenario: TC_17_kullanici_sirket_Prev_Close_alabilmeli

    Given Kullanici demoguru sayfasina gider
    And "Jagran Prakashan" sirketinin Prev.Close degerini yazdirir
    Then Sayfayi kapatir