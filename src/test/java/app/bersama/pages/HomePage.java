package app.bersama.pages;

import app.bersama.Keyword;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage {

    private AppiumDriver driver;

    public HomePage(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "id.binar.fp.secondhand:id/et_search")
    private WebElement field_searching;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    private WebElement entryProductName;

    @FindBy(id = "id.binar.fp.secondhand:id/tv_product_price")
    private WebElement product;

    public void enterKeywordProduct(String productName){
        field_searching.click();
        entryProductName.sendKeys(productName);
        Keyword.waitUntilElementIsVisible(product);
        Keyword.waitUntilElementIsClickAble(product);
    }

    public void chooseProduct(){
        product.click();
    }
}
