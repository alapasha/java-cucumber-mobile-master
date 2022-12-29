package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.pages.HomePage;
import app.bersama.pages.MyAccountPage;
import app.bersama.pages.NavigationSectionPage;
import app.bersama.pages.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyProductStep {
    @When("user choose product {string}")
    public void user_choose_product(String productName){
        HomePage homePage = new HomePage(DriverManager.getInstance().getDriver());
        NavigationSectionPage navigationSectionPage = new NavigationSectionPage(DriverManager.getInstance().getDriver());
        ProductPage productPage = new ProductPage(DriverManager.getInstance().getDriver());
        navigationSectionPage.tapButtonHome();
        homePage.enterKeywordProduct(productName);
        homePage.chooseProduct();
        productPage.sendBidPrice("100000");
    }

    @Then("user get alert snack bar success to buy product")
    public void user_get_allert_snack_bar_success_to_buy_product() {
        ProductPage productPage = new ProductPage(DriverManager.getInstance().getDriver());
        productPage.verifyAllertMessageSuccess();
    }
}
