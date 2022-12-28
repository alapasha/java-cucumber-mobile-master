package app.bersama.pages;

import app.bersama.DriverManager;
import app.bersama.Keyword;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AddProductPage {

    private AppiumDriver driver;

    public AddProductPage(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "id.binar.fp.secondhand:id/fab")
    private WebElement sellButton;

    @FindBy(id = "id.binar.fp.secondhand:id/et_product_name")
    private WebElement productName;

    @FindBy(id = "id.binar.fp.secondhand:id/et_product_price")
    private WebElement productPrice;

    @FindBy(id = "id.binar.fp.secondhand:id/et_product_category")
    private WebElement productCategory;

    @FindBy(id = "id.binar.fp.secondhand:id/tv_product_location")
    private  WebElement pickCategory;

    @FindBy(id = "id.binar.fp.secondhand:id/et_product_location")
    private WebElement productLocation;

    @FindBy(id = "id.binar.fp.secondhand:id/et_product_description")
    private WebElement productDescription;

    @FindBy(id = "id.binar.fp.secondhand:id/iv_product_image")
    private WebElement choosePict;

    @FindBy(id = "id.binar.fp.secondhand:id/btn_camera")
    private  WebElement cameraButton;

    @FindBy(id = "com.android.camera2:id/shutter_button")
    private WebElement shutterButton;

    @FindBy(id = "com.android.camera2:id/done_button")
    private WebElement doneButton;

    @FindBy(id = "id.binar.fp.secondhand:id/btn_publish")
    private WebElement buttonPublish;



    public void addNewProduct(
        String Name,
        String Price,
        String Location,
        String Description
    ) {
        sellButton.click();
        productName.sendKeys(Name);
        productPrice.sendKeys(Price);
        productCategory.click();
        pickCategory.click();
        productLocation.sendKeys(Location);
        productDescription.sendKeys(Description);
        choosePict.click();
        driver.findElement(By.xpath(".//android.widget.Button[@text='While using the app']")).click();
        driver.findElement(By.xpath(".//android.widget.Button[@text='Allow']")).click();
        choosePict.click();
        cameraButton.click();
        shutterButton.click();
        doneButton.click();
    }

    public void publishProduct() {
        buttonPublish.click();
    }

}
