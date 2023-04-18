package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ApiDemosPage {
ElementHelper elementHelper;
By actionBar =By.id("android:id/action_bar");
    By title =By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup");

public ApiDemosPage(WebDriver driver){
    this.elementHelper=new ElementHelper(driver);
}
public void checkApiDemosPageOpen(){
    elementHelper.checkElement(actionBar);
}

    public String getApiDemosTitle() {

    return elementHelper.getText(title);
    }
}
