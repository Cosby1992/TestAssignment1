package dk.cosby.cph.test;

/**
 *  This class contains code to convert fahrenheit to celsius.
 *  The formula for converting Fahrenheit to Celsius is (°F − 32) × 5/9 = °C
 *
 * @author Anders, Dmitro, Ditlev
 */

public class TemperatureConverter {

    private static final double CONVERSION_FACTOR = 5.0/9.0;
    private static final double TEMP_OFFSET = 32;

    /**
     * This method converts a Fahrenheit temperature to Celsius temperature.
     * It rounds the results to two decimals before returning
     * @param fahrenheit The Fahrenheit temperature to be converted
     * @return The converted temperature as Celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit){

        // calculate the celsius temperature from the fahrenheit input
        double celsiusNotRounded = (fahrenheit - TEMP_OFFSET) * CONVERSION_FACTOR;

        // round the celsius temperature to two decimals and return the result
        return Math.round(celsiusNotRounded * 100.0) / 100.0;
    }

    /**
     * This method converts a Celsius temperature to Fahrenheit temperature.
     * It rounds the results to two decimals before returning
     * @param celsius The Celsius temperature to be converted
     * @return The converted temperature as Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {

        // calculate the Fahrenheit temperature from the Celsius input
        double fahrenheitNotRounded = (celsius / CONVERSION_FACTOR) + TEMP_OFFSET;

        // round the Fahrenheit temperature to two decimals and return the result
        return Math.round(fahrenheitNotRounded * 100.0) / 100.0;

    }
}
