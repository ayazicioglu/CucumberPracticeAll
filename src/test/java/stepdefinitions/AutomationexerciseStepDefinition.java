package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationexercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationexerciseStepDefinition {
    AutomationexercisePage automationexercisePage=new AutomationexercisePage();
    Faker faker=new Faker();

    Actions actions=new Actions(Driver.getDriver());
    @Given("kullanici automationexercise sayfasina gider")
    public void kullanici_automationexercise_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("autoexerUrl"));

    }

    @Given("signup linkine tiklar")
    public void signup_linkine_tiklar() {
        automationexercisePage.signupLoginButton.click();
    }

    @Given("New user bolumune isim girer")
    public void new_user_bolumune_isim_girer() {
        String isim=faker.name().fullName();
        automationexercisePage.nameKutusu.sendKeys(isim);
    }

    @Given("email bolumune email adresi girer")
    public void email_bolumune_email_adresi_girer() {
        String email=faker.internet().emailAddress();
        automationexercisePage.emailKutusu.sendKeys(email);
    }

    @Given("signup butonuna basar")
    public void signup_butonuna_basar() {
        automationexercisePage.signupButon.click();
    }

    @Given("gelen sayfaya ilgili bilgileri girer")
    public void gelen_sayfaya_ilgili_bilgileri_girer() {
        automationexercisePage.mrButon.click();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(faker.internet().password()).sendKeys(Keys.TAB).
                sendKeys("12").sendKeys(Keys.TAB).
                sendKeys("Mar").sendKeys(Keys.TAB).
                sendKeys("1997").sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).
                sendKeys(faker.company().name()).sendKeys(Keys.TAB).
                sendKeys(faker.address().fullAddress()).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys("Canada").sendKeys(Keys.TAB).
                sendKeys(faker.address().state()).sendKeys(Keys.TAB).
                sendKeys(faker.address().city()).sendKeys(Keys.TAB).
                sendKeys(faker.address().zipCode()).sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().cellPhone()).perform();

    }

    @Given("create account butonuna basar")
    public void create_account_butonuna_basar() {
        automationexercisePage.createAccountButon.click();
    }

    @Then("hesap olustugunu test eder")
    public void hesap_olustugunu_test_eder() {
        Assert.assertTrue(automationexercisePage.basariliKayitYazisi.isDisplayed());
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }
}
