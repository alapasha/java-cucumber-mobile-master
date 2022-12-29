package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.Keyword;
import app.bersama.pages.LoginPage;
import app.bersama.pages.MyAccountPage;
import app.bersama.pages.NavigationSectionPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LogoutStep {

    @Then("user logout")
    public void user_logout() {
        MyAccountPage myAccountPage = new MyAccountPage(DriverManager.getInstance().getDriver());
        myAccountPage.tapButtonLogout();
    }

    @Then("user landed to main page")
    public void user_landed_to_main_page() {
        NavigationSectionPage navigationSectionPage = new NavigationSectionPage
                (DriverManager.getInstance().getDriver());

        navigationSectionPage.tapNotification();
    }

    @Then("user verify logout")
    public void user_verify_logout() {
        NavigationSectionPage navigationSectionPage = new NavigationSectionPage(DriverManager.getInstance().getDriver());
        Assert.assertTrue(navigationSectionPage.VerifyLogout());
    }
}
