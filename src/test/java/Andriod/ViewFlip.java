package Andriod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ViewFlip {

    private AndroidDriver driver;

    @AndroidFindBy(accessibility = "View Flip")
    private WebElement viewFlip;

    @AndroidFindBy(accessibility = "Flip")
    private WebElement flip;

    public ViewFlip(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);


    }

    public void viewFlipPage(){

        viewFlip.click();

        flip.click();

        driver.navigate().back();

    }
}
