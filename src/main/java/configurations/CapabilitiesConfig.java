package configurations;

import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilitiesConfig {

    public static DesiredCapabilities getLocalCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", PropertyReader.get().platformName());
        capabilities.setCapability("platformVersion", PropertyReader.get().platformVersion());
        capabilities.setCapability("deviceName", PropertyReader.get().localDeviceName());
        capabilities.setCapability("udid", PropertyReader.get().udid());
        capabilities.setCapability("appPackage", PropertyReader.get().appPackage());
        capabilities.setCapability("appActivity", PropertyReader.get().appActivity());
        capabilities.setCapability("automationName", PropertyReader.get().automationName());
        return capabilities;
    }
}
