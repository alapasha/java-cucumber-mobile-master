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

import java.security.Key;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * @author regiewby on 16/12/22
 * @project java-cucumber-mobile
 */
public class NavigationSectionPage {

    private AppiumDriver driver;

    public NavigationSectionPage(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "id.binar.fp.secondhand:id/navigation_profile")
    private WebElement button_account;

    @FindBy(id = "id.binar.fp.secondhand:id/navigation_history")
    private WebElement button_transaction;

    @FindBy(id = "id.binar.fp.secondhand:id/navigation_notification")
    private WebElement button_notification;

    @FindBy(id = "id.binar.fp.secondhand:id/navigation_home")
    private WebElement button_home;

    public void tapNavigationAccount() {
        WebDriverWait wait = new WebDriverWait(DriverManager.getInstance().getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(button_account));
        button_account.click();
    }

    public void tapNotification() {
        WebDriverWait wait = new WebDriverWait(DriverManager.getInstance().getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(button_notification));
        button_notification.click();
    }

    public void tapButtonHome() {
        button_home.click();
    }

}
