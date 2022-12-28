package app.bersama.pages;

import app.bersama.Keyword;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ProfilePage {

    private AppiumDriver driver;

    public ProfilePage(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "id.binar.fp.secondhand:id/seller")
    private WebElement button_sellinglist;

    public void TapButtonSelling(){
        button_sellinglist.click(); }

//    public void assertLogin(){
//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        Keyword.waitUntilElementIsVisible(assertLogin);
//           assertLogin.isDisplayed();
    }



