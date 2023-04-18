package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ApiDemosPage {
ElementHelper elementHelper;
By actionBar =By.id("android:id/action_bar");
    By title =By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup");
By tab_App = By.xpath("//android.widget.TextView[@content-desc=\"App\"]");
public ApiDemosPage(WebDriver driver){
    this.elementHelper=new ElementHelper(driver);
}
public void checkApiDemosPageOpen(){
    elementHelper.checkElement(actionBar);
}

    public String getApiDemosTitle() {

    return elementHelper.getText(title);
    }

    public void clickAppTab() {
    elementHelper.click(tab_App);
    }
}
