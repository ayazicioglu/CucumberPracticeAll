package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.EditorPage;
import utilities.ConfigReader;
import utilities.Driver;

public class EditorStepDefinition {

    EditorPage editorPage=new EditorPage();
    @When("kullanici editor database adresine gider")
    public void kullaniciEditorDatabaseAdresineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("editorUrl"));
    }
    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        editorPage.newButton.click();
    }
    @Then("tum bilgileri girer")
    public void tum_bilgileri_girer() {
        editorPage.isimKutusu.sendKeys("Kamil");
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys("Bulut").
                sendKeys(Keys.TAB).sendKeys("Tester").
                sendKeys(Keys.TAB).sendKeys("Istanbul").
                sendKeys(Keys.TAB).sendKeys("General").
                sendKeys(Keys.TAB).sendKeys("2023-03-16").
               sendKeys(Keys.TAB).sendKeys("20000").perform();

    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        editorPage.createButton.click();
    }
    @When("kullanici ilk isim ile arama yapar")
    public void kullanici_ilk_isim_ile_arama_yapar() {
        editorPage.searchBox.sendKeys("Kamil");

    }
    @Then("isim bolumunde isminin oldugunu dogrular")
    public void isim_bolumunde_isminin_oldugunu_dogrular() {
        String actualSonuc= editorPage.sonucYazi.getText();
        String exp="Kamil";
        Assert.assertTrue(actualSonuc.contains(exp));
    }



}
