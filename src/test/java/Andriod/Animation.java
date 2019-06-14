package Andriod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Animation {
    private AndroidDriver driver;

    @AndroidFindBy(accessibility = "Animation")
    private WebElement animation;

    @AndroidFindBy(accessibility = "Bouncing Balls")
    private WebElement bouncingBalls;

    @AndroidFindBy(accessibility = "Cloning")
    private WebElement cloning;

    @AndroidFindBy(accessibility = "Run")
    private WebElement run;

    @AndroidFindBy(accessibility = "Custom Evaluator")
    private WebElement customEvaluator;

    @AndroidFindBy(accessibility = "Play")
    private WebElement play;

    @AndroidFindBy(accessibility = "Default Layout Animations")
    private WebElement defaultLayoutAnimations;

    @AndroidFindBy(accessibility = "Add Button")
    private WebElement addButton;


    public Animation(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void animationpage() {
        animation.click();
        bouncingBalls.click();
        back();
        cloning.click();
        run.click();
        back();
        customEvaluator.click();
        play.click();
        back();
        clickOnDefaultLayout();
        back();
        clickOnEvents();
        clickOnHideShowAnimation();
        clickOnLayoutAnimation();
        clickOnLoading();
        clickOnProperties();
        clickOnReversing();
        clickOnSeeking();
        clickOnViewFlip();
    }

    private void clickOnViewFlip() {
        ViewFlip vf = new ViewFlip(driver);
        vf.viewFlipPage();
    }

    private void clickOnSeeking() {

        Seeking sc = new Seeking(driver);
        sc.seekingPage();

    }

    private void clickOnReversing() {
        Reversing ra = new Reversing(driver);
        ra.reversingPage();
    }

    private void clickOnProperties() {
        MultipleProperties mp = new MultipleProperties(driver);
        mp.multipleProperties();
    }

    private void clickOnLoading() {
        Loading la = new Loading(driver);
        la.loadingPage();
    }

    private void clickOnLayoutAnimation() {
        LayoutAnimations lay = new LayoutAnimations(driver);
        lay.layoutAnimationPage();
    }

    private void clickOnHideShowAnimation() {
        Hideshowanimation hide = new Hideshowanimation(driver);
        hide.hideShowAnimationPage();
    }

    private void clickOnEvents() {
        Event e = new Event(driver);
        e.eventPage();
    }

    private void clickOnDefaultLayout() {
        defaultLayoutAnimations.click();

        for (int i = 1; i <= 5; i++) {
            addButton.click();
        }
    }

    private void back() {
        driver.navigate().back();
    }


}
