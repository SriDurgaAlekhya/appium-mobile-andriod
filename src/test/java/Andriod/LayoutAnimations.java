package Andriod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LayoutAnimations {

    private AndroidDriver driver;

    @AndroidFindBy(accessibility = "Layout Animations")
    private WebElement layoutAnimations;

    @AndroidFindBy(accessibility = "Add Button")
    private WebElement layoutAddButton;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc=\"Custom Animations\"]")
    private WebElement customCheckBox;

    public LayoutAnimations(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }
    public void layoutAnimationPage(){
        layoutAnimations.click();

        for (int i = 0; i <= 10; i++) {
            layoutAddButton.click();
        }
        if (customCheckBox.isSelected()) {
            System.out.println("selected");
        } else {
            customCheckBox.click();
        }
        driver.navigate().back();



    }

}
