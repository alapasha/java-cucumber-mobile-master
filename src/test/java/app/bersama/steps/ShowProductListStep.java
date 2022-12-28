package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.pages.MyProductPage;
import io.cucumber.java.en.When;

public class ShowProductListStep {
    @When("user click my sell list")
    public void userClickMySellList() {
        MyProductPage myProductPage = new MyProductPage(DriverManager.getInstance().getDriver());
        myProductPage.showProductList();
    }
}
