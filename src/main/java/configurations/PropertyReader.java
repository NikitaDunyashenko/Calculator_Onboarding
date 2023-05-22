package configurations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertyReader {

    private static final Properties PROPERTIES = new Properties();
    private static PropertyReader instance;

    public static PropertyReader get() {
        if (instance == null) {
            instance = new PropertyReader();
            try {
                PROPERTIES.load(Files.newInputStream(Paths.get("src/main/resources/properties")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return instance;
    }

    public String appPackage() {
        return PROPERTIES.getProperty("app.package");
    }

    public String appActivity() {
        return PROPERTIES.getProperty("app.activity");
    }

    public String platformName() {
        return PROPERTIES.getProperty("platform.name");
    }

    public String platformVersion() {
        return PROPERTIES.getProperty("platform.version");
    }

    public String localDeviceName() {
        return PROPERTIES.getProperty("local.device.name");
    }

    public String udid() {
        return PROPERTIES.getProperty("udid");
    }

    public String appiumAddress() {
        return PROPERTIES.getProperty("appium.address");
    }

    public int appiumPort() {
        return Integer.parseInt(PROPERTIES.getProperty("appium.port"));
    }

    public String automationName() {
        return PROPERTIES.getProperty("automation.name");
    }

}
