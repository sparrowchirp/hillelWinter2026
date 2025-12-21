package com.app.hw03;

public class ConverterTemperature {
    static void main() {
        System.out.println("Converter Temperature");

        double temperatureCelsius = 90;
        double temperatureFahrenheit = 200;

        System.out.println(temperatureCelsius + "°C is " + convToFahrenheit(temperatureCelsius));
        System.out.println( temperatureFahrenheit + "°F is " + convToCelsius(temperatureFahrenheit));
    }

    private static double convToCelsius(double temperatureFahrenheit) {
        return ((temperatureFahrenheit - 32) * 5 / 9);
    }

    private static double convToFahrenheit(double temperatureCelsius) {
        return (temperatureCelsius * 1.8 + 32);
    }
}
