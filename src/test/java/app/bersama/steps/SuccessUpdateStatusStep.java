package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.pages.DiminatiPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SuccessUpdateStatusStep {
    @When("user tap success radio button")
    public void user_tap_success_radio_button() {
        DiminatiPage diminatiPage = new DiminatiPage(DriverManager.getInstance().getDriver());
        diminatiPage.successUpdateStatus();
    }
}
