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
      Assert.assertEquals(title,baslik,"baslik ayni degil");

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


}
