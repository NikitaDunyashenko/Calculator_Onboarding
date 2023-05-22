package tests;

import driver.Driver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebElement;

public abstract class BaseTest {

    public static AndroidDriver<WebElement> driver;

    @BeforeAll
    public static void startSession() {
        driver = Driver.getDriver();
    }

    @AfterEach
    public void resetApp() {
        Driver.getDriver().resetApp();
    }

    @AfterAll
    public static void closeSession() {
        Driver.closeDriver();
        Driver.closeAppium();
        Driver.closeEmulator();
    }

}
