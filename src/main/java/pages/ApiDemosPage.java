package pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ElementHelper;

public class ApiDemosPage {
    ElementHelper elementHelper;
    By actionBar = By.id("android:id/action_bar");
    By title = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup");
    By tab_App = By.xpath("//android.widget.TextView[@content-desc=\"App\"]");
    By tab_ActionBar = By.xpath("//android.widget.TextView[@content-desc=\"Action Bar\"]");
    By tab_ActionBarUsage = By.xpath("//android.widget.TextView[@content-desc=\"Action Bar Usage\"]");
    By tabsList = By.id("android:id/text1");
    By tab_touch_Paint = MobileBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"Touch Paint\"))");
    By tab_Graphics = By.xpath("//android.widget.TextView[@content-desc=\"Graphics\"]");
    By tab_touch_paint;


    public ApiDemosPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkApiDemosPageOpen() {
        elementHelper.checkElement(actionBar);
    }

    public String getApiDemosTitle() {

        return elementHelper.getText(title);
    }

    public void clickAppTab() {
        elementHelper.click(tab_App);
    }

    public void clickActionBarTab() {
        elementHelper.click(tab_ActionBar);
    }

    public void clickActionBarUsageTab() {
        elementHelper.click(tab_ActionBarUsage);
    }

    public void clickTab(String text) {
        elementHelper.clickElementWithText(tabsList, text);
    }

    public void clickTouchPaintTab() {elementHelper.click(tab_touch_Paint);
    }
    public void clickGraphicsTab() {elementHelper.click(tab_Graphics);
    }

    public void clickTouchPaintTab2() {

        elementHelper.scroll(tab_touch_paint);

    }
}

