package Andriod;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Seeking {
    private AndroidDriver driver;

    @AndroidFindBy(accessibility = "Seeking")
    private WebElement seeking;

    @AndroidFindBy(accessibility ="Run")
    private WebElement run;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.SeekBar")
    private  WebElement seek_bar;

    public Seeking(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    public void seekingPage(){
        seeking.click();
        run.click();
        // get start co-ordinate of seekbar
        int start = seek_bar.getLocation().getX();
        //Get width of seekbar
        int end = seek_bar.getSize().getWidth();
        //get location of seekbar vertically
        int y = seek_bar.getLocation().getY();

        // Select till which position you want to move the seekbar
        TouchAction action = new TouchAction(driver);

        //Move it will the end
        action.press(start, y).moveTo(end, y).release().perform();

        //Move it 40%
        int moveTo = (int) (end * 0.4);
        action.press(start, y).moveTo(moveTo, y).release().perform();

        driver.navigate().back();

    }
}
