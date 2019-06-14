package Andriod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Hideshowanimation {
    private AndroidDriver driver;

    @AndroidFindBy(accessibility = "Hide-Show Animations")
    private WebElement hideShow;

    @AndroidFindBy(accessibility = "Show Buttons")
    private WebElement showButton;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc=\"Custom Animations\"]")
    private WebElement customAnimation;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc=\"Hide (GONE)\"]")
    private WebElement hideCheckBox;

    public Hideshowanimation(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void hideShowAnimationPage() {
        hideShow.click();

        showButton.click();

         String checked = customAnimation.getAttribute("checked");
         System.out.println("value cheked:"+checked);

        if ("false".equals(checked)) {
            customAnimation.click();
        }
         String hide = hideCheckBox.getAttribute("checked");

        if ("false".equals(hide)) {
            hideCheckBox.click();
        }

        driver.navigate().back();
    }



}


