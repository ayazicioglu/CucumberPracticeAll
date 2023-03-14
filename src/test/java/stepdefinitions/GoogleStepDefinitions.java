package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefinitions {

    GooglePage googlePage=new GooglePage();
    String actualSonuc;

    @Given("kullanici google sayfasina gider")
    public void kullanici_google_sayfasina_gider() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("cookieleri kabul eder")
    public void cookieleri_kabul_eder() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Kullanici google adresine gider")
    public void kullanici_google_adresine_gider() {
        Driver.getDriver().get("https://www.google.com/");
    }

    @Then("Kullanici cookies i kabul eder")
    public void kullanici_cookies_i_kabul_eder() {
        //cookie cıkmadigi icin kod yazilmadi
    }
    @Then("Arama Kutusuna karsilastirma yapmak istedigi para birimlerini girer")
    public void arama_kutusuna_karsilastirma_yapmak_istedigi_para_birimlerini_girer() {
        googlePage.aramaKutusu.sendKeys("dolar to tl");
    }
    @Then("Para birimlerinin karsilastirmasini alir")
    public void para_birimlerinin_karsilastirmasini_alir() {
      actualSonuc=  googlePage.sonucYazisi.getText();
    }
    @Then("Karsilastirilacak olan para biriminin {int} den kucuk oldugu test eder")
    public void karsilastirilacak_olan_para_biriminin_den_kucuk_oldugu_test_eder(Integer int1) {
      int intActual= Integer.parseInt(actualSonuc.replaceAll("\\D",""));
        Assert.assertTrue(intActual<int1);
    }


}
