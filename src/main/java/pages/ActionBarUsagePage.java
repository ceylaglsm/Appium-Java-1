package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ElementHelper;

public class ActionBarUsagePage {
ElementHelper elementHelper;

    By searchButton = By.id("android:id/search_button");
    By text = By.id("android:id/search_src_text");
    By gulsumText= By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.TextView");
    public ActionBarUsagePage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }



    public void clickSearchButton() {
        elementHelper.click(searchButton);
        elementHelper.click(text);
    }

    public void sendkeysName(String isim) {
        elementHelper.sendKeys(text, "gulsum");
    }

    public void checkTextAreaContainsName(String isim) {

        Assert.assertTrue(elementHelper.getText(gulsumText).contains("gulsum"));
    }

    public void scroll(){

    }
}

