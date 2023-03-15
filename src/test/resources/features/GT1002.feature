@GT2
Feature: GT1002 Kullanici verilen sitede test yapar

  Scenario: TC1 Kullanici liste alabilmeli

    Given Kullanici demoguru sayfasina gider
    Then Kullanici web sayfasini konsolda yazdiri
    And DCB Bank'in listede oldugunu test eder
    Then sayfayi kapatir

