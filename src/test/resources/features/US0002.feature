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


    @hooks
  Scenario: ahmet istenilen karsilastirmayi yapsin

    And Arama Kutusuna karsilastirma yapmak istedigi "ZLOTY to Tl" para birimlerini girer
    Then Para birimlerinin karsilastirmasini alir
    Then Karsilastirilacak olan para biriminin 4 den kucuk oldugu test eder
    And Sayfayi kapatir


  @examples
  Scenario Outline: Kamil istenilen karsilastirmayi yapar

    And Arama Kutusuna karsilastirma yapmak istedigi "<istenilen karsilastirmalar>" para birimlerini girer
    Then Para birimlerinin karsilastirmasini alir
    Then Karsilastirilacak olan para biriminin 20 den kucuk oldugu test eder
    And Sayfayi kapatir

    Examples:
      | istenilen karsilastirmalar |
      | dollar to euro             |
      | Tl to Euro                 |
      | Tl to ZLOTY                |
      | Tl to Sterlin              |


    @conf
  Scenario Outline: configration ile arama testi
    And Arama Kutusuna karsilastirma yapmak istedigi "<istenilen karsilastirma>" para birimlerini girer
    Then Para birimlerinin karsilastirmasini alir
    Then Karsilastirilacak olan para biriminin 20 den kucuk oldugu test eder
    And Sayfayi kapatir

    Examples:
      | istenilen karsilastirma |
      | aramaYapilacakBirim        |
      | aramaYapilacakBirim1       |
      | aramaYapilacakBirim2       |
      | aramaYapilacakBirim3       |

