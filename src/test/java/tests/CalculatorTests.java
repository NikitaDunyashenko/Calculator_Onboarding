package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.CalculatorPage;

public class CalculatorTests extends BaseTest {

    @Test
    public void additionOfNumbers() {
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.buttonFive.click();
        calculatorPage.buttonAddition.click();
        calculatorPage.buttonNine.click();
        calculatorPage.buttonEqual.click();
        Assertions.assertEquals("14", calculatorPage.resultFinal.getText(), "the result should be 14");
    }

    @Test
    public void subtractionOfNumbers() {
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.buttonSeven.click();
        calculatorPage.buttonSubtraction.click();
        calculatorPage.buttonThree.click();
        calculatorPage.buttonEqual.click();
        Assertions.assertEquals("4", calculatorPage.resultFinal.getText(), "the result should be 4");
    }

    @Test
    public void multiplicationOfNumbers() {
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.buttonEight.click();
        calculatorPage.buttonMultiplication.click();
        calculatorPage.buttonSix.click();
        calculatorPage.buttonEqual.click();
        Assertions.assertEquals("48", calculatorPage.resultFinal.getText(), "the result should be 48");
    }

    @Test
    public void divisionOfNumbers() {
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.buttonOne.click();
        calculatorPage.buttonZero.click();
        calculatorPage.buttonDivision.click();
        calculatorPage.buttonTwo.click();
        calculatorPage.buttonEqual.click();
        Assertions.assertEquals("5", calculatorPage.resultFinal.getText(), "the result should be 5");
    }

    @Test
    public void divisionByZero() {
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.buttonSeven.click();
        calculatorPage.buttonDivision.click();
        calculatorPage.buttonZero.click();
        calculatorPage.buttonEqual.click();
        Assertions.assertEquals("Can't divide by 0",calculatorPage.resultPreview.getText(), "Error message should appear");
    }
}
