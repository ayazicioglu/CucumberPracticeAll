@smoke
Feature: US0002 Test
  Background: Ortak adimlar
    Given Kullanici google adresine gider
    Then Kullanici cookies i kabul eder

  Scenario: Kullanici google sitesinde kur karsilastirmasi yapabilmeli


    And Arama Kutusuna karsilastirma yapmak istedigi "dollar to euro" para birimlerini girer
    And Para birimlerinin karsilastirmasini alir
    Then Karsilastirilacak olan para biriminin 20 den kucuk oldugu test eder
    And Sayfayi kapatir


  Scenario: t108 Kullanici istenilen karsilastirmayi yapabilmeli

    And Arama Kutusuna karsilastirma yapmak istedigi "Tl to Euro" para birimlerini girer
    Then Para birimlerinin karsilastirmasini alir
    Then Karsilastirilacak olan para biriminin 20 den kucuk oldugu test eder
    And Sayfayi kapatir


  Scenario: ahmet istenilen karsilastirmayi yapsin

    And Arama Kutusuna karsilastirma yapmak istedigi "Tl to ZLOTY" para birimlerini girer
    Then Para birimlerinin karsilastirmasini alir
    Then Karsilastirilacak olan para biriminin 20 den kucuk oldugu test eder
    And Sayfayi kapatir
