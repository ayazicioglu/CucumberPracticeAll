package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.HealPage;
import utilities.Driver;
import utilities.HealMethods;

public class HealStepdefinitions {
    HealPage healPage=new HealPage();
    @Given("Browser acilir")
    public void browser_acilir() {

    }
    @Then("Admin login sayfasina gidilir")
    public void admin_login_sayfasina_gidilir() {

    }
    @Then("Gecerli bilgilerle giris yapilir")
    public void gecerli_bilgilerle_giris_yapilir() {
        HealMethods.loginAsAdmin("ahmet.yazicioglu.admin@heallifehospital.com","heallife123");
    }
    @Then("Billing linkine tiklanir")
    public void billing_linkine_tiklanir() {
        HealMethods.clickASidebarLink("Billing");
    }
    @Then("Search box test yapilir")
    public void search_box_test_yapilir() {
       Driver.getDriver().findElement(By.xpath("//*[text()='OPD']"));
        //HealMethods.makeSearchBoxTest();

    }
    @Then("all100 test yapilir")
    public void all100_test_yapilir() {
       HealMethods.makeAll100Test();
    }
    @Then("iconTest yapilir")
    public void icon_test_yapilir() {
        HealMethods.makeIconTest();
    }
}
