@GT1
Feature: GT1001 Kullanici hesap olusturur

  Scenario: GT Kullanici web sayfasinda bilgiler girerek yeni hesap olusturur.

  Given kullanici automationexercise sayfasina gider
    And signup linkine tiklar
    And New user bolumune isim girer
    And email bolumune email adresi girer
    And signup butonuna basar
    And gelen sayfaya ilgili bilgileri girer
    And create account butonuna basar
    Then hesap olustugunu test eder
    And sayfayi kapatir


