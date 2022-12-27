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

/**
 * @author regiewby on 16/12/22
 * @project java-cucumber-mobile
 */
public class MyAccountPage {

    private AppiumDriver driver;

    public MyAccountPage(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "id.binar.fp.secondhand:id/btn_login")
    private WebElement button_login;

    @FindBy(id = "id.binar.fp.secondhand:id/tv_name")
    private WebElement label_name;

    @FindBy (id = "id.binar.fp.secondhand:id/tv_phone")
    private WebElement label_phoneNo;

    @FindBy (id="id.binar.fp.secondhand:id/tv_email")
    private WebElement label_email;

    @FindBy(id = "id.binar.fp.secondhand:id/iv_profile")
    private WebElement profilePicture;

    @FindBy(id = "id.binar.fp.secondhand:id/logout")
    private WebElement button_logout;

    @FindBy(id = "id.binar.fp.secondhand:id/tv_title_page")
    private WebElement label_myaccount;

    @FindBy (id = "id.binar.fp.secondhand:id/tv_category")
    private WebElement verifyLogout;

    public void tapButtonLogin() {
        WebDriverWait wait = new WebDriverWait(DriverManager.getInstance().getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(button_login));
        button_login.click();
    }

    public void tapButtonLogout() {button_logout.click();
        WebDriverWait wait = new WebDriverWait(DriverManager.getInstance().getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(button_logout));
        button_logout.click();
    }
    public void assert_logout() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        Keyword.waitUntilElementIsVisible(verifyLogout);
        verifyLogout.isDisplayed(); }

}
