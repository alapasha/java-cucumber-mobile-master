package app.bersama.pages;

import app.bersama.DriverManager;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MyProductPage {

    private AppiumDriver driver;

    public MyProductPage(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "id.binar.fp.secondhand:id/seller")
    private WebElement buttonDaftarJual;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup[2]/android.widget.TextView")
    private WebElement textDaftarJualSaya;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.view.ViewGroup/android.widget.ImageView[2]")
    private WebElement deleteItem1;

    @FindBy(id = "id.binar.fp.secondhand:id/delete")
    private WebElement deleteButton;

    @FindBy(id = "id.binar.fp.secondhand:id/snackbar_text")
    private WebElement deleteSnackBar;

    public boolean redirectedToSellListPage() {
        WebDriverWait wait = new WebDriverWait(DriverManager.getInstance().getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(textDaftarJualSaya));
        return textDaftarJualSaya.isDisplayed();
    }

    public void deleteProduct() {
        buttonDaftarJual.click();
        deleteItem1.isDisplayed();
        deleteItem1.click();
        deleteButton.click();
    }

    public boolean deletePopUpMessage(){
        WebDriverWait wait = new WebDriverWait(DriverManager.getInstance().getDriver(),5);
        wait.until(ExpectedConditions.visibilityOf(deleteSnackBar));
        return deleteSnackBar.isDisplayed();
    }

    public void showProductList() {
        buttonDaftarJual.click();
    }

}
