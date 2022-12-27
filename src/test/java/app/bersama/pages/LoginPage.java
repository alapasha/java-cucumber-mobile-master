package app.bersama.pages;

import app.bersama.DriverManager;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * @author regiewby on 16/12/22
 * @project java-cucumber-mobile
 */
public class LoginPage {

    private AppiumDriver driver;

    public LoginPage(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "id.binar.fp.secondhand:id/et_email")
    private WebElement entry_email;

    @FindBy(id = "id.binar.fp.secondhand:id/et_password")
    private WebElement entry_password;

    @FindBy(id = "id.binar.fp.secondhand:id/btn_login")
    private WebElement button_login;

    @FindBy(id = "id.binar.fp.secondhand:id/tv_register")
    private WebElement button_register;

    public void enterCredential(String Email, String Password){
        entry_email.sendKeys(Email);
        entry_password.sendKeys(Password);
    }
    public void tapButtonLogin(){
        button_login.click();
    }

    public void tapButtonRegister() {
        button_register.click();
    }
}
