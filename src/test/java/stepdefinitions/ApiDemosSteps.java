package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ApiDemosPage;
import pages.SearchPage;
import utils.DriverManager;

public class ApiDemosSteps {
    ApiDemosPage apiDemosPage = new ApiDemosPage(DriverManager.getDriver());

    @Given("uygulamanin acildigi kontrol edilir")
    public void uygulamaninAcildigiKontrolEdilir() {
        apiDemosPage.checkApiDemosPageOpen();
    }

    @Given("Uygulamanin basliginin {string} oldugu kontrol edilir")
    public void uygulamaninBasligininOlduguKontrolEdilir(String baslik) {
        String title = apiDemosPage.getApiDemosTitle();
        System.out.println("title = " + title);
        Assert.assertEquals(title, baslik, "baslik ayni degil");

    }

    @When("Tablerden App tabine basilir")
    public void tablerdenAppTabineBasilir() {
        apiDemosPage.clickAppTab();
    }

    @When("Tablerden ActionBar tabine tiklanir")
    public void tablerdenActionBarTabineTiklanir() {
        apiDemosPage.clickActionBarTab();
    }

    @When("Tablerden ActionBarUsage tabine tiklanir")
    public void tablerdenActionBarUsageTabineTiklanir() {
        apiDemosPage.clickActionBarUsageTab();
    }


    @When("Tablerden {string} tabine tiklanir")
    public void tablerdenTabineTiklanir(String text) {
        apiDemosPage.clickTab(text);
    }

    @When("Tablerden Touch Paint tabine tiklanir")
    public void tablerdenTouchPaintTabineTiklanir() {
        apiDemosPage.clickTouchPaintTab();
    }

    @When("Tablerden Graphics tabine tiklanir")
    public void tablerdenGraphicsTabineTiklanir() {
        apiDemosPage.clickGraphicsTab();
    }


    @When("Tablerden ikinci.defa Touch Paint tabine tiklanir")
    public void tablerdenIkinciDefaTouchPaintTabineTiklanir() {
        apiDemosPage.clickTouchPaintTab2();
    }
}
