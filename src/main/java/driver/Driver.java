package driver;

import configurations.StartAppiumSession;
import configurations.CapabilitiesConfig;
import configurations.PropertyReader;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import static java.lang.String.format;


public class Driver {
    private static AndroidDriver<WebElement> driver;

    private Driver() {
    }
    public static AndroidDriver<WebElement> createDriver() {
        return new AndroidDriver<WebElement>(StartAppiumSession.getAppiumDriverLocalService(PropertyReader.get().appiumPort()),
                CapabilitiesConfig.getLocalCapabilities());
    }

    public static synchronized AndroidDriver<WebElement> getDriver() {
        if (driver == null) {
            driver = createDriver();
        }
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
    }

    public static void resetApp() {
        driver.resetApp();
    }

    public static void closeApp() {
        driver.closeApp();
    }

    public static void closeAppium() {
        StartAppiumSession.stopService();
    }

    public static void closeEmulator() {
        try {
            Runtime.getRuntime().exec(format("adb -s %s emu kill", PropertyReader.get().udid()));
        } catch (IOException e) {
            e.getMessage();
        }
    }
}

