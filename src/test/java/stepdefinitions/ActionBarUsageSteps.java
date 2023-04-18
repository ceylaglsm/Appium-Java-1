package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ActionBarUsagePage;
import utils.DriverManager;

public class ActionBarUsageSteps {
    ActionBarUsagePage actionBarUsagePage = new ActionBarUsagePage(DriverManager.getDriver());



    @When("Search butonuna tiklanir")
    public void searchButonunaTiklanir() {
        actionBarUsagePage.clickSearchButton();

    }

    @When("Search alanina {string} yazilir")
    public void searchAlaninaYazilir(String isim) {
        actionBarUsagePage.sendkeysName(isim);
    }

    @Then("Text Area {string} iceriyor mu kontrol edilir")
    public void textAreaIceriyorMuKontrolEdilir(String isim) {
        actionBarUsagePage.checkTextAreaContainsName(isim);
    }
}
