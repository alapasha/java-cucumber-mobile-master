package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.pages.MyProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DeleteProductStep {
    @When("user delete product")
    public void userDeleteProduct() {
        MyProductPage myProductPage = new MyProductPage(DriverManager.getInstance().getDriver());
        myProductPage.deleteProduct();
    }

    @Then("user is able to see delete pop up message")
    public void userIsAbleToSeeDeletePopUpMessage() {
        MyProductPage myProductPage = new MyProductPage(DriverManager.getInstance().getDriver());
        Assert.assertTrue(myProductPage.deletePopUpMessage());
    }
}
