package app.bersama.pages;

import app.bersama.DriverManager;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class NotificationPage {

    private AppiumDriver driver;

    public NotificationPage(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "id.binar.fp.secondhand:id/tv_title_page")
    private WebElement notificationTitle;

    public void notificationMenu() {
        NavigationSectionPage navigationSectionPage = new NavigationSectionPage(DriverManager.getInstance().getDriver());
        navigationSectionPage.tapNotificationButton();
    }

    public boolean VerifyNotificationList() {
        WebDriverWait wait = new WebDriverWait(DriverManager.getInstance().getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(notificationTitle));
        return notificationTitle.isDisplayed();

    }
}
