package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.pages.DiminatiPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CancelUpdateStatusStep {
    @When("user tap cancel radio button")
    public void user_tap_cancel_radio_button() {
        DiminatiPage diminatiPage = new DiminatiPage(DriverManager.getInstance().getDriver());
        diminatiPage.cancelUpdateStatus();
    }

    @Then("user get snack bar notification")
    public void user_get_snack_bar_notification() {
        DiminatiPage diminatiPage = new DiminatiPage(DriverManager.getInstance().getDriver());
        diminatiPage.verifySnackBarCancel();
    }
}
