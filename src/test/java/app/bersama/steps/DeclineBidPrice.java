package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.pages.DiminatiPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeclineBidPrice {
    @When("user decline bid price")
    public void userDeclineBidPrice() {
        DiminatiPage diminatiPage = new DiminatiPage(DriverManager.getInstance().getDriver());
        diminatiPage.declineBidPrice();
    }


    @Then("user get allert")
    public void userGetAllert() {
        DiminatiPage diminatiPage = new DiminatiPage(DriverManager.getInstance().getDriver());
        diminatiPage.verifyAllertSuccessDecline();
    }
}
