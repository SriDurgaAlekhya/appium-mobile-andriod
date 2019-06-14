package Andriod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Reversing {

    private AndroidDriver driver;

    @AndroidFindBy(accessibility = "Reversing")
    private WebElement reversing;

    @AndroidFindBy(accessibility = "Play")
    private WebElement play;

    @AndroidFindBy(accessibility = "Reverse")
    private WebElement reverse;

    public Reversing(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    public void reversingPage(){

        reversing.click();
        play.click();
        reverse.click();
        driver.navigate().back();

    }
}
