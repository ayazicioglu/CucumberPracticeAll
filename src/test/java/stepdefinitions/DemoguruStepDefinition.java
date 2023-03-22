package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.DemoguruPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.*;

public class DemoguruStepDefinition {

    DemoguruPage demoguruPage=new DemoguruPage();
    Set<String> tableStr=new HashSet<>();

    @Given("Kullanici demoguru sayfasina gider")
    public void kullanici_demoguru_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("demoguruUrl"));
    }
    @Then("Kullanici web sayfasini konsolda yazdiri")
    public void kullanici_web_sayfasini_konsolda_yazdiri() {

        int sayi=1;
        for (WebElement each:demoguruPage.tableElement
             ) {
            System.out.println(sayi+"--"+each.getText());
            sayi++;
            tableStr.add(each.getText());
        }

    }
    @Then("DCB Bank'in listede oldugunu test eder")
    public void dcb_bank_in_listede_oldugunu_test_eder() {
        boolean sonuc=tableStr.contains("DCB Bank");
        System.out.println(tableStr);
        Assert.assertTrue(sonuc);
    }
//========================================================================================================
    @And("{string} sirketinin Prev.Close degerini yazdirir")
    public void sirketininPrevCloseDegeriniYazdirir(String sirketAdi) {
        Map<String, String> tableMap = new HashMap<>();

    }
    //=====================================================================================================
}
