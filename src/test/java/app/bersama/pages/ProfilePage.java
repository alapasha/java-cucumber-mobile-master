package app.bersama.pages;

import app.bersama.Keyword;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ProfilePage {

    private AppiumDriver driver;

    public ProfilePage(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id= "id.binar.fp.secondhand:id/tv_profile_name")
    private WebElement btn_name;

    @FindBy(id= "id.binar.fp.secondhand:id/tv_profile_phone")
    private WebElement btn_phonenumber;

    @FindBy(id= "id.binar.fp.secondhand:id/tv_profile_city")
    private WebElement btn_city;

    @FindBy(id= "id.binar.fp.secondhand:id/tv_profile_address")
    private WebElement btn_address;

    @FindBy(id= "id.binar.fp.secondhand:id/tv_profile_email")
    private WebElement btn_profileEmail;

    @FindBy(id= "id.binar.fp.secondhand:id/tv_profile_password")
    private WebElement btn_profilePassword;

    @FindBy(id= "id.binar.fp.secondhand:id/edit_text")
    private WebElement entry_name;

    @FindBy(id="id.binar.fp.secondhand:id/btn_save")
    private WebElement btn_save;

    @FindBy(id="id.binar.fp.secondhand:id/snackbar_text")
    private WebElement snackbar_text;

    public void TapButtonName() {btn_name.click();
    }
    public void TapPhoneNumber() {btn_phonenumber.click();
    }
    public void TapButtonCity() {btn_city.click();
    }
    public void TapButtonAddress() {btn_address.click();
    }
    public void TapButtonEmail() {btn_profileEmail.click();
    }
    public void TapButtonPassword() {btn_profilePassword.click();
    }
    public void EditName(String UserName) {
        entry_name.sendKeys(UserName);
    }
    public void TapButtonSave() {
        btn_save.click();
    }
    public void SnackBarText() {
        snackbar_text.getText();
    }
    public void assertEdit(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        Keyword.waitUntilElementIsVisible(snackbar_text);
        snackbar_text.isDisplayed(); }
    }







