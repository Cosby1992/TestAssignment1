package dk.cosby.cph.test;

/**
 *  This class contains code to convert fahrenheit to celsius.
 *
 * @author Anders, Dmitro, Ditlev
 */

public class TemperatureConverter {

    private static final double conversionConstant = 5.0/9.0;
    private static final double fahrenheitOffset = 32;

    /**
     * This method converts a fahrenheit temperature to celsius temperature.
     * It rounds the results to two decimals before returning
     * @param fahrenheit The fahrenheit temperature to be converted
     * @return The converted temperature as celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit){

        // calculate the celsius temperature from the fahrenheit input
        double celsiusNotRounded = (fahrenheit - fahrenheitOffset) * conversionConstant;

        // round the celsius temperature to two decimals and return the result
        return Math.round(celsiusNotRounded * 100.0) / 100.0;
    }

}
