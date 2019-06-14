package Andriod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Loading {

    private AndroidDriver driver;

    @AndroidFindBy(accessibility = "Loading")
    private WebElement loading;

    @AndroidFindBy(accessibility = "Run")
    private WebElement run;

   public Loading(AndroidDriver driver){
       this.driver=driver;
       PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    public void loadingPage(){

       loading.click();
       run.click();
        driver.navigate().back();

    }

}
