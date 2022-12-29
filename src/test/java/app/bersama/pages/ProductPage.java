package app.bersama.pages;

import app.bersama.DriverManager;
import app.bersama.Keyword;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ProductPage {

    private AppiumDriver driver;

    public ProductPage(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    //Tombol Saya tertarik dan ingin nego
    @FindBy(id = "id.binar.fp.secondhand:id/btn_bid")
    private WebElement button_bid;

    //enter harga tawar
    @FindBy(id = "id.binar.fp.secondhand:id/et_product_bid_price")
    private WebElement enter_bid_price;

    //tombol kirim
    @FindBy(id = "id.binar.fp.secondhand:id/btn_bid")
    private WebElement button_kirim;

    //allert message "Harga tawarmu berhasil terkirim"
    @FindBy(id = "id.binar.fp.secondhand:id/tv_message")
    private WebElement allert_message;

    public void sendBidPrice(String price){
        button_bid.click();
        Keyword.enterText(enter_bid_price, price);
        button_kirim.click();
    }

    public boolean verifyAllertMessageSuccess(){
        WebDriverWait wait = new WebDriverWait(DriverManager.getInstance().getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(allert_message));
        return allert_message.isDisplayed();
    }
}
