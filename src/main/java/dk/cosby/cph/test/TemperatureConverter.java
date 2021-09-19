package dk.cosby.cph.test;


public class TemperatureConverter {

    public static double fahrenheitToCelsius(double fahrenheit){

        double celsiusNotRounded = (fahrenheit - 32.0) * (5.0/9.0);

        return Math.round(celsiusNotRounded * 100.0) / 100.0;
    }

}
