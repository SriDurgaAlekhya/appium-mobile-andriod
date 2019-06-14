package Andriod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MultipleProperties {

    private AndroidDriver driver;

    @AndroidFindBy(accessibility = "Multiple Properties")
    private WebElement multipleProperties;

    @AndroidFindBy(accessibility = "Run")
    private WebElement run;

    public MultipleProperties(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }
    public void multipleProperties(){
        multipleProperties.click();
        run.click();
        driver.navigate().back();
    }

}
