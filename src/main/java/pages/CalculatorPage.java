package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CalculatorPage extends BasePage {

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_0")
    public WebElement buttonZero;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_1")
    public WebElement buttonOne;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_2")
    public WebElement buttonTwo;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_3")
    public WebElement buttonThree;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_4")
    public WebElement buttonFour;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_5")
    public WebElement buttonFive;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_6")
    public WebElement buttonSix;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_7")
    public WebElement buttonSeven;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_8")
    public WebElement buttonEight;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_9")
    public WebElement buttonNine;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_add")
    public WebElement buttonAddition;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_sub")
    public WebElement buttonSubtraction;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_mul")
    public WebElement buttonMultiplication;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_div")
    public WebElement buttonDivision;

    @AndroidFindBy(id = "com.google.android.calculator:id/eq")
    public WebElement buttonEqual;

    @AndroidFindBy(id = "com.google.android.calculator:id/result_final")
    public WebElement resultFinal;

    @AndroidFindBy(id = "com.google.android.calculator:id/result_preview")
    public WebElement resultPreview;

    public CalculatorPage(AndroidDriver<WebElement> driver) {
        super(driver);
    }
}
