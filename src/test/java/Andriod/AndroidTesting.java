package Andriod;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.lift.TestContext;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;


public class AndroidTesting {

    @Test

    public void capabilities() throws MalformedURLException {

        AndroidDriver driver;
        DesiredCapabilities capabilities = new DesiredCapabilities();


        capabilities.setCapability("platformVersion", "7.1.1");
        capabilities.setCapability("deviceName", "Nexus_6_API_25");
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("app", "/Users/ssatyam/downloads/ApiDemos-debug.apk");
        //capabilities.setCapability("automationName", "UiAutomator2");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //Accessibility
        Accessibility ac = new Accessibility(driver);
        ac.clickOnAccessibility();
        ac.clickOnNodeProvider();
        ac.clickOnNodeQuerying();
        ac.accessibilityService();
        ac.customView();
        driver.navigate().back();

        //Animation
        Animation ani = new Animation(driver);
        ani.animationpage();
























        /*Point p=element.getLocation();
        System.out.println(p);
        driver.tap(1, p.getX()+10, p.getY()+10, 1);*/


    }

}

