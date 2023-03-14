@smoke
Feature: US0002 Test


  Scenario: Kullanici para birimi test eder

    Given Kullanici google adresine gider
    Then Kullanici cookies i kabul eder
    And Arama Kutusuna karsilastirma yapmak istedigi para birimlerini girer
    And Para birimlerinin karsilastirmasini alir
    Then Karsilastirilacak olan para biriminin 20 den kucuk oldugu test eder
