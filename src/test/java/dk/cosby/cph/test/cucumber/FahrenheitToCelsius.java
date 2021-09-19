package dk.cosby.cph.test.cucumber;

import dk.cosby.cph.test.TemperatureConverter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

/**
 * Step definitions for cucumber test cases.
 * Features are described in the file "FahrenheitToCelsius.feature" located in src/test/resources/features
 */
public class FahrenheitToCelsius {

    private double fahrenheit;
    private double actual;
    private double delta = 0.001; // The precision in the test should be precise to two decimals

    @Given("a {double}")
    public void aFahrenheitTemp(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    @When("Converting to celsius")
    public void convertingToCelsius() {
        // Convert the temperature using the TemperatureConverter class
        actual = TemperatureConverter.fahrenheitToCelsius(fahrenheit);
    }

    @Then("the result should be {double}")
    public void theResultShouldBeCelsiusTemp(double expected) {
        // Test the result
        assertEquals(expected, actual, delta);
    }
}
