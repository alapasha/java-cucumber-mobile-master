package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.pages.NotificationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class NotificationStep {
    @When("user check notification menu")
    public void userCheckNotificationMenu() {
        NotificationPage notificationPage = new NotificationPage(DriverManager.getInstance().getDriver());
        notificationPage.notificationMenu();
    }

    @Then("user should be able to see notification list")
    public void userShoulBeAbleToSeeNotificationList() {
        NotificationPage notificationPage = new NotificationPage(DriverManager.getInstance().getDriver());
        Assert.assertTrue(notificationPage.VerifyNotificationList());
    }
}
