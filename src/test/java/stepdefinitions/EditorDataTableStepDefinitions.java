package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EditorDataBasePage;
import utilities.Driver;

public class EditorDataTableStepDefinitions {

    EditorDataBasePage editorDataBasePage = new EditorDataBasePage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {

       editorDataBasePage.newButonu.click();
    }

    @Then("tum bilgileri girer")
    public void tum_bilgileri_girer() {

        Actions actions = new Actions(Driver.getDriver());
        actions.click(editorDataBasePage.firstName)
                .sendKeys("Emre")
                .sendKeys(Keys.TAB)
                .sendKeys("Guduk")
                .sendKeys(Keys.TAB)
                .sendKeys("Tester")
                .sendKeys(Keys.TAB)
                .sendKeys("NY")
                .sendKeys(Keys.TAB)
                .sendKeys("Extension").perform();



    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {

    }

    @When("kullanici ilk isim ile arama yapar")
    public void kullanici_ilk_isim_ile_arama_yapar() {

    }

    @Then("isim bolumunde isminin oldugunu dogrular")
    public void isim_bolumunde_isminin_oldugunu_dogrular() {

    }
}
