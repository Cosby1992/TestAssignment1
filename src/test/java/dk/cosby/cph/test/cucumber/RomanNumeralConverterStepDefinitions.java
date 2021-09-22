package dk.cosby.cph.test.cucumber;

import dk.cosby.cph.test.RomanNumeralConverter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class RomanNumeralConverterStepDefinitions {

    private int arabicNumeral;
    private String actual;

    @Given("a positive number {int}")
    public void aPositiveNumberInteger(int arabicNumeral) {
        this.arabicNumeral = arabicNumeral;
    }

    @Given("a negative number <integer>")
    public void aNegativeNumberInteger(int arabicNumeral) {
        this.arabicNumeral = arabicNumeral;
    }

    @When("converting to roman numerals")
    public void convertingToRomanNumerals() {
        actual = RomanNumeralConverter.convert(arabicNumeral);
    }

    @Then("the result should be {string}")
    public void theResultShouldBeRomanNumeral(String expected) {
        assertEquals(expected, actual);
    }

    @Then("the result should be <roman numeral>")
    public void theResultShouldBeErrorMessage(String expected) {

    }
}
