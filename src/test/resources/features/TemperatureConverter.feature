
  Feature: Temperature Converter

    The formula for converting fahrenheit to celsius is (°F − 32) × 5/9 = °C

    Scenario Outline: Convert fahrenheit to Celsius
      Given a <fahrenheit temp>
      When Converting to celsius
      Then the result should be <celsius temp>
      Examples:
        | fahrenheit temp | celsius temp |
        | -459.67         | -273.15      |
        | -30.0           | -34.44       |
        | -10.0           | -23.33       |
        | 0.0             | -17.78       |
        | 10.0            | -12.22       |
        | 32.0            | 0.0          |
        | 40.0            | 4.44         |
        | 50.0            | 10.0         |
        | 60.0            | 15.56        |
        | 70.0            | 21.11        |
        | 500.0           | 260.0        |
        | 1000.0          | 537.78       |
        | 1000000.0       | 555537.78    |
        | 10000000.0      | 5555537.78   |


