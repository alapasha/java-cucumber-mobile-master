package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.pages.DiminatiPage;
import app.bersama.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AcceptBidPriceStep {
    @When("user accept bid price")
    public void user_accept_bid_price() {
        DiminatiPage diminatiPage = new DiminatiPage(DriverManager.getInstance().getDriver());
        diminatiPage.acceptedBidPrice();
    }

    @Then("user get allert message")
    public void user_get_allert_message() {
        DiminatiPage diminatiPage = new DiminatiPage(DriverManager.getInstance().getDriver());
        diminatiPage.verifyAllertSuccess();
    }
}
