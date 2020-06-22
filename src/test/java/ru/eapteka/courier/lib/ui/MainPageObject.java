package ru.eapteka.courier.lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageObject {

    protected AppiumDriver driver;

    public MainPageObject(AppiumDriver driver){
        this.driver = driver;
    }

    public WebElement waitForElementPresentByXpath(String xpath, String error_message, long timeoutSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutSeconds);
        wait.withMessage(error_message + "\n");
        By by = By.xpath(xpath);
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement waitForElementPresentByXpath(String xpath, String error_message) {
        return waitForElementPresentByXpath(xpath, error_message, 10);
    }

    public WebElement waitForElementByXpathAndClick(String xpath, String error_message, long timeoutInSeconds) {
        WebElement element = waitForElementPresentByXpath(xpath, error_message, 10);
        element.click();
        return element;
    }

    public WebElement waitForElementByXpathAndSendKeys(String xpath, String value, String error_message, long timeoutInSeconds) {
        WebElement element = waitForElementPresentByXpath(xpath, error_message, 10);
        element.sendKeys(value);
        return element;
    }
}
