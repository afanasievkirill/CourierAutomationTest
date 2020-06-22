package ru.eapteka.courier.lib;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class CoreTestCase extends TestCase {

    protected AppiumDriver driver;
    private static String AppiumURL = "http://127.0.0.1:4723/wd/hub";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Nexus 6 API 29 ANDROID 10.0");
        capabilities.setCapability("platformVersion", "10.0");
        capabilities.setCapability("autoGrantPermissions", "true");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("appPackage", "ru.eapteka.courier");
        capabilities.setCapability("appActivity", ".MainActivity");
        capabilities.setCapability("app", "C:/aphk/java/CourierAutomationTest/apks/courier_1.2.9(22).apk");

        driver = new AndroidDriver(new URL(AppiumURL), capabilities);
    }

    @Override
    protected void tearDown() throws Exception {
        driver.quit();
        super.tearDown();
    }
}
