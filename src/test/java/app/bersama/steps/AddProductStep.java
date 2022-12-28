package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.TestDataProvider;
import app.bersama.pages.AddProductPage;
import app.bersama.pages.MyProductPage;
import com.beust.ah.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddProductStep {
    @When("user add new product")
    public void userAddNewProduct() {

        String productName = TestDataProvider.getRandomProductName();
        String productPrice = TestDataProvider.getRandomNumber(7);
        String productLocation = TestDataProvider.getRandomCity();
        String productDescription = TestDataProvider.getRandomDescription();

        AddProductPage addProductPage = new AddProductPage(DriverManager.getInstance().getDriver());
        addProductPage.addNewProduct(productName, productPrice, productLocation, productDescription);
    }

    @Then("user publish new product")
    public void userPublishNewProduct() {
        AddProductPage addProductPage = new AddProductPage(DriverManager.getInstance().getDriver());
        addProductPage.publishProduct();
    }

    @Then("user redirected to my sell list page")
    public void userRedirectedToSellListPage(){
       MyProductPage myProductPage = new MyProductPage(DriverManager.getInstance().getDriver());
        Assert.assertTrue(myProductPage.redirectedToSellListPage());
    }

    @Then("add product success")
    public void addProductSuccess(){
        AddProductPage addProductPage = new AddProductPage(DriverManager.getInstance().getDriver());
        Assert.assertTrue(addProductPage.successMessage());
    }

}
