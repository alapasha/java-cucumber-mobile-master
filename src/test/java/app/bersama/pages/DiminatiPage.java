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

public class DiminatiPage {
    private AppiumDriver driver;

    public DiminatiPage(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "id.binar.fp.secondhand:id/seller")
    private WebElement button_mySellList;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Diminati\"]/android.widget.TextView")
    private WebElement navLinkDiminati;

    //choose product
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    private WebElement choose_product;

    @FindBy(id = "id.binar.fp.secondhand:id/btn_accept")
    private WebElement button_accept;

    @FindBy(id = "id.binar.fp.secondhand:id/btn_reject")
    private WebElement button_reject;

    //allert after accept bid price
    @FindBy(id = "id.binar.fp.secondhand:id/tv_bottom_sheet_title")
    private WebElement allert_success;

    //allert after decline bid price
    @FindBy(id = "id.binar.fp.secondhand:id/snackbar_text")
    private WebElement allert_decline;

    //swipe down popup after accept bid price
    //start element
    @FindBy(id = "id.binar.fp.secondhand:id/divider")
    private WebElement start_swipe;
    //end element
    @FindBy(id = "id.binar.fp.secondhand:id/btn_contact")
    private WebElement end_swipe;

    @FindBy(id = "id.binar.fp.secondhand:id/btn_status")
    private WebElement button_status;

    //radio button
    @FindBy(id = "id.binar.fp.secondhand:id/radio_success")
    private WebElement radioButtonSuccess;

    @FindBy(id = "id.binar.fp.secondhand:id/radio_cancel")
    private WebElement radioButtonCancel;

    //button simpan
    @FindBy(id = "id.binar.fp.secondhand:id/btn_set_status")
    private WebElement saveButton;

    //allert after update status
    @FindBy(id = "id.binar.fp.secondhand:id/cv_snackbar")
    private WebElement snackBarUpdatedStatus;

    public void acceptedBidPrice(){
        button_mySellList.click();
        navLinkDiminati.click();
        choose_product.click();
        button_accept.click();
    }

    public boolean verifyAllertSuccess(){
        WebDriverWait wait = new WebDriverWait(DriverManager.getInstance().getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(allert_success));
        return allert_success.isDisplayed();
    }

    public void declineBidPrice(){
        button_mySellList.click();
        navLinkDiminati.click();
        choose_product.click();
        button_reject.click();
    }

    public boolean verifyAllertSuccessDecline() {
        WebDriverWait wait = new WebDriverWait(DriverManager.getInstance().getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(allert_decline));
        return allert_decline.isDisplayed();
    }

    public void successUpdateStatus(){
        Keyword.swipeByElement(start_swipe,end_swipe);
        button_status.click();
        radioButtonSuccess.click();
        saveButton.click();
    }

    public void cancelUpdateStatus(){
        Keyword.swipeByElement(start_swipe,end_swipe);
        button_status.click();
        radioButtonCancel.click();
        saveButton.click();
    }

    public boolean verifySnackBarCancel() {
        WebDriverWait wait = new WebDriverWait(DriverManager.getInstance().getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(snackBarUpdatedStatus));
        return snackBarUpdatedStatus.isDisplayed();
    }
}
