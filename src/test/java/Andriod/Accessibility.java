package Andriod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.XMLFormatter;

public class Accessibility {
    private AndroidDriver driver;

    @AndroidFindBy(accessibility = "Accessibility")
    private WebElement accessibility;

    @AndroidFindBy(accessibility = "Accessibility Node Provider")
    private WebElement accessibilityNode;

    @AndroidFindBy(accessibility = "Accessibility Node Querying")
    private WebElement accessibilityNodeQuerying;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.CheckBox")
    private WebElement checkBox1;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.CheckBox")
    private WebElement checkBox2;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[3]/android.widget.CheckBox")
    private WebElement checkBox3;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[4]/android.widget.CheckBox")
    private WebElement checkBox4;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[5]/android.widget.CheckBox")
    private WebElement checkBox5;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[6]/android.widget.CheckBox")
    private WebElement checkBox6;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[7]/android.widget.CheckBox")
    private WebElement checkBox7;

    @AndroidFindBy(accessibility = "Accessibility Service")
    private WebElement accessibilityService;

    public Accessibility(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickOnAccessibility() {
        //driver.findElementByAccessibilityId("Accessibility").click();
        accessibility.click();
        // driver.findElementByAccessibilityId("Accessibility Node Provider").click();
    }

    public void clickOnNodeQuerying() {
        accessibilityNodeQuerying.click();



        selectIfNotSelected(checkBox1);
        selectIfNotSelected(checkBox2);
        selectIfNotSelected(checkBox3);
        selectIfNotSelected(checkBox4);
        selectIfNotSelected(checkBox5);
        selectIfNotSelected(checkBox6);
        selectIfNotSelected(checkBox7);

        back();
    }

    private void selectIfNotSelected(WebElement checkBox) {
        String checkBoxSelected = checkBox.getAttribute("checked");
        if (!"true".equals(checkBoxSelected)) {
            checkBox.click();
        }
    }

    public void clickOnNodeProvider() {
        accessibilityNode.click();
        back();
    }

    public void back() {
        driver.navigate().back();
    }

    public void accessibilityService() {
        accessibilityService.click();
        back();
    }

    public void customView() {
        driver.findElementByAccessibilityId("Custom View").click();
        back();
    }

}
