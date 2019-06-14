package Andriod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Event {

    private AndroidDriver driver;

    @AndroidFindBy(accessibility = "Events")
    private WebElement event;

    @AndroidFindBy(accessibility = "Play")
    private WebElement play;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc=\"End Immediately\"]")
    private WebElement checkBox;

    public Event(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    public void eventPage(){
        event.click();

        play.click();

        if (!checkBox.isSelected()) {
            checkBox.click();
        }
        driver.navigate().back();
    }


}
