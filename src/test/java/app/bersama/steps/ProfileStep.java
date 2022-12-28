package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.TestDataProvider;
import app.bersama.pages.MyAccountPage;
import app.bersama.pages.ProfilePage;
import io.cucumber.java.en.Then;

public class ProfileStep {

    String userName = TestDataProvider.getRandomUserName();

    @Then("user navigate to profile page")
    public void user_navigate_to_profile_page() {
        MyAccountPage myaccountPage = new MyAccountPage(DriverManager.getInstance().getDriver());
        myaccountPage.tapButtonEditProfile();

    }
    @Then("user click username")
    public void user_click_username() {
        ProfilePage profilePage = new ProfilePage(DriverManager.getInstance().getDriver());
        profilePage.TapButtonName();
    }

    @Then("user edit username")
    public void user_edit_username() {
        ProfilePage profilePage = new ProfilePage(DriverManager.getInstance().getDriver());
        profilePage.EditName(userName);
        profilePage.TapButtonSave();
    }
    @Then("user get verify edit status")
    public void user_successfully_register_new_account() {
        ProfilePage profilePage = new ProfilePage(DriverManager.getInstance().getDriver());
        profilePage.assertEdit();
    }
}
