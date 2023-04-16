package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ResultPage;
import utils.DriverManager;
import utils.ElementHelper;

public class ResultSteps {
    ResultPage resultPage = new ResultPage(DriverManager.getDriver());

    @Then("I should see the Result Page")
    public void ıShouldSeeTheResultPage() {
        resultPage.checkResults();
    }

    @Given("butun tablerin ismini yazdir")
    public void butunTablerinIsminiYazdir() {
        resultPage.tumTableriYazdir();
    }
}
