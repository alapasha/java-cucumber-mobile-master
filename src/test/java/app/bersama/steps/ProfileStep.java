package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.pages.MyAccountPage;
import app.bersama.pages.ProfilePage;
import io.cucumber.java.en.Then;

public class ProfileStep {
    @Then("user navigate to my selling list")
    public void user_navigate_to_my_selling_list() {
        ProfilePage profilePage = new ProfilePage(DriverManager.getInstance().getDriver());
        profilePage.TapButtonSelling();

    }

    @Then("user able to check the list")
    public void user_able_to_check_the_list() {
        ProfilePage profilePage = new ProfilePage(DriverManager.getInstance().getDriver());
        profilePage.TapButtonSelling();
    }
}
