package utils;

import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class ElementHelper {

    private WebDriver driver;
    private WebDriverWait wait;

    public ElementHelper(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement findElement(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public List<WebElement> findElements(By locator) {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

    public void checkElement(By locator) {
        findElement(locator);
    }

    public void click(By locator) {
        findElement(locator).click();
    }

    public String getText(By locator) {
        System.out.println("findElement(locator).getText() = " + findElement(locator).getText());
        return findElement(locator).getText();
    }

    public void sendKeys(By locator, String text) {
        findElement(locator).sendKeys(text);
    }

    public void clickElementWithText(By locator, String text) {
        boolean check = false;
        List<WebElement> elementList = findElements(locator);
        for (WebElement elem : elementList) {
            if (elem.getText().equals(text)) {
                check = true;
                elem.click();
                break;
            }
        }
        Assert.assertTrue(check, "listede istedigin texteki elemani bulamadim!!!");
    }

    public void scroll(By locator){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        RemoteWebElement element =(RemoteWebElement)driver.findElement(locator);
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", "down");
        scrollObject.put("element", element.getId());
        js.executeScript("mobile: scroll", scrollObject);
    }
}
