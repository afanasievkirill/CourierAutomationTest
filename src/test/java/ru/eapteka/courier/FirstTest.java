package ru.eapteka.courier;

import org.junit.Test;
import ru.eapteka.courier.lib.CoreTestCase;
import ru.eapteka.courier.lib.ui.MainPageObject;

public class FirstTest extends CoreTestCase {

    private MainPageObject main;

    protected void setUp() throws Exception {
        super.setUp();
        main = new MainPageObject(driver);
    }

    @Test
    public void testValidLogin() {
        main.waitForElementByXpathAndClick(
                "//*[contains(@text, 'api url')]",
                "Cannot find element_api_url",
                10
        );
        main.waitForElementByXpathAndSendKeys("//*[contains(@class, 'android.widget.EditText')]",
                "http://test.com/",
                "Cannot find element_insert_api_url",
                10);
        System.out.println("First test run"); //*[contains(@class, 'android.widget.EditText')]
    }


}
