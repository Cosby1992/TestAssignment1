package dk.cosby.cph.test.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import dk.cosby.cph.test.TemperatureConverter;

import static org.junit.Assert.assertEquals;

/**
 * Step definitions for cucumber test cases.
 * Features are described in the file "FahrenheitToCelsius.feature" located in src/test/resources/features
 */
public class TemperatureConverterStepDefinitions {

    private double temp;
    private double actual;
    // Delta test precision
    // The precision in the test should be precise to two decimals and account for binary to decimal conversion
    // This allows for 0.99 to be accepted as 1.00 but not 1.01
    private double delta = 0.02;

    @Given("a {double}")
    public void aTemp(double temp) {
        this.temp = temp;
    }

    @When("Converting to Celsius")
    public void convertingToCelsius() {
        // Convert the temperature using the TemperatureConverter class
        actual = TemperatureConverter.fahrenheitToCelsius(temp);
    }

    @Then("the result should be {double}")
    public void theResultShouldBeTheConvertedTemp(double expected) {
        // Test the result
        assertEquals(expected, actual, delta);
    }

    @When("Converting to Fahrenheit")
    public void convertingToFahrenheit() {
        actual = TemperatureConverter.celsiusToFahrenheit(temp);
    }
}
