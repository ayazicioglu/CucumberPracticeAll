package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefinitions {

    GooglePage googlePage=new GooglePage();
    String actualSonuc;


    @When("Kullanici google adresine gider")
    public void kullanici_google_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
    }

    @Then("Kullanici cookies i kabul eder")
    public void kullanici_cookies_i_kabul_eder() {
        //cookie cıkmadigi icin kod yazilmadi
    }

    @And("Arama Kutusuna karsilastirma yapmak istedigi {string} para birimlerini girer")
    public void aramaKutusunaKarsilastirmaYapmakIstedigiParaBirimleriniGirer(String karsilastirilacakPara) {
        googlePage.aramaKutusu.sendKeys((karsilastirilacakPara)+Keys.ENTER);

    }

    @Then("Para birimlerinin karsilastirmasini alir")
    public void para_birimlerinin_karsilastirmasini_alir() {
        actualSonuc=  googlePage.sonucYazisi.getText().replaceAll(",",".");
        System.out.println("actualSonuc = " + actualSonuc);
    }


    @Then("Karsilastirilacak olan para biriminin {int} den kucuk oldugu test eder")
    public void karsilastirilacak_olan_para_biriminin_den_kucuk_oldugu_test_eder(Integer int1) {
     Assert.assertTrue(Double.parseDouble(actualSonuc)<int1);
    }


    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
}
